public class FiletDeEspadonAncestralAuxPetitsLegumes extends Plat implements PlatdeHumain, PlatdeElfe{
    private int carotte;
    private int satisfaction;
    public FiletDeEspadonAncestralAuxPetitsLegumes(double prix){
        super(prix);
        this.carotte=3;
        this.satisfaction=30;
    }

    public String getType(){
        return "Humain";
    }

    public int getSatisfaction(){
        return satisfaction;
    }

}