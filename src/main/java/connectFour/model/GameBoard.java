package connectFour.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class GameBoard extends Observable implements Observer {

    private List<Checker> checkers = new ArrayList<>();

    public Color getCheckerColor() {
        return checkerColor;
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

    public GameBoard(List<Checker> checkers) {
        this.checkers = checkers;

    }
    public GameBoard() {

    }


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

    }
    public List<Checker> getCheckers() {
        return checkers;
    }

}
