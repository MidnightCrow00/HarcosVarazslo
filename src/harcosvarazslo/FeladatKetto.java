
package harcosvarazslo;

import java.util.Random;
import java.util.Scanner;


public class FeladatKetto {
        static Random rnd = new Random();
        static Scanner sc = new Scanner(System.in);
        
        
    public static void main(String[] args) {
        
    //1.feladat
        int szam = rnd.nextInt(3, 11);
       
    //2.feladat
        String betu = "";
            System.out.print("Írj be egy betűt: ");
            betu = sc.nextLine();
        
    //3.feladat  
        while(betu.length()!= 1){
            System.out.print("Hiba! Írj be egy betűt: ");
            betu = sc.nextLine();
        }
        
    //4.feladat
        for (int i = 0; i < szam - 1; i++) {
            System.out.print(betu + ",");
        }
        System.out.println(betu);
        
    //5.feladat
        final int DB = 5;
        double[] szamok = {Math.PI, Math.E};
        for (int i = 0; i < DB; i++) {
            if(szamok.length < 5){
                szamok[i] = 0;
            }else{
               System.out.println(szamok[i]); 
            }
            System.out.println(szamok[i]);
        }
    }
}
