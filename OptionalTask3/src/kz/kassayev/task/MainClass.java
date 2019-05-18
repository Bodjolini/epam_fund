package kz.kassayev.task;

import java.util.Scanner;
/*Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.*/

public class MainClass {
    static void setNum(int numb) {
        String[] month = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
        //выбираем по индексу готового массива и выводим
        System.out.println("This month is " + month[numb - 1]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of month: ");
        int numb = input.nextInt();
        //будем спрашивать номер месяца пока пользователь не задаст правильный номер
        //для этого ставим условие что оно должно быть больше или равно 1, меньше или равно 12
        while (!(numb <= 12 && numb >= 1)) {
            //выводим об ошибке
            System.out.println("On our planet so far only 12 months, please enter again");
            numb = input.nextShort();
        }
        setNum(numb);
    }
}