package kz.kassayev.hi;

import java.util.Scanner;
/* Приветствовать любого пользователя при вводе его имени через командную строку.*/

class Hello{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String yourName = input.nextLine(); //создаем переменную для имени
        while(!yourName.matches("[a-zA-Z]+")){ //имя должно быть на латинском
            System.out.println("Please enter a valid name!"); //выводим сообщение об ошибке
            yourName = input.nextLine(); //просим повторный ввод
        }
        System.out.println("Hello, " + yourName); //приветствуем пользователя
    }
}