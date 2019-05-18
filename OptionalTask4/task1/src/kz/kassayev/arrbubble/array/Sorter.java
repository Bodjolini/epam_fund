package kz.kassayev.arrbubble.array;

import java.util.Scanner;

public class Sorter {
    Scanner input;

    public Sorter(Scanner input) {
        this.input = input;
    }

    public void sorterOfColumn(){
	//создаю массив
        System.out.println("Enter size of matrix");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) Math.round((Math.random() * 200) - 100);
            }
        }
	//вывожу его
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Choose column : ");
	//выбираю столбец по которому буду сортировать
        int column = input.nextInt();
        column--;
        int tmp;
	//делаю сортировку
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (arr[i][column] > arr[k][column]){
                    for (int j = 0; j < n; j++) {
                        tmp = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = tmp;
                    }
                }
            }
        }
	//вывожу отсортированный массив
        System.out.println("Sorted array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
