public class PetitsBiscuitsEnsorcelesDeHalfelins extends Dessert implements PlatdeElfe PlatdeGobelin PlatdeHumain {
    private int satisfaction;
    public PetitsBiscuitsEnsorcelesDeHalfelins(double prix){
        super(prix);
        this.satisfaction=70;
    }


    public String getType(){
        return "Elfe";
    }

    public int getSatisfaction(){
        return satisfaction;
    }

}
