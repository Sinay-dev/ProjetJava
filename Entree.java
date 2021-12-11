public abstract class Entree {
    protected double prix;
    public Entree(double prix){
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
