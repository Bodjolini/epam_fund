package kz.kassayev.ulken;

import kz.kassayev.ulken.combination.Combi;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Combi combi = new Combi(input);
        combi.Combinator();
    }
}
