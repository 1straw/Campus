public class Main {
    public static void main(String[] args) {
        //Antal bord
        int tables = 5;
        //Antal möjliga platser vid ett bord
        int sides = 4;
        //Antal platser som försvinner när man slår ihop 2 bord
        int lostSeats = 2;
        //Totalt antal platser från alla bord
        int totalSeats = tables * sides;
        //Uträkningen av platser som finns kvar efter att borden slagits ihop
        int seatsLeft = totalSeats - (tables - 1) * lostSeats;

        System.out.print("Antal platser som finns kvar efter att man ställt i ordning borden: ");
        System.out.println(seatsLeft);


    }
}