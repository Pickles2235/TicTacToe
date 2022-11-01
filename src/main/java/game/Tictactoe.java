package game;

import java.util.concurrent.ThreadLocalRandom;

public class Tictactoe extends IO implements Game  {

    private String[] tttBoard;
    private Player[] players;
    private int currplyr;

    public Tictactoe() {
        genBrd();
        getPlayers();
        currplyr = ThreadLocalRandom.current().nextInt((2 - 1) + 1) + 1;
    }

    @Override
    public void start() {

    }

    private void genBrd(){
        tttBoard = new String[9];
        for (int i = 0; i < tttBoard.length; i++) {
            tttBoard[i] = "*";
        }
    }

    private void getPlayers() {
        players = new Player[2];
        players[0] = new Player(prompt("Input player 1's name"));
        players[1] = new Player(prompt("Input player 2's name"));
    }
}
