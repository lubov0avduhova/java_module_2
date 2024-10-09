package org.example.chess_pieces;

import org.example.ChessBoard;

public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверяем, не находится ли ферзь в той же точке
        if (line == toLine && column == toColumn) {
            return false;
        }

        // Проверяем, не выходит ли ферзь за пределы доски
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }

        // Проверяем может ли ходить ферзь по диагонали
        if (toLine - line == toColumn - column) {
            return true;
        }

        // Проверяем может ли ходить ферзь по прямой
        if (toLine == line || toColumn == column) {
            return true;
        }
        return false; // Если не выполняется ни одно из условий, ход невозможен
    }


    @Override
    public String getSymbol() {
        return "Q";
    }
}

