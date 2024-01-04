package chess.pieces;

import board.Board;
import chesss.ChessPiece;
import chesss.Color;

public class Pawn extends ChessPiece {


    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "P";
    }
}
