package ua.com.alevel;
import java.util.Scanner;

public class BaseOperations1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        System.out.println("A program that takes a string\n" +
                "and extracts all the numbers\n" +
                "and finds their sum");
        System.out.println("Enter your string:");
        line = scanner.nextLine();
        System.out.println("Your output: " + findSum(line));
    }
    static int findSum(String str) {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isDigit(character)) {
                temp += character;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
}