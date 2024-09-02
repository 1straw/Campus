class Car {
    String model;
    String color;
    int miles;

    Car(){
        this.model = "Unknown";
        this.color = "Unknown";
        this.miles = 0;
    }
    void printDefaultCar() {
        Car defaultCar = new Car();
        System.out.println("Model " + defaultCar.model);
        System.out.println("Model " + defaultCar.color);
        System.out.println("Model " + defaultCar.miles);
    }

}

class Country {
    String country;
    String capital;
    int population;

    //Konstruktor för Country klassen
    Country(String country, String capital, int population) {
        this.country = country;
        this.capital = capital;
        this.population = population;
    }
    void info() {
        System.out.println("Land: "+ country + "\nHuvudstad: " + capital + "\nBefolkning: " + population);
    }

}
class Person{
    String name;
    int age;
    String occupation;

    void introduce() {
        System.out.println("Mitt namn är " + name + " jag är " + age + " år och jobbar som " + occupation + ".");
    }
}

public class PartFour {
    public static void main(String[] args) {
        Person newPerson = new Person();
        Person newPerson2 = new Person();
        newPerson.name ="Adam";
        newPerson.age = 30;
        newPerson.occupation = "snickare";

        newPerson2.name = "Therese";
        newPerson2.age = 28;
        newPerson2.occupation = "bagare";


        System.out.println(newPerson.name);
        System.out.println(newPerson.age);
        System.out.println(newPerson.occupation);
        newPerson.introduce();
        newPerson2.introduce();


        //-----------------------------------------------------
        System.out.println("------------------------------------------");

        Country sweden = new Country("Sweden","Stockholm",1_000_000);
        Country england = new Country("England","London",56_000_000);
        Country norway = new Country("Norway","Oslo",5_500_000);


        sweden.info();
        england.info();
        norway.info();

        System.out.println("------------------------------------------------------");

        Car newCar = new Car();
        newCar.printDefaultCar();
    }
}
