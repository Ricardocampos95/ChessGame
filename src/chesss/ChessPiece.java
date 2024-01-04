package chesss;

import board.Board;
import board.Piece;
import board.Position;

public class ChessPiece extends Piece {

    private Color color;
    private Integer moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }





}
