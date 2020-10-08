/**
 * <h1> TicTacToe </h1>
 * <p>
 *
 * Tic Tac Toe game.
 * play with two players.
 * first player who makes three consecutive shapes is winner.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac TicTacToe.java
 * @Run : java TicTacToe
 * Programming Assignment 8.
 * @since 05-29-2020
 */
package Homework5;

import java.util.Scanner;

public class TicTacToe { //create class, TicTacToe

    private char[][] board; //array of char type.

    public char currentPlayerMark; // variable of char type.

    private static Scanner sc;


    public TicTacToe() {//constructor don't have a parameter.

        board = new char[3][3];

        currentPlayerMark = 'x';

        initializeBoard();

    }


    public void initializeBoard() {// to make game board
        //game board have 3 x 3 spaces.
        //'-' means empty space.
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                board[i][j] = '-';

            }

        }

    }


    public void printBoard() {// to print the space where user input

        System.out.println("-------------");


        for (int i = 0; i < 3; i++) {

            System.out.print("| ");

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " | ");

            }

            System.out.println();

            System.out.println("-------------");

        }

    }


    public boolean isBoardFull() {// when player has a draw.

        boolean isFull = true;


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == '-') {

                    isFull = false;

                }

            }

        }


        return isFull;

    }


    public boolean checkForWin() {

        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin()); //행두, 열 또는 다이아몬드에서 승리하면 게임 승리.

    }

    private boolean checkRowsForWin() { //win at row

        for (int i = 0; i < 3; i++) {

            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {

                return true;

            }

        }

        return false;

    }

    private boolean checkColumnsForWin() {//win at column.

        for (int i = 0; i < 3; i++) {

            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {

                return true;

            }

        }

        return false;

    }

    private boolean checkDiagonalsForWin() {

        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

    }

    private boolean checkRowCol(char c1, char c2, char c3) {

        return ((c1 != '-') && (c1 == c2) && (c2 == c3));

    }


// Change player marks back and forth.

    public void playerChange() {//change first turn.

        if (currentPlayerMark == 'x') {

            currentPlayerMark = 'o';

        } else {

            currentPlayerMark = 'x';

        }

    }

    public boolean play(int row, int col) { // play method of boolean type have two parameters with int.

        if ((row >= 0) && (row < 3)) {

            if ((col >= 0) && (col < 3)) {

                if (board[row][col] == '-') { // '-' 자리가 있는 곳에 입력.

                    board[row][col] = currentPlayerMark;

                    return true;

                }

            }

        }
        System.out.println("you enter wrong location!"); // to show player enter O or X at the wrong location.
        return false;

    }


    public static void main(String[] args) { //main method.

        TicTacToe game = new TicTacToe(); // create object

        sc = new Scanner(System.in); //create scanner object.

        while (true) {

            System.out.println("Turn for " + game.currentPlayerMark + " player\nEnter location (row column): ");
            System.out.println("(If you enter wrong location, you will lose your turn.)");

            int x = sc.nextInt();

            int y = sc.nextInt();

            game.play(x, y); //input number from user at play method.

            game.printBoard(); //to show game board after input number.

            if (game.checkForWin()) {

                System.out.println("Congrats! " + game.currentPlayerMark + " wins!!");
                System.out.println("Do you wanna play new game? \n Put : 88 -> YES , put any number -> NO");
                if (sc.nextInt() == 88) {
                    game.initializeBoard(); //Play new game.

                    continue;
                } else {
                    return;
                }


            } else if (game.isBoardFull()) {

                System.out.println("Appears we have a draw!");

                return;
            }
            game.playerChange();


        }

    }


}
