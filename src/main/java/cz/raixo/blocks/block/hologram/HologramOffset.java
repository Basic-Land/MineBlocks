package cz.raixo.blocks.block.hologram;

public record HologramOffset(double x, double y, double z) {
    public boolean isEmpty() {
        return x == 0 && y == 0 && z == 0;
    }
}
