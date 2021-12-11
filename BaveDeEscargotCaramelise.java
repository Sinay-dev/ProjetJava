public class BaveDeEscargotCaramelise extends Entree implements PlatdeGobelin, PlatdeHumain {
    private int satisfaction;
    public BaveDeEscargotCaramelise(double prix){
        super(prix);
        this.satisfaction=40;
    }


    public String getType(){
        return "Humain";
    }

    public int getSatisfaction(){
        return satisfaction;
    }
}
