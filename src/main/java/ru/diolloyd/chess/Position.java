package ru.diolloyd.chess;

import java.util.Objects;

public class Position {
    private char x;
    private int y;

    private Position(char x, int y) {
        this.y = y;
        this.x = x;
    }

    public static Position create(char x, int y) {
        if (x < 'A' || x > 'H' || y < 1 || y > 8) {
            return null;
        }
        return new Position(x, y);
    }

    public Position shift(int x, int y) {
        // B2, +1, +1
        return Position.create((char) (this.x + x), this.y + y);
    }

    @Override
    public String toString() {
        return x + "" + y;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
