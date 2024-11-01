import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> covidData = fh.LoadData();

for(Covid19Data data: covidData) {
    System.out.println();
    System.out.println(data);
}

    }
}