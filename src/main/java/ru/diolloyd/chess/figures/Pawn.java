package ru.diolloyd.chess.figures;

import ru.diolloyd.chess.ChessFigure;
import ru.diolloyd.chess.Player;
import ru.diolloyd.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends ChessFigure {
    public Pawn(Player player) {
        super(player, (player == Player.WHITE ? "White Pawn" : "Black Pawn"));
    }

    @Override
    public Set<Position> getAvailableMoves(Position position) {
        Set<Position> availableMoves = new HashSet<>();
        if (position.getY() == 1 || position.getY() == 8) {
            return availableMoves;
        }
        if (getPlayer() == Player.WHITE) {
            if (position.getY() == 2) {
                availableMoves.add(position.shift(0, 2));
            }
            availableMoves.add(position.shift(0, 1));
        } else {
            if (position.getY() == 7) {
                availableMoves.add(position.shift(0, -2));
            }
            availableMoves.add(position.shift(0, -1));
        }
        return availableMoves;
    }
}
