import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pracownik> pracownicy = new ArrayList<>(Arrays.asList(
                new Pracownik("Mechanik"),
                new Pracownik("Listonosz")
        ));

        pracownicy.get(0).setPracowac(new Naprawianie());
        pracownicy.get(0).setDojezdzac(new Rower());
        pracownicy.get(0).setSpedzenieWolnegoCzasu(new Silownia());

        pracownicy.get(1).setPracowac(new NaprawaSamochodow());
        pracownicy.get(1).setDojezdzac(new Samochod());
        pracownicy.get(1).setSpedzenieWolnegoCzasu(new LiteraturaPopularnoNaukowa());

        for(Pracownik pracownik: pracownicy){
            pracownik.dojezdzaj();
            pracownik.pracuj();
            pracownik.spedzajWolnyCzas();
        }
    }
}