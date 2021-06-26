package ru.diolloyd.chess;

import java.util.Set;

public abstract class ChessFigure {
    private Player player;
    private String name;

    public abstract Set<Position> getAvailableMoves(Position position);

    public ChessFigure(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }
}
