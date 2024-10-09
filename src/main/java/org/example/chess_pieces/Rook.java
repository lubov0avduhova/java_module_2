package org.example.chess_pieces;

import org.example.ChessBoard;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }



    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверяем, не находится ли пешка в той же точке
        if (line == toLine && column == toColumn) {
            return false;
        }
        // Проверяем, не выходит ли слон за пределы доски
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }

        // Проверяем может ли ходить ладья по прямой
        if (toLine==line || toColumn==column) {
            return true;
        }
        return false; // Если не выполняется ни одно из условий, ход невозможен
    }


    @Override
    public String getSymbol() {
        return "R";
    }
}

