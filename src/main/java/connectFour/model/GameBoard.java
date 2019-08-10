package connectFour.model;

import java.awt.*;
import java.util.*;

public class GameBoard extends Observable implements Observer {

    private boolean playerTurn;
    private char[][] board = new char[BOARD_HEIGHT][BOARD_WIDTH];
    private static final int BOARD_HEIGHT = 6;
    private static final int BOARD_WIDTH = 7;
    private int draw = 0;
    private Color sbg;

    public GameBoard() {
        this.playerTurn = true; // Player begins by default... for now
    }

    /**
     * Get the width of the board
     * @return an integer denoting the amount of columns on the board.
     */
    public int getBoardWidth() {
        return BOARD_WIDTH;
    }

    /**
     * Get the height of the board
     * @return an integer denoting the amount of rows on the board.
     */
    public int getBoardHeight() {
        return BOARD_HEIGHT;
    }

    public void setArrayPosition(int row, int col) {
        if (playerTurn) {
            board[row][col] = 'X';
        } else {
            board[row][col] = 'O';
        }
    }

    public void printAll() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public char[][] getBoard() {
        return board;
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
        refresh();
    }

    /**
     * Get whether it is the player's turn.
     *
     * @return playerTurn which is true if it is the player's turn.
     */
    public boolean isPlayerTurnI() {
        return playerTurn;
    }

    public String getCheckerColor() {
        if (this.playerTurn) {
            return "Red";
        }
        return"Orange";
    }

    public void drawChecker(int i){
        draw = draw + i;
    }


    @Override
    public void update(Observable o, Object arg) {
        refresh();
    }

    public void setBoard(int column){
        int i = 5;

        while(true){
            if (board[i][column] == 'X' || board[i][column] == 'O'){
                i--;
            } else{
                break;
            }
        }
        setArrayPosition(i,column);
    }

    public boolean boardRowChecker() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH - 3; j++) {
                if (this.board[i][j] == 'X' && this.board[i][j + 1] == 'X' && this.board[i][j + 2] == 'X' && this.board[i][j + 3] == 'X') {
                    return true;
                } else if (this.board[i][j] == 'O' && this.board[i][j + 1] == 'O' && this.board[i][j + 2] == 'O' && this.board[i][j + 3] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean boardColumnChecker() {
        for (int j = 0; j < BOARD_WIDTH; j++) {
            for (int i = 0; i < BOARD_HEIGHT - 3; i++) {
                if (this.board[i][j] == 'X' && this.board[i + 1][j] == 'X' && this.board[i + 2][j] == 'X' && this.board[i + 3][j] == 'X') {
                    return true;
                } else if (this.board[i][j] == 'O' && this.board[i + 1][j] == 'O' && this.board[i + 2][j] == 'O' && this.board[i + 3][j] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean boardAscendingDiagonalCheck() {
        for (int i=3; i < BOARD_WIDTH - 1; i++){
            for (int j=0; j<BOARD_HEIGHT-2; j++){
                if (this.board[i][j] == 'X' && this.board[i-1][j+1] == 'X' && this.board[i-2][j+2] == 'X' && this.board[i-3][j+3] == 'X') {
                    return true;
                } else if (this.board[i][j] == 'O' && this.board[i-1][j+1] == 'O' && this.board[i-2][j+2] == 'O' && this.board[i-3][j+3] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean boardDecendingDiagonalCheck() {
        for (int i=3; i< BOARD_WIDTH - 1; i++){
            for (int j=3; j<BOARD_HEIGHT ; j++){
                if (this.board[i][j] == 'X' && this.board[i-1][j-1] == 'X' && this.board[i-2][j-2] == 'X' && this.board[i-3][j-3] == 'X') {
                    return true;
                } else if (this.board[i][j] == 'O' && this.board[i-1][j-1] == 'O' && this.board[i-2][j-2] == 'O' && this.board[i-3][j-3] == 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    private void refresh() {
        setChanged();
        notifyObservers();
    }

    public int getdrawChecker() {
        return draw;
    }

    public Color getSbg() {
        return sbg;
    }

    public void setSbg(Color color){
        this.sbg = color;
        refresh();
    }
}

