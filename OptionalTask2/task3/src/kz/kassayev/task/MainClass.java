package kz.kassayev.task;

import kz.kassayev.task.average.Avg;

import java.util.Scanner;

/*Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.*/
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Avg avg = new Avg(input); //создаем объект avg
        avg.array(); //вызываем метод Array
    }

}

