package com.akash.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private Player[] players;
    private List<Move> moves;
    private Player currentPlayer;
    private GameStatus gameStatus;

    public Game(){
        this.players = new Player[]{ new Player(true), new Player(false)};
        this.moves = new ArrayList<>();
        this.gameStatus = GameStatus.ACTIVE;
        this.currentPlayer = this.players[0];
    }

    public boolean move(Player player, int startX, int startY, int endX, int endY){
        Spot start = board.getSpot(startX, startY);
        Spot end = board.getSpot(endX, endY);
        if(start==null || end==null)
            return false;
        if(player != currentPlayer)
            return false;
        if(player.isWhite() != start.getPiece().isWhite())
            return false;
        Move move = new Move(player, start, end);
        if(start.getPiece().canMove(board, start, end)){
            moves.add(move);
            Piece endPiece = end.getPiece();
            end.setPiece(start.getPiece());
            start.setPiece(null);

            if(endPiece!=null){
                endPiece.setKilled(true);
                if(endPiece instanceof King){
                    gameStatus = player.isWhite() ? GameStatus.WHITE_WIN : GameStatus.BLACK_WIN;
                }
            }
            if(players[0] == player){
                currentPlayer = players[1];
            } else {
                currentPlayer = players[0];
            }
            return true;
        }
        return false;

    }
}
