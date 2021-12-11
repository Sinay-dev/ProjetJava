import java.util.Scanner;


public class Menu{
    private String c;
    private Object[] tab;
    private int cpt;
    public Menu(){
        if(Math.random()*(2)<=1){
            this.c="Elfe";
        }
        else{
            this.c="Gobelin";
        }
        tab= new Object[3];
        this.cpt=0;
    }

    public void add(Object o){
        if (cpt < 3){
            tab[cpt]=o;
            cpt++;
        }
    }

    public String getClient(){
        return c;
    }

    public Object[] getTab(){
        return tab;
    }

    public double score(){
        double coeffSatisfaction=0.5;
        double satisfaction=0.0;
        for(int i=0;i<tab.length;i++){
            if(i==0){
                if( c == ((Entree)(tab[i])).getType()){
                    coeffSatisfaction++;
                    satisfaction+=((Entree)(tab[i])).getSatisfaction();
                }
            }
            else if (i==1){
                if( c == ((Plat)(tab[i])).getType()){
                    coeffSatisfaction++;
                    satisfaction+=((Plat)(tab[i])).getSatisfaction();
                }
            }
            else{
                if( c == ((Dessert)(tab[i])).getType()){
                    coeffSatisfaction++;
                    satisfaction+=((Dessert)(tab[i])).getSatisfaction();
                }
            }
            if(c=="elfe"&& tab[i] instanceof PlatdeGobelin){
                satisfaction-=50;
            }
        }
        return coeffSatisfaction*satisfaction;
    }



    public static void main(String [] args){

        Menu m = new Menu();
        System.out.println("Un client rentre dans l'auberge c'est un : "+m.getClient());
        System.out.println("Quelle entrée voulez vous choisir ?");
        System.out.println("[1] entrée1 ;[2] entrée2 ;[3] entrée;");

        Scanner saisieEntree = new Scanner(System.in);
        int entree = saisieEntree.nextInt();
        
        saisieEntree.close();

        System.out.println("Quel plat voulez vous choisir ?");
        System.out.println("[1] plat1 ;[2] plat2 ;[3] plat3;");

        Scanner saisiePlat = new Scanner(System.in);
        int plat = saisiePlat.nextInt();

        saisiePlat.close();

        System.out.println("Quel dessert voulez vous choisir ?");
        System.out.println("[1] dessert1 ;[2] dessert2 ;[3] dessert3;");

        Scanner saisieDessert = new Scanner(System.in);
        int dessert = saisieDessert.nextInt();

        saisieDessert.close();
        // score
        m.score();

    }
}
