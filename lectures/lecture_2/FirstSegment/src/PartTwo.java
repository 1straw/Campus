import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {
        //Uppgift 2.1
        System.out.println("Uppgift 2.1");
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        while (month < 1 || month > 12) {
            System.out.print("Skriv en siffra så ger jag dig en månad: ");
            month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Det finns bara 12 månader, försök igen.");
            }
        }
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                break;
        }

        System.out.println("--------------------------------------------");

        // Uppgift 2.2
        System.out.println("Uppgift 2.2");
        // Initierar en scanner för grade
        int grade;
        // loop för att bekräfta rätt inmatning
        do {
            System.out.println("Ange ett betyg (0 till 5)");
            grade = scanner.nextInt();
            if (grade < 0 || grade > 5) {
                System.out.println("Betyget måste vara mellan 0 till 5. Vänligen försök igen.");
            }
        } while (grade < 0 || grade > 5);
        switch (grade) {
            case 0:
                System.out.println("F");
                break;
            case 1:
                System.out.println("E");
                break;
            case 2:
                System.out.println("D");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("B");
                break;
            case 5:
                System.out.println("A");
                break;
        }
        //Uppgift 2.3
        System.out.println("Uppgift 2.3");
        System.out.println("Vad vill du äta?");
        System.out.println("Frukost, lunch eller middag?");
        while(true) {
            String meal = scanner.next();
            meal = meal.toLowerCase();

            switch (meal) {
                case "frukost":
                    System.out.println("Varma mackor + kaffe");
                    break;
                case "lunch":
                    System.out.println("Fattiga riddare");
                    break;
                case "middag":
                    System.out.println("Filé Oscar");
                    break;
                default:
                    System.out.println("Frukost, lunch eller middag?");
                    continue;
            }
            break;
        }
        //Uppgift 3.1
        System.out.println("Uppgift 3");
        int x;
        int y;
        int expression;

        System.out.println("Ange 2 tal");
        System.out.println("Första talet: ");
        x = scanner.nextInt();
        System.out.println("Andra talet: ");
        y = scanner.nextInt();
        while (true) {
            System.out.println("1 = Addition");
            System.out.println("2 = Subtraktion");
            System.out.println("3 = Multiplikation");
            System.out.println("4 = Division");
            expression = scanner.nextInt();
            switch (expression) {
                case 1:
                    System.out.println(x + y);
                    break;
                case 2:
                    System.out.println(x - y);
                    break;
                case 3:
                    System.out.println(x * y);
                    break;
                case 4:
                    System.out.println(x / y);
                    break;
                default:
                    System.out.println("Fel inmatning");
                    continue;
            }
            break;
        }
        //Uppgift 3.2
        System.out.println("Uppgift 3.2");
        System.out.println("För att räkna ut ditt pris så måste jag veta vad din medlemsstatus är?");
        System.out.println("Brons, Silver eller Guld?");
        int product = 1499;
        double bronze = product * 0.95;
        double silver = product * 0.9;
        double gold = product * 0.8;
        while(true) {
            String membership = scanner.next();
            membership = membership.toLowerCase();
            switch (membership) {
                case "brons":
                    System.out.println("Brons = " + (int)bronze + " kr");
                    break;
                case "silver":
                    System.out.println("Silver = " + (int)silver + "kr" );
                    break;
                case "gold":
                    System.out.println("Guld = " + (int)gold + "kr");
                default:
                    System.out.println("Brons, Silver eller Guld?");
                    continue;
            }break;
        }
    }
}
