package chess.pieces;

import board.Board;
import chesss.ChessPiece;
import chesss.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
