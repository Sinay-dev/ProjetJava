public class TrucImmondeNonIdentifiableEnBocal extends Plat implements PlatdeGobelin {
    private int carotte;
    private int satisfaction;
    public TrucImmondeNonIdentifiableEnBocal(double prix){
        super(prix);
        this.carotte=3;
        this.satisfaction=30;
    }

    public String getType(){
        return "Gobelin";
    }

    public int getSatisfaction(){
        return satisfaction;
    }

}