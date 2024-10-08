package org.example.chess_pieces;

import org.example.ChessBoard;

public abstract class ChessPiece {
    private String color;
    private boolean check;

    public ChessPiece(String color) {
        this.color = color;
        check = true;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard,
                                              int line,
                                              int column,
                                              int toLine, int toColumn);

    public abstract String getSymbol();

    public String getColor() {
        return color;
    }

    public boolean isCheck() {
        return check;
    }

}
