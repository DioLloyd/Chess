package ru.diolloyd.chess.figures;

import ru.diolloyd.chess.ChessFigure;
import ru.diolloyd.chess.Player;
import ru.diolloyd.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Queen extends ChessFigure {
    public Queen(Player player) {
        super(player, "Queen");
    }

    @Override
    public Set<Position> getAvailableMoves(Position position) {
        Set<Position> availableMoves = new HashSet<>();
        for (int i = 1; i < 8; i++) {
            availableMoves.add(position.shift(0, i));
            availableMoves.add(position.shift(0, -i));
            availableMoves.add(position.shift(i, 0));
            availableMoves.add(position.shift(-i, 0));
            availableMoves.add(position.shift(i, i));
            availableMoves.add(position.shift(i, -i));
            availableMoves.add(position.shift(-i, -i));
            availableMoves.add(position.shift(-i, i));
        }
        availableMoves.remove(null);
        return availableMoves;
    }
}
