import java.util.Scanner;
import java.util.Random;

public class PartThree {
    public static void main(String[] args) {
        // Uppgift 1.1
        System.out.println("Uppgift 1.1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //Uppgift 1.2
        System.out.println("Uppgift 1.2");
        int sum = 0;
        for ( int i = 1; i < 101; i++) {
                sum += i;
            }
        System.out.println("Summan av alla tal från 1 till 100 är: " + sum);
        //Uppgift 1.3
        System.out.println("Uppgift 1.3");
        for (int i = 1; i < 11; i++) {
            System.out.println(i * 5);
        }
        //Uppgift 2.1
        System.out.println("Uppgift 2.1");
        int i = 0;
        while (i < 21) {
            i++;
            if (i % 2 == 0)
                System.out.println(i);
            }
        //Uppgift 2.2
        System.out.println("Uppgift 2.2");
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        System.out.println("Gissa på ett tal mellan 1 - 100.");
        while (randomInt != guess) {
            guess = scanner.nextInt();
            if (randomInt < guess) {
                System.out.println("Lägre");
            } else if (randomInt > guess) {
                System.out.println("Högre");
            } else {
                System.out.println("Korrekt");
            }
        }

        }
    }


