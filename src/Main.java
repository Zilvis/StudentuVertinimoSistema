
//Parašykite Java programą, kuri modeliuoja studentų įvertinimų sistemą.

// Parašykite Main klasėje veiksmus, kuriais sukursite keletą studentų objektų ir patikrinsite jų funkcionalumą.

public class Main {
    public static void main(String[] args) {

        var petras = new Studentas("Petras", "Petraitis",1);

        petras.pridetiPazymi(4);
        petras.pridetiPazymi(8);
        petras.pridetiPazymi(9);
        petras.pridetiPazymi(8);
        petras.pridetiPazymi(10);

        var jonas = new Studentas("Jonas", "Jonaitis",2);

        jonas.pridetiPazymi(5);
        jonas.pridetiPazymi(7);
        jonas.pridetiPazymi(3);
        jonas.pridetiPazymi(7);
        jonas.pridetiPazymi(6);
        jonas.pridetiPazymi(8);
        jonas.pridetiPazymi(9);

        petras.statistika();
        jonas.statistika();
    }
}