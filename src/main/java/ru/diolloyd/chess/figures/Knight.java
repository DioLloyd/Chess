package ru.diolloyd.chess.figures;

import ru.diolloyd.chess.ChessFigure;
import ru.diolloyd.chess.Player;
import ru.diolloyd.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Knight extends ChessFigure {

    public Knight(Player player) {
        super(player, "Knight");
    }

    @Override
    public Set<Position> getAvailableMoves(Position position) {
        Set<Position> availableMoves = new HashSet<>();
        availableMoves.add(position.shift(+1, +2));
        availableMoves.add(position.shift(+2, +1));
        availableMoves.add(position.shift(-1, +2));
        availableMoves.add(position.shift(-2, +1));
        availableMoves.add(position.shift(-1, -2));
        availableMoves.add(position.shift(-2, -1));
        availableMoves.add(position.shift(+1, -2));
        availableMoves.add(position.shift(+2, -1));
        availableMoves.remove(null);
        return availableMoves;
    }
}
