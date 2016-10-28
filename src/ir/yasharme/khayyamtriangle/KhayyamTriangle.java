/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.yasharme.khayyamtriangle;

import java.util.Scanner;

/**
 *
 * @author yashar
 */
public class KhayyamTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter Level: ");
        Scanner in = new Scanner(System.in);
        int level = in.nextInt();
        int board[][] = initBoard(level);
        printBoard(board);

    }

    private static int[][] initBoard(int level) {
        int board[][] = new int[level][];
        for (int i = 0; i < level; i++) {
            board[i] = new int[i + 1];
            board[i][0] = board[i][i] = 1;
            if (i >= 1) {
                for (int j = 1; j < i; j++) {
                    board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
                }
            }
        }
        return board;
    }
    
    private static void printBoard(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
