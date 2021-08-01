/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dd;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class DD {

  public static void main(String[] args) {
    	Employe [] employe = new Employe[6];
		float montantTotal = 0;
	   Manager manager1 = new Manager("Mamadou", "NDIAYE", 1, 45, 120);
	   Manager manager2 = new Manager("Fatou", "DIOP", 2, 32, 225);
	   Ingenieur ingerieur1 = new Ingenieur("Lamine", "DIOP", 3, 70, 220);
	   Ingenieur ingerieur2 = new Ingenieur("Moussa", "DIOP", 4, 42, 124);
	   Ingenieur ingerieur3 = new Ingenieur("Adama", "NDIAYE", 5, 38, 246);
	   Ingenieur ingerieur4 = new Ingenieur("Mame", "NDIAYE", 6, 44, 320);

	   manager1.ajouterHeureGolfe(10);
	   manager2.ajouterHeureGolfe(13);
	   ingerieur1.ajouterHeureCom(8);
	   ingerieur2.ajouterHeureCom(12);
	   ingerieur3.ajouterHeureCom(5);
	   ingerieur4.ajouterHeureCom(7);
	   employe[0] = manager1;
	   employe[1] = manager2;
	   employe[2] = ingerieur1;
	   employe[3] = ingerieur2;
	   employe[4] = ingerieur3;
	   employe[5] = ingerieur4;

	   for(int i = 0; i < employe.length; i++)
	   {
                montantTotal = employe[i].payHebdo() + montantTotal;
	   }

	   System.out.println("Ceci est le montant total des salaires " + montantTotal+" $");
           
           
           
           Connectage cn=new Connectage();
//           pour l'authentification
           
           Login log = new Login();
           log.show();
           
           int nbr1 ;
           Scanner input = new Scanner(System.in);
           String quest = "Premier chifre";
           do{
               System.out.println(quest);
               nbr1 = input.nextInt();
               quest = "Recommencez";
           }while(nbr1 < 8 || nbr1 > 10);
    }
    
    
    
}
