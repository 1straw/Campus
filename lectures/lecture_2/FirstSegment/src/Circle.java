import java.util.Scanner;

public class Circle {
    double diameter;
    double radius;
    double circumference;

    Circle(double diameter) {  // Kontruktor för cirkel
        this.diameter = diameter;
    }
    void calculateRadius() {
        this.radius = this.diameter / 2; // Uträkning för radie
    }
    void calculateCircumference() {
        this.circumference = 2 * Math.PI * this.radius; // Uträkning för omkrets
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar scanner för att ta in värden ifrån användaren
        System.out.println("Räkna ut omrkretsen på cirkeln: ");
        System.out.println("Ange diameter: ");
        int d1 = scanner.nextInt(); // Tar in värden ifrån ancändaren
        Circle circle1 = new Circle(d1); // Skapa nytt objekt av klassen Cirkel

        circle1.calculateRadius();
        circle1.calculateCircumference();
        System.out.println("Omkretsen av cirkeln är: " + circle1.circumference);


    }
}
