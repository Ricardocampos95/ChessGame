package chess.pieces;

import board.Board;
import chesss.ChessPiece;
import chesss.Color;

public class Bishop extends ChessPiece {


    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }
}
