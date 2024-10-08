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

/*

  мог ходить только буквой «Г».
 Если конь может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше), то функция вернет true, иначе — false
 */

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверяем, не находится ли пешка в той же точке
        if (line == toLine && column == toColumn) {
            return false;
        }
        // Проверяем, не выходит ли пешка за пределы доски
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }

        // Проверям может ли ходить пешка буквой "Г"
        if (getColor().equals("White")) {
            if (toLine > line) { // Белая пешка ходит вверх
                // Проверяем, первый ли ход (на 2 клетки)
                if (line == 1 && toLine == 3 && column == toColumn) {
                    return true;
                }
                // Проверяем, обычный ли ход (на 1 клетку)
                if (toLine == line + 1 && column == toColumn) {
                    return true;
                }
            } else {
                return false; // Белая пешка не может ходить назад
            }
        } else { // Черная пешка
            if (toLine < line) { // Черная пешка ходит вниз
                // Проверяем, первый ли ход (на 2 клетки)
                if (line == 6 && toLine == 4 && column == toColumn) {
                    return true;
                }
                // Проверяем, обычный ли ход (на 1 клетку)
                if (toLine == line - 1 && column == toColumn) {
                    return true;
                }
            } else {
                return false; // Черная пешка не может ходить назад
            }
        }

        return false; // Если не выполняется ни одно из условий, ход невозможен
    }



    @Override
    public String getSymbol() {
        return "H";
    }
}

