package com.company;
import java.util.Scanner;
public class Exercise8 {

    public static void main(String[] args) {
        String teacher = "How awesome are Kenn and Kevin?";
        String stopWord = "q";
        Scanner askAgain = new Scanner(System.in);

        while (!teacher.equals(stopWord)){
            stopWord = askAgain.nextLine();

            System.out.print(teacher);
            // write your code here
        }
    }
}
