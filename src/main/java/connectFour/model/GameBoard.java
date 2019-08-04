package connectFour.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class GameBoard extends Observable implements Observer {

    public GameBoard() {
    }

    public GameBoard(List<Checker> checkers) {
        this.checkers = checkers;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    private int i = 0;
    private List<Checker> checkers = new ArrayList<>();

    public Color getCheckerColor() {
        if(i % 2 == 0){
            return Color.red;
        } else {
            return Color.orange;
        }
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
