package kz.kassayev.arrbubble;

import kz.kassayev.arrbubble.array.Sorter;

import java.util.Scanner;
/* Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).*/
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sorter sorter = new Sorter(input);
        sorter.sorterOfColumn();
    }
}
