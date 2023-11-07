package fr.louis.daron;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Combien y a t-il d'articles dans votre panier : ");
        int nbTotalArticles = clavier.nextInt();
        int totalPanier = 0;
        int i = 1;

        /*for (int i = 1 ; i <= nbTotalArticles ; i++){
            System.out.print("Entrez le prix du "+i+" e article : ");
            double prix = clavier.nextDouble();
            System.out.println("Prix du "+i+" e article : "+ prix +" euros.");
            totalPanier += prix;
        }*/
        while(nbTotalArticles != 0){
            System.out.print("Entrez le prix du "+ i +" e article : ");
            double prix = clavier.nextDouble();
            System.out.println("Prix du "+ i +" e article : "+ prix +" euros.");
            totalPanier += prix;
            nbTotalArticles = nbTotalArticles -1;
            i += 1;
        }
        System.out.print("Le prix total du panier est de : "+ totalPanier+ " euros.");
        clavier.close();
    }
    
}
