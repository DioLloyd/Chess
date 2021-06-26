package ru.diolloyd.chess.figures;

import ru.diolloyd.chess.ChessFigure;
import ru.diolloyd.chess.Player;
import ru.diolloyd.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Bishop extends ChessFigure {
    public Bishop(Player player) {
        super(player, "Bishop");
    }

    @Override
    public Set<Position> getAvailableMoves(Position position) {
        Set<Position> availableMoves = new HashSet<>();
        for (int i = 1; i < 8; i++) {
            availableMoves.add(position.shift(i, i));
            availableMoves.add(position.shift(i, -i));
            availableMoves.add(position.shift(-i, -i));
            availableMoves.add(position.shift(-i, i));
        }
        availableMoves.remove(null);
        return availableMoves;
    }
}
