public class AssietteDeFromageBretonniens extends Dessert implements PlatdeHumain{
    private int satisfaction;
    public AssietteDeFromageBretonniens(double prix){
        super(prix);
        this.satisfaction=70;
    }


    public String getType(){
        return "Humain";
    }

    public int getSatisfaction(){
        return satisfaction;
    }

}
