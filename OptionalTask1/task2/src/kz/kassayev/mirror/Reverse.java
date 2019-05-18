package kz.kassayev.mirror;

import java.util.Scanner;

/*Отобразить в окне консоли аргументы командной строки в обратном порядке.*/
class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write any word || numbers: ");
        String str = input.nextLine(); //вводим нашу строку
        String reverse = ""; //объявляем переменную которая будет хранить сторку наоборот
        for (int i = str.length() - 1; i >= 0; i--) { //создаем цикл который будет работать задом на перед
            reverse = reverse + str.charAt(i); //переписваем наоборот
        }
        System.out.println("Reverse : " + reverse); //выводим обратную строку
    }
}