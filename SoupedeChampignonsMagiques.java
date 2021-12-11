public class SoupedeChampignonsMagiques extends Plat implements PlatdeElfe, PlatdeGobelin {
    private int carotte;
    private int satisfaction;
    public SoupedeChampignonsMagiques(double prix){
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
