package org.example.chess_pieces;

import org.example.ChessBoard;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }



    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверяем, не находится ли слон в той же точке
        if (line == toLine && column == toColumn) {
            return false;
        }
        // Проверяем, не выходит ли конь за пределы доски
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }

        // Проверяем может ли ходить конь буквой "Г"
        if ((Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 1) ||
                Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 2) {
            return true;
        }
        return false; // Если не выполняется ни одно из условий, ход невозможен
    }


    @Override
    public String getSymbol() {
        return "H";
    }
}

