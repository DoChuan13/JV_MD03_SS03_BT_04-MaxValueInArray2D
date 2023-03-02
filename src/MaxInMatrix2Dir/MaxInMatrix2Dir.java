package MaxInMatrix2Dir;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInMatrix2Dir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Array row: ");
        int row = input.nextInt();
        System.out.print("Input Array colum: ");
        int column = input.nextInt();
        double[][] arr2D = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Input element [%d][%d]: ", (i + 1), (j + 1));
                arr2D[i][j] = input.nextInt();
            }
        }
        System.out.println("Current Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%-20f", arr2D[i][j]);
            }
            System.out.println("");
        }
        double max = arr2D[0][0];
        int xLoc = 1, yLoc = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr2D[i][j] > max) {
                    max = arr2D[i][j];
                    xLoc = i + 1;
                    yLoc = j + 1;
                }
            }
        }
        System.out.printf("Max value in 2D Array is %f, at position [%d][%d]", max, xLoc, yLoc);
    }
}
