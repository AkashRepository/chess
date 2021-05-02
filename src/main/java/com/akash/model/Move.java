package com.akash.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Move {
    private Player player;
    private Piece killedPiece;
    private boolean isCastlingMove;
    private Spot start;
    private Spot end;

    public Move(Player player, Spot start, Spot end) {
        this.player = player;
        this.start = start;
        this.end = end;
    }
}
