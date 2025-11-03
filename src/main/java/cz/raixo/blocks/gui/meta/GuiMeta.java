package cz.raixo.blocks.gui.meta;

import cz.raixo.blocks.gui.Gui;
import cz.raixo.blocks.gui.filler.GuiFiller;
import cz.raixo.blocks.gui.type.InventoryType;
import net.kyori.adventure.text.Component;

public record GuiMeta<F extends GuiFiller<F>>(F filler, Component title, InventoryType type) {

    public GuiMeta<F> withParent(Gui<F> parent) {
        return new GuiMeta<>(filler.withParent(parent, this), title, type);
    }

}
