public class VinSangDeWyvernEtSaBrocheDeSanglier extends Plat implements PlatdeGobelin, PlatdeElfe{
    private int carotte;
    private int satisfaction;
    public VinSangDeWyvernEtSaBrocheDeSanglier(double prix){
        super(prix);
        this.carotte=3;
        this.satisfaction=30;
    }

    public String getType(){
        return "Elfe";
    }

    public int getSatisfaction(){
        return satisfaction;
    }

}