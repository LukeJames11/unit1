package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("please enter your first name");
    String firstName = input.nextLine();

    System.out.println("please enter your last name");

    String lastName = input.nextLine();

    System.out.println("please enter your age");

    String age = input.nextLine();

    System.out.println("please enter your grade");

    String grade = input.nextLine();

    System.out.println("please enter your fav color");

    String favColor = input.nextLine();

    System.out.println("hello " + firstName + " " + lastName + "you are " + age + " " + "you are in grade " + grade + " " + "your fav color is " + favColor);
    
    }
}