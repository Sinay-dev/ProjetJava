public class SaladeDeAthelLoren extends Entree implements PlatdeElfe, PlatdeHumain {
    private int satisfaction;
    public SaladeDeAthelLoren(double prix){
        super(prix);
        this.satisfaction=40;
    }


    public String getType(){
        return "Elfe";
    }

    public int getSatisfaction(){
        return satisfaction;
    }
}
