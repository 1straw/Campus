import java.util.Scanner;

public class Rectangle {
    int height;
    int width;
    int area;
    int circumference;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    void calculateArea() {
            this.area = (this.width * this.height); // Räkna ut arean på rektangeln
        }
    void calculateCircumference() {
        this.circumference = ((this.width + this.height) * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Räkna ut arean på en rektangel.");
        System.out.print("Ange höjd: ");
        int h1 = scanner.nextInt();
        System.out.print("Ange längd: ");
        int w1 = scanner.nextInt();
        Rectangle rectangle1 = new Rectangle(h1, w1);  //Skapa Rectangle objekt

        rectangle1.calculateArea();  //Beräkna arean av rectangle1
        rectangle1.calculateCircumference();
        System.out.println("Arean av rektangeln =  " + rectangle1.area);
        System.out.println("Omkretsen av rektangeln = " + rectangle1.circumference);

    }

}

