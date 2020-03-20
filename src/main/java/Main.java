import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import  java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {

        Visitor alice = new Visitor();

        Scanner input = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        System.out.println("Please insert name:");
        String name = input.nextLine();
        alice.name = name;

        System.out.println("Please insert age:");
        int age = intScanner.nextInt();
        alice.age = age;

        System.out.println("Please insert date (eg (YYYY/DD/MM)):");
        String date = input.nextLine();
        alice.date = date;

        System.out.println("Please insert time (eg (HH:MM)):");
        String time = input.nextLine();
        alice.time = time;

        System.out.println("Please insert a comment:");
        String comment = input.nextLine();
        alice.comment = comment;

        System.out.println("Please insert the name of the person who assisted:");
        String assist = input.nextLine();
        alice.assist = assist;

        alice.save();
    }
}
