package ru.diolloyd.chess.figures;

import ru.diolloyd.chess.ChessFigure;
import ru.diolloyd.chess.Player;
import ru.diolloyd.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class King extends ChessFigure {

    public King(Player player) {
        super(player, "King");
    }

    @Override
    public Set<Position> getAvailableMoves(Position position) {
        Set<Position> availableMoves = new HashSet<>();
        availableMoves.add(position.shift(+0, -1));
        availableMoves.add(position.shift(+0, +1));
        availableMoves.add(position.shift(-1, +0));
        availableMoves.add(position.shift(+1, +0));
        availableMoves.add(position.shift(-1, -1));
        availableMoves.add(position.shift(+1, +1));
        availableMoves.add(position.shift(-1, +1));
        availableMoves.add(position.shift(+1, -1));
        availableMoves.remove(null);
        return availableMoves;
    }
}
