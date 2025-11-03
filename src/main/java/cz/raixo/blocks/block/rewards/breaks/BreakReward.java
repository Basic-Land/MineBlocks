package cz.raixo.blocks.block.rewards.breaks;

import cz.raixo.blocks.block.playerdata.PlayerData;
import cz.raixo.blocks.block.rewards.Reward;
import cz.raixo.blocks.block.rewards.RewardType;
import cz.raixo.blocks.block.rewards.breaks.condition.BreakCondition;
import cz.raixo.blocks.block.rewards.commands.RewardCommands;
import cz.raixo.blocks.block.rewards.commands.RewardEntry;
import cz.raixo.blocks.block.rewards.context.RewardContext;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public record BreakReward(String name, BreakCondition condition,
                          RewardCommands<? extends RewardEntry> commands) implements Reward {

    @Override
    public RewardType getType() {
        return RewardType.BREAK;
    }

    @Override
    public boolean canGet(PlayerData player, RewardContext context) {
        if (condition == null) return true;
        return condition.test(player, context);
    }

    @Override
    public boolean isLast() {
        if (condition == null) return false;
        return condition.isLast();
    }
}
