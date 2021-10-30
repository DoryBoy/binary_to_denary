package com.williamdaw.binary_to_denary_converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Enter a guess:");
    Scanner scanner = new Scanner(System.in);
    String binary = scanner.nextLine().toUpperCase();

    int denary = binary.length();
    int total = 0;
    char [] binary_char = binary.toCharArray();

    for (int i = 0; i < binary.length(); i++) if ((binary_char[i] == '1')) total = (int) (total + Math.pow(2,(-(i + 1) + (denary))));

    System.out.println(total);
    }
}
