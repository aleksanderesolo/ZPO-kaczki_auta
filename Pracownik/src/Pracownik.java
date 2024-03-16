public class Pracownik {
    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private SpedzenieWolnegoCzasu spedzenieWolnegoCzasu;
    private String zawod;

    Pracownik(String zawod){
        this.zawod = zawod;
    }

    public void pracuj() {
        pracowac.pracuj();
    }

    public void setPracowac(Pracowac pracowac) {
        this.pracowac = pracowac;
    }

    public void dojezdzaj() {
        dojezdzac.dojezdzaj();
    }

    public void setDojezdzac(Dojezdzac dojezdzac) {
        this.dojezdzac = dojezdzac;
    }

    public void spedzajWolnyCzas() {
        spedzenieWolnegoCzasu.spedzajWolnyCzas();
    }

    public void setSpedzenieWolnegoCzasu(SpedzenieWolnegoCzasu spedzenieWolnegoCzasu) {
        this.spedzenieWolnegoCzasu = spedzenieWolnegoCzasu;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }
}
