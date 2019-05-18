package kz.kassayev.ulken.combination;

import java.util.Scanner;

public class Combi {
    Scanner input;

    public Combi(Scanner input) {
        this.input = input;
    }

    public void Combinator() {
        //создаю массив

        int[][] arr = new int[5][5];
        int max = 0;
        int[] result = new int[2];
        int[] start = new int[10];
        int[] stage = new int[10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) Math.round((Math.random() * 200) - 100);
            }
        }
        //вывожу его
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        result[1] = 0;
        result[0] = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j != 4) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        if (max == 0) {
                            start[0] = i;
                            start[1] = j;
                        }
                        max++;
                    } else {
                        if (max != 0 && max > result[0]) {
                            result[0] = max;
                            stage[0] = start[0];
                            stage[1] = start[1];
                        }
                        max = 0;
                    }
                } else {
                    if (arr[i][j] > arr[i + 1][0]) {
                        max++;
                        if (max == 0) {
                            start[0] = i;
                            start[1] = j;
                        }
                    } else {
                        if (max != 0 && max > result[0]) {
                            result[0] = max;
                            stage[0] = start[0];
                            stage[0] = start[1];
                        }
                        max = 0;
                    }
                }
            }
        }
        max = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j != 4) {
                    if (arr[i][j] < arr[i][j + 1]) {
                        if (max == 0) {
                            start[2] = i;
                            start[3] = j;
                        }
                        max++;
                    } else {
                        if (max != 0 && max > result[1]) {
                            result[1] = max;
                            stage[2] = start[2];
                            stage[3] = start[3];
                        }
                        max = 0;
                    }
                } else {
                    if (arr[i][j] < arr[i + 1][0]) {
                        max++;
                        if (max == 0) {
                            start[2] = i;
                            start[3] = j;
                        }
                    } else {
                        if (max != 0 && max > result[1]) {
                            result[1] = max;
                            stage[2] = start[2];
                            stage[3] = start[3];
                        }
                        max = 0;
                    }
                }
            }
        }
        if (result[0] >= result[1]) {
            System.out.println("Combination : " + result[0] + 1);
            System.out.println("i = " + stage[0]);
            System.out.println("j = " + stage[1]);
        } else {
            System.out.println("Combination : " + result[1] + 1);
            System.out.println("i = " + stage[2]);
            System.out.println("j = " + stage[3]);
        }
    }
}
