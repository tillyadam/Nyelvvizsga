import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Adatok> sikeresLista;
    private static ArrayList<Adatok> sikertelenLista;

    public static void main(String[] args) {

    }

    private static void beolvas(String sikeresTabla, String sikertelenTabla) {
        try {
            sikeresLista = new ArrayList<>();
            sikertelenLista = new ArrayList<>();

            FileReader sikeresTablaFR = new FileReader(sikeresTabla);
            BufferedReader sikeresTablaBR = new BufferedReader(sikeresTablaFR);

            String sor = sikeresTablaBR.readLine();
            sikeresTablaBR.readLine();

            while (sor != null) {
                String[] tomb = sor.split(";");
                String nyelv = tomb[0];
                int[] darab = new int[9];
                for (int i = 1; i < tomb.length; i++) {
                    darab[i - 1] = Integer.parseInt(tomb[i]);
                }
                sikeresLista.add(new Adatok(nyelv, darab));

            }

            FileReader sikertelenTablaFR = new FileReader(sikertelenTabla);
            BufferedReader sikertelenTablaBR = new BufferedReader(sikertelenTablaFR);

            String sor2 = sikeresTablaBR.readLine();
            sikeresTablaBR.readLine();

            while (sor2 != null) {
                String[] tomb = sor.split(";");
                String nyelv = tomb[0];
                int[] darab = new int[9];
                for (int i = 1; i < tomb.length; i++) {
                    darab[i - 1] = Integer.parseInt(tomb[i]);
                }
                sikertelenLista.add(new Adatok(nyelv, darab));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
