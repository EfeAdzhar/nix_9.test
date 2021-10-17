package ua.com.alevel1;
import java.io.IOException;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EndOfALesson {
    public void lessonEndCounter(int integer) throws IOException, InputMismatchException {
        try {
            Scanner scanner = new Scanner(System.in);
            int lessonHour = 9;
            int lessonMinute = 0;
            int lessonCounter = 0;
            int lessonNumber;
            System.out.print("Enter the lessons: ");
            lessonNumber = scanner.nextInt();
            LocalTime time = LocalTime.of(Integer.parseInt(String.valueOf(lessonHour)), Integer.parseInt(String.valueOf(lessonMinute)));
            for (int i = 0; i < lessonNumber; i++) {
                time = time.plusMinutes(45);
                lessonCounter++;
                if (lessonCounter % 2 == 0) {
                    time = time.plusMinutes(15);
                } else {
                    time = time.plusMinutes(5);
                }
            }
            System.out.println("\tthe end of a " + lessonCounter + " lesson: " + time.toString());
        } catch (InputMismatchException ime) {
            System.out.println("Wrong Input");
        }
    }
}