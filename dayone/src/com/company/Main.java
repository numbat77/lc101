package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String hello = "hello";
        String value = scanner.next();
        System.out.println(hello.equals(value));
    }
}
