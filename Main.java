import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu m = new Menu();
        System.out.println("Un client rentre dans l'auberge c'est un : "+m.getClient());
        System.out.println("Quelle entrée voulez vous choisir ?");
        System.out.println("[1] entrée1 ;[2] entrée2 ;[3] entrée;");

        Scanner scanner = new Scanner(System.in);
        int entree = scanner.nextInt();
        
        //saisie;

        System.out.println("Quel plat voulez vous choisir ?");
        System.out.println("[1] plat1 ;[2] plat2 ;[3] plat3;");

        int plat = scanner.nextInt();

        //saisie

        System.out.println("Quel dessert voulez vous choisir ?");
        System.out.println("[1] dessert1 ;[2] dessert2 ;[3] dessert3;");
        int dessert = scanner.nextInt();

        scanner.close();
        // score
        m.score();

    }
}
