public abstract class Dessert {
    protected double prix;
    public Dessert(double prix){
        this.prix=prix;
    }
    public double getPrix(){
        return prix;
    }
    public String toString(){
        return " nom: "+nom+" prix : "+prix;
    }
    public abstract String getType();
    public abstract int getSatisfaction();
}
