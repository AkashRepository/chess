package com.akash.model;

import lombok.Getter;

@Getter
public class Player {

    private boolean isWhite;

    public  Player(boolean isWhite){this.isWhite= isWhite;}
}
