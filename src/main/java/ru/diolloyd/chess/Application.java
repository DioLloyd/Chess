package ru.diolloyd.chess;

import org.apache.commons.lang3.StringUtils;
import ru.diolloyd.chess.figures.*;

import java.util.Set;

public class Application {

    public static void main(String[] args) {
        King kingWhite = new King(Player.WHITE);
        Position kingPosition = Position.create('A', 1);
        Set<Position> kingMoves = kingWhite.getAvailableMoves(kingPosition);
        printMoves(kingMoves, kingWhite.getName(), kingPosition);

        Knight knightBlack = new Knight(Player.BLACK);
        Position knightPosition = Position.create('A', 1);
        printMoves(knightBlack.getAvailableMoves(knightPosition), knightBlack.getName(), knightPosition);

        Bishop bishopWhite = new Bishop(Player.WHITE);
        Position bishopPosition = Position.create('A', 1);
        Set<Position> bishopMoves = bishopWhite.getAvailableMoves(bishopPosition);
        printMoves(bishopMoves, bishopWhite.getName(), bishopPosition);

        Rook rookBlack = new Rook(Player.BLACK);
        Position rookPosition = Position.create('A', 1);
        Set<Position> rookMoves = rookBlack.getAvailableMoves(rookPosition);
        printMoves(rookMoves, rookBlack.getName(), rookPosition);

        Queen queenWhite = new Queen(Player.WHITE);
        Position queenPosition = Position.create('D', 4);
        Set<Position> queenMoves = queenWhite.getAvailableMoves(queenPosition);
        printMoves(queenMoves, queenWhite.getName(), queenPosition);

        Pawn pawnBlack = new Pawn(Player.BLACK);
        Position pawnBlackPosition = Position.create('C', 5);
        Set<Position> pawnBlackMoves = pawnBlack.getAvailableMoves(pawnBlackPosition);
        printMoves(pawnBlackMoves, pawnBlack.getName(), pawnBlackPosition);

        Pawn pawnWhite = new Pawn(Player.WHITE);
        Position pawnWhitePosition = Position.create('C', 2);
        Set<Position> pawnWhiteMoves = pawnWhite.getAvailableMoves(pawnWhitePosition);
        printMoves(pawnWhiteMoves, pawnWhite.getName(), pawnWhitePosition);
    }

    public static void printMoves(Set<Position> availableMoves, String name, Position position) {
        String tempPositions = StringUtils.join(availableMoves, ", ");
        System.out.println(name + " (" + position + "): " + tempPositions);
    }
}
