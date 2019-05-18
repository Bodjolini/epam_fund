package kz.kassayev.task.average;

import java.util.Scanner;

public class Avg {
    Scanner input;
    public Avg(Scanner input) {
        this.input = input;
    }

    public void array() {
        System.out.println("How many numbers do you want to write? ");
        //задем размер и простим ввести числа в массив
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Input numbers : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        //находим среднее число
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg += numbers[i];
        }
        avg/=numbers.length;
        System.out.println("avg : " + avg);
        //находим и выводим цифры которые больше средней величины
        System.out.println("numbers which bigger then avg :");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        ////находим и выводим цифры которые меньше средней величины
        System.out.println("numbers which less then avg : ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}