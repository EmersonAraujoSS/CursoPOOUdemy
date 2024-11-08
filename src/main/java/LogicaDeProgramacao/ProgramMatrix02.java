package LogicaDeProgramacao;

import java.util.Scanner;

public class ProgramMatrix02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + ", " + j + ":");
                    if (j > 0){
                        System.out.print("Left: " + matrix[i][j-1]);
                    }if (i > 0){
                        System.out.print("Up: " + matrix[i-1][j]);
                    }if (j < matrix[i].length-1){
                        System.out.print("Right: " + matrix[i][j+1]);
                    }if (i < matrix.length-1){
                        System.out.print("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
