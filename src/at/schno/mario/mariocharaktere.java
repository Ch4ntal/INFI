package at.schno.mario;

public class mariocharaktere {
    private String Typ;

    private String Zuhause;

    private String Farbe;

    private String Faehigkeit;

    public mariocharaktere() {
    }

    public mariocharaktere(String Typ, String Zuhause, String Farbe, String Faehigkeit) {
        this.Typ = Typ;
        this.Zuhause = Zuhause;
        this.Farbe = Farbe;
        this.Faehigkeit = Faehigkeit;
    }
    public String getTyp() {
        return Typ;
    }

    public void setTyp(String Typ) {
        this.Typ = Typ;
    }

    public String getZuhause() {
        return Zuhause;
    }

    public void setZuhause(String Zuhause) {
        this.Zuhause = Zuhause;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setFarbe(String Farbe) {
        this.Farbe = Farbe;
    }

    public String getFaehigkeit() {
        return Faehigkeit;
    }

    public void setFaehigkeit(String Faehigkeit) {
        this.Faehigkeit = Faehigkeit;
    }

    public void getInfo (){
        System.out.println("Typ des Charakters: " + this.Typ + " Zuhause: " + this.Zuhause + " Farbe: " +
                this.Farbe + " Fähigkeit: " + this.Faehigkeit);
    }

}
