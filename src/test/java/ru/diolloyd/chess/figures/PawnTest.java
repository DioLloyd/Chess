package ru.diolloyd.chess.figures;

import org.junit.jupiter.api.Test;
import ru.diolloyd.chess.Player;
import ru.diolloyd.chess.Position;

import java.util.HashSet;
import java.util.Set;

import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PawnTest {

    @Test
    void whitePawnInitialPosition() {
        char x = 'A';
        Pawn pawnWhite = new Pawn(Player.WHITE);
        Position pawnWhitePosition = Position.create(x, 2);
        Set<Position> actualMoves = pawnWhite.getAvailableMoves(pawnWhitePosition);
        Set<Position> expectedMoves = new HashSet<>();
        expectedMoves.add(Position.create(x, 3));
        expectedMoves.add(Position.create(x, 4));
        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    void whitePawnLastPosition() {
        char x = 'B';
        Pawn pawnWhite = new Pawn(Player.WHITE);
        Position pawnWhitePosition = Position.create(x, 8);
        Set<Position> actualMoves = pawnWhite.getAvailableMoves(pawnWhitePosition);
        assertEquals(emptySet(), actualMoves);
    }

    @Test
    void whitePawnImpossiblePosition() {
        char x = 'C';
        Pawn pawnWhite = new Pawn(Player.WHITE);
        Position pawnWhitePosition = Position.create(x, 1);
        Set<Position> actualMoves = pawnWhite.getAvailableMoves(pawnWhitePosition);
        assertTrue(actualMoves.isEmpty());
    }

    @Test
    void whitePawnMiddlePosition() {
        char x = 'D';
        Pawn pawnWhite = new Pawn(Player.WHITE);
        Position pawnWhitePosition = Position.create(x, 5);
        Set<Position> actualMoves = pawnWhite.getAvailableMoves(pawnWhitePosition);
        Set<Position> expectedMoves = new HashSet<>();
        expectedMoves.add(Position.create(x, 6));
        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    void blackPawnInitialPosition() {
        char x = 'E';
        Pawn pawnBlack = new Pawn(Player.BLACK);
        Position pawnBlackPosition = Position.create(x, 7);
        Set<Position> actualMoves = pawnBlack.getAvailableMoves(pawnBlackPosition);
        Set<Position> expectedMoves = new HashSet<>();
        expectedMoves.add(Position.create(x, 6));
        expectedMoves.add(Position.create(x, 5));
        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    void blackPawnLastPosition() {
        char x = 'F';
        Pawn pawnBlack = new Pawn(Player.BLACK);
        Position pawnBlackPosition = Position.create(x, 1);
        Set<Position> actualMoves = pawnBlack.getAvailableMoves(pawnBlackPosition);
        assertEquals(emptySet(), actualMoves);
    }

    @Test
    void blackPawnImpossiblePosition() {
        char x = 'G';
        Pawn pawnBlack = new Pawn(Player.BLACK);
        Position pawnBlackPosition = Position.create(x, 8);
        Set<Position> actualMoves = pawnBlack.getAvailableMoves(pawnBlackPosition);
        assertEquals(emptySet(), actualMoves);
    }

    @Test
    void blackPawnMiddlePosition() {
        char x = 'H';
        Pawn pawnBlack = new Pawn(Player.BLACK);
        Position pawnBlackPosition = Position.create(x, 2);
        Set<Position> actualMoves = pawnBlack.getAvailableMoves(pawnBlackPosition);
        Set<Position> expectedMoves = new HashSet<>();
        expectedMoves.add(Position.create(x, 1));
        assertEquals(expectedMoves, actualMoves);
    }
}