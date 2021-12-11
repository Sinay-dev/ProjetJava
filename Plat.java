public abstract class Plat {
    protected double prix;
    public Plat(double prix){
        this.prix=prix;
    }
    public double getPrix(){
        return prix;
    }
    public String toString(){
        return "prix : "+prix;
    }
    public abstract String getType();
    public abstract int getSatisfaction();
}
