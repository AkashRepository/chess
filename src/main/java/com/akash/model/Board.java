package com.akash.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Board {

    private List<List<Spot>> spots;

    public Board() {
        reset();
    }

    public void reset() {
        // init the board with default places;
    }

    public Spot getSpot(int startX, int startY) {
        return spots.get(startX).get(startY);
    }
}
