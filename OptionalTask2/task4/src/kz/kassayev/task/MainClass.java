package kz.kassayev.task;

import kz.kassayev.task.samechar.Same;

import java.util.Scanner;

/*Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.*/
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Same same = new Same(input);
        same.findSameChar();
    }
}