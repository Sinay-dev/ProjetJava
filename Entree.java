public abstract class Entree {
    protected String nom;
    protected double prix;
    public Entree(String nom, double prix){
        this.nom=nom;
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
