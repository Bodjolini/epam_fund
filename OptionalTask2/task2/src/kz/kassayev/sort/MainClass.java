package kz.kassayev.sort;

import kz.kassayev.sort.bubble.Sort;

import java.util.Scanner;

/* Вывести числа в порядке возрастания (убывания) значений их длины.*/
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sort sort = new Sort(input);
        sort.sorter();
    }
}