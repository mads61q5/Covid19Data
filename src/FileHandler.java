import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File file = new File("Covid.csv");

    public ArrayList<Covid19Data> LoadData() {
        ArrayList<Covid19Data> coviddata = new ArrayList();
        Scanner sc = null;

        try {
            sc = new Scanner(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        Covid19Data data = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            data = new Covid19Data(
                    attributes[0],//region
                    attributes[1], //aldersgruppe
                    Integer.parseInt(attributes[2]), //bebræftedeTilfælde
                    Integer.parseInt(attributes[3]), //indlagte
                    attributes[4] //dato

            );

            coviddata.add(data); //tilføj data til arraylist

        }
        sc.close();
        return coviddata;

    }
}
