package com.akash.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Spot {
    private int x;
    private int y;
    private Piece piece;
}
