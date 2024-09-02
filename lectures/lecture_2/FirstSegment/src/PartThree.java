import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class PartThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
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
        //Uppgift 3.1
        System.out.println("Upppgift 3.1");
        int number;
        System.out.println("Skriv ett tal(avsluta med ett negativt)");
        do {
            number = scanner.nextInt();
        } while (number > 0);

        //Uppgift 3.2

        //deklarerar variablar för inmatning
        String choice = "";
        System.out.println("Uppgift 3.2");
        System.out.println("Kalkylator");

        do {
            System.out.println("Alterntiv 1 = Addition");
            System.out.println("Alternativ 2 = Subtraktion");
            System.out.println("Alternativ 3 = Multiplikation");
            System.out.println("Alternativ 4 = Division");

            //Begär inmatning av användaren
            System.out.print("Välj alternativ (\"q\" för avsluta): ");
            choice = scanner.nextLine();
            //Sätt inmatning till enbart lowercase
            choice = choice.toLowerCase();

            //Skriv ut alternativen till använderen
            //även ett fel meddelande om använder ger ogiltig inmatning
            if (choice.equals("1") || choice.equals("addition")) {
                System.out.println("Du har valt addition.");
            } else if (choice.equals("2") || choice.equals("subtraktion")) {
                System.out.println("Du har valt subtaktion.");
            } else if (choice.equals("3") || choice.equals("multiplikation")) {
                System.out.println("Du har valt multiplikation.");
            } else if (choice.equals("4") || choice.equals("division")) {
                System.out.println("Du har valt division.");
            } else if (choice.equals("q")) {
                System.out.println("Du har valt att avsluta programmet.");
            } else {
                System.out.println("Fel inmatning, vänligen försök igen");
            }
        } while (!choice.equals("q"));

        //Uppgift 4.1
        //Räkna ut om talet är ett primtal eller inte
        System.out.println("Uppgift 4.1");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            //Uträkning om talet är primtal eller inte
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Primtal: " + i);

 */     //Uppgift 4.2
        System.out.println("Uppgift 4.2");
        int terms = 10;
        System.out.println("Fibonacci i " + terms + " termer.");
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.println(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        }
    }