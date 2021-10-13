package ua.com.alevel;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class BaseOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        System.out.println("Enter a string:");
        line = scanner.nextLine();
        System.out.println("Your output:");
        findChar(line);
    }

    static void findChar(String inputString) {
        int counter = 1;
        String letters = "";
        Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();

        for (int i = 0; i < inputString.length(); i++) {
            char characters = inputString.charAt(i);
            if (Character.isAlphabetic(characters)) {
                letters += characters;
            }
        }
        char[] strArray = letters.toCharArray();

        for (char character : strArray) {
            if (treeMap.containsKey(character)) {
                treeMap.put(character, treeMap.get(character) + 1);
            } else {
                treeMap.put(character, 1);
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.println(counter++ + ":" + entry.getKey() + "-" + entry.getValue());
        }
    }
}
