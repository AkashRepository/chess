package com.akash.model;

public class King extends Piece {
    @Override
    protected boolean canMove(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite())
            return false;

        if ( Math.abs(start.getX() - end.getX()) +
                Math.abs(start.getY() - end.getY()) == 1)
            return true;
        // check for castling
        return false;
    }
}
