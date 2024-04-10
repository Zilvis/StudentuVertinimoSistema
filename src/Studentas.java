import java.util.ArrayList;
import java.util.Collections;

public class Studentas {
    private String vardas, pavarde;
    private int studentoID;
    private ArrayList<Integer> pazymiai;

    public Studentas(String vardas, String pavarde, int studentoID) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.studentoID = studentoID;
        pazymiai = new ArrayList<>();
    }

    /**
     * Isvedama statistika apie studenta
     */
    public void statistika (){
        System.out.println("\nStudento " +getVardas() + " STATISTIKA ");
        System.out.println("Vidurkis: "+ skaiciuotiVidurki(this.pazymiai));
        System.out.println("Pazymiu kiekis: "+ pazymiuKiekis());
        System.out.println("Zemiausias pazymys: "+ gautiMin());
        System.out.println("Auksciausias pazymys: "+ gautiMax());
        System.out.println("Mediana: "+ gautiMediana());
    }

    /**
     * Medianos skaičiuoklė leidžia apskaičiuoti statistinę medianą iš įvestų skaičių.
     * Norėdami tai padaryti, įveskite kableliais atskirtus skaičius
     * ir gausite informaciją apie medianą, aritmetinį vidurkį, mažiausią ir didžiausią reikšmes bei bendrą sumą.
     * @return
     */
    private double gautiMediana(){
        Collections.sort(pazymiai);
        double mediana;
        if (pazymiai.size() % 2 == 0) {
            int vidurinis1 = pazymiai.get(pazymiai.size() / 2 - 1);
            int vidurinis2 = pazymiai.get(pazymiai.size() / 2);
            mediana = (vidurinis1 + vidurinis2) / 2.0;
        } else {
            mediana = pazymiai.get(pazymiai.size() / 2);
        }
        return mediana;
    }

    /**
     * Pateikiamas sarasas
     * @return grazinama maziausia reiksme
     */
    private double gautiMin(){
        int min = 10;
        for (int i = 0; i < pazymiai.size(); i++){
            if (pazymiai.get(i) < min){
                min = pazymiai.get(i);
            }
        }
        return min;
    }

    /**
     * Pateikiamas sarasas
     * @return grazinama didziausia reiksme
     */
    private double gautiMax(){
        int max = 0;
        for (int i = 0; i < pazymiai.size(); i++){
            if (pazymiai.get(i) > max){
                max = pazymiai.get(i);
            }
        }
        return max;
    }

    /**
     *
     * @return grazinama pazymiu kiekis
     */
    private int pazymiuKiekis(){
        return pazymiai.size();
    }
    private double skaiciuotiVidurki (ArrayList<Integer> pazymiai){
        int pazymiuSuma = 0;
        for (int i = 0; i < pazymiai.size(); i++){
            pazymiuSuma += pazymiai.get(i);
        }
        double vidurkis = (double) pazymiuSuma / pazymiai.size();
        return vidurkis;
    }

    /**
     * Pridedami pazymiai i sarasa
     * @param pazymiai
     */
    public void pridetiPazymi(Integer pazymiai){
       this.pazymiai.add(pazymiai);
    }

    private String getVardas() {
        return vardas;
    }

    @Override
    public String toString() {
        return String.format("Studentas: " +
                "  Vardas: %s " +
                "  Pavarde: %s " +
                "  Studento ID: %d " +
                "  Pazymiai: %s "
                , vardas, pavarde, studentoID, pazymiai);
    }
}
