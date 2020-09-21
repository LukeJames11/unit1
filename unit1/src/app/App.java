package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("please enter your full name");
    String firstName = input.nextLine();
    String lastName = input.nextLine();

    System.out.println("please enter your age");

    String age = input.nextLine();

    System.out.println("please enter your grade");

    String grade = input.nextLine();

    System.out.println("please enter your fav color");

    String favColor = input.nextLine();

    System.out.println("hello " + firstName + " " + lastName + "how old  are you? " + age + " " + "what grade are you in? " + grade + " " + "and whats your fav color " + favColor);
    
    }
}