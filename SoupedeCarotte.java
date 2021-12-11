public class SoupedeCarotte extends Plat implements PlatdeElfe {
    private int carotte;
    private int satisfaction;
    public SoupedeCarotte(String nom, double prix){
        super(nom,prix);
        this.carotte=3;
        this.satisfaction=30;
    }

    public String getType(){
        return "elfe";
    }

    public int getSatisfaction(){
        return satisfaction;
    }

}
