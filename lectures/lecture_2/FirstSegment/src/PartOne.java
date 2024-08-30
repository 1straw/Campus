import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {

        // Uppgift 1 && 1,2
        int age = 30;
        float height = 1.75F;
        char initial = 'N';
        String name = "Alice";
        boolean isStudent = true;

        System.out.println(age);
        System.out.println(height);
        System.out.println(initial);
        System.out.println(name);
        System.out.println(isStudent);


    // Uppgift 2.1
        int summa = 10 + 20;
        int skillnad = 100 % 30;
        int produkt = 5 * 7;
        int kvot = 20 / 4;
        int resen = 10 % 3;

    // Uppgift 2.2
        int a = 15;
        int b = 20;
        System.out.print("a == b : ");
        if (a == b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("a > b : ");
        if (a > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("a <= b : ");
        if (a <= b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //Uppgift 2.3
        int x = 10;
        int y = 5;
        int z = 20;

        System.out.print("x > y and z > y : ");
        if ((x > y)  && (z > y)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("x > y or z < y : ");
        if ((x > y) || (z < y)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if(!(x > y)){
            System.out.println("!x > y");
        }

        // Uppgift 2.4:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv några tal: ");


    }
}
