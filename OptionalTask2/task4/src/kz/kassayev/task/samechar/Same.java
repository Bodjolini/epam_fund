package kz.kassayev.task.samechar;

import java.util.Scanner;

public class Same {
    Scanner input;

    public Same(Scanner input) {
        this.input = input;
    }

    public void findSameChar() {
        System.out.println("How many numbers do you want to write? ");
        //задем размер и простим ввести числа в массив
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Input numbers : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int counter = 0;
        int tmpNumb = 0;
        String strr, tmp = new String();
        System.out.println();
        //Переводим наш массив в строку
        for (int i = 0; i < numbers.length; i++) {
            strr = String.valueOf(numbers[i]);
            for (int j = 0; j < strr.length() - 1; j++) {
                tmpNumb = 0;
                //считываем одинаковые символы в каждой ячейке массива
                for (int k = j; k < strr.length(); k++) {
                    if (strr.toString().charAt(j) == strr.toString().charAt(k)) {
                        tmpNumb++;
                    }

                    if (tmpNumb > counter){
                        counter = tmpNumb;
                        tmp = strr;
                    }
                }

            }
        }
        System.out.println("Result : " + tmp);
    }
}
