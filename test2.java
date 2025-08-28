package test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        Random generator = new Random();
        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int randomnum = generator.nextInt(10);
                arr[i][j] = randomnum;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
