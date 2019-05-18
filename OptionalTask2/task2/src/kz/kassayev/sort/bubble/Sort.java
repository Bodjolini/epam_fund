package kz.kassayev.sort.bubble;

import java.util.Scanner;

public class Sort {
    Scanner input;

    public Sort(Scanner input) {
        this.input = input;
    }

    public void sorter() {

        System.out.println("How many numbers do you want to write? ");
        //задем размер и просим ввести числа в массив
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Input numbers : ");
        //заполняем массив
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        //сортируем пузырьком
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        //по возрастанию
        System.out.println("Sorted asc : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //по убыванию
        System.out.println("Sorted desc : ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}