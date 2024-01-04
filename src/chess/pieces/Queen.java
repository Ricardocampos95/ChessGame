package chess.pieces;

import board.Board;
import chesss.ChessPiece;
import chesss.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }
}
