public class Entree1 extends Entree implements PlatdeElfe {
    private int satisfaction;
    public Entree1(String nom, double prix){
        super(nom,prix);
        this.satisfaction=40;
    }


    public String getType(){
        return "elfe";
    }

    public int getSatisfaction(){
        return satisfaction;
    }
}
