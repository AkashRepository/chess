package com.akash.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Piece {
    private boolean isKilled;
    private boolean isWhite;

    protected abstract boolean canMove(Board board, Spot start, Spot end);
}
