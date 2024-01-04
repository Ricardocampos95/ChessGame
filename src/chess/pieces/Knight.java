package chess.pieces;

import board.Board;
import chesss.ChessPiece;
import chesss.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }
}
