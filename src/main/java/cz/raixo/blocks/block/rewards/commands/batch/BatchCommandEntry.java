package cz.raixo.blocks.block.rewards.commands.batch;

import cz.raixo.blocks.block.rewards.commands.RewardEntry;
import lombok.AllArgsConstructor;
import lombok.Getter;

public record BatchCommandEntry(String command) implements RewardEntry {
}