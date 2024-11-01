public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private int bekræftedeTilfælde;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersGruppe, int bekræftedeTilfælde, int indlagte, String dato) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.indlagte = indlagte;
        this.dato = dato;

    }

        @Override
        public String toString() {
            return "data{" +
                    "region=" + region +
                    ", aldersgruppe='" + aldersGruppe + '\'' +
                    ", bebræftedetilfælde='" + bekræftedeTilfælde + '\'' +
                    ", indlagte='" + indlagte +
                    ", dato='" + dato + '\'' +
                    '}';
        }
    }

