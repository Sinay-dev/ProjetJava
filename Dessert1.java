public class Dessert1 extends Dessert implements PlatdeGobelin{
    private int satisfaction;
    public Dessert1(String nom, double prix){
        super(nom,prix);
        this.satisfaction=70;
    }


    public String getType(){
        return "gobelin";
    }

    public int getSatisfaction(){
        return satisfaction;
    }

}
