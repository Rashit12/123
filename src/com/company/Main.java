package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>(sizeOfArray);
        for (Integer i : list) {
            int a = scan.nextInt();
            list.add(a);
            System.out.println(i);

        }
    }
}
