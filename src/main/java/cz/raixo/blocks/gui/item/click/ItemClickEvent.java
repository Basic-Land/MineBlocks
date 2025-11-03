package cz.raixo.blocks.gui.item.click;

import cz.raixo.blocks.gui.item.GuiItem;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public record ItemClickEvent<T>(Player player, GuiItem<T> guiItem, ClickType type, int slot, ItemStack cursorItem) {

}
