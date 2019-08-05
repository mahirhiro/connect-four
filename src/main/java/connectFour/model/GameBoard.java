package connectFour.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class GameBoard extends Observable implements Observer {

    private boolean playerTurn;
    private List<Checker> checkers = new ArrayList<>();

    public GameBoard() {
        this.playerTurn = true; // Player begins by default... for now
    }

    /*  Do you ever start a game with checkers already in place?
    public GameBoard(List<Checker> checkers) {
        this.checkers = checkers;
    }  */

    /**
     * End a turn by flipping the boolean that represents whose turn it is.
     */
    public void endTurn() {
        this.playerTurn = !playerTurn;
    }

    /**
     * Get whether it is the player's turn.
     * @return playerTurn which is true if it is the player's turn.
     */
    public boolean isPlayerTurnI() {
        return playerTurn;
    }

    public Color getCheckerColor() {
        if(this.playerTurn){
            return Color.RED;
        }
        return Color.ORANGE;
    }

    public void setCheckerColor(Color checkerColor) {
        this.checkerColor = checkerColor;
    }

    private Color checkerColor = Color.BLACK;

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    private char[][] board = new char[6][7];


    public void addChecker(Checker checker){
        checker.add(checker);
        refresh();
    }

    public void refresh(){
        setChanged();
        notifyObservers();
    }


    @Override
    public void update(Observable o, Object arg) {
        refresh();
    }
    public List<Checker> getCheckers() {
        Checker c = new Checker();
        checkers.add(c);
        return checkers;
    }

}
