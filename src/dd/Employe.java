/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dd;

import java.util.UUID;

/**
 *
 * @author LENOVO
 */
public class Employe
{
    String prenom , nom;
    int ID , nbr_heures_travail;
    float taux_horaire = (float) 1.0, paiement = 0;
    float salaire = (taux_horaire*40)/100;
    float prime = (float) (this.salaire * (1.5));
    public Employe(String prenom, String nom, int ID, int nbr_heures_travail, float taux_horaire)
    {
        this.prenom = prenom;
        this.nom = nom;
        this.ID = ID;
        this.nbr_heures_travail = nbr_heures_travail;
        this.taux_horaire = taux_horaire;
    }

    public float payHebdo()
    {
        if(this.nbr_heures_travail > 40 && this.nbr_heures_travail <= 60)
        {
            return this.paiement = this.nbr_heures_travail * this.salaire + this.prime;
        }

        //salaire horaire minimal 8$ /heure
        double salaire_horaire_minimal = 8;
        if(this.salaire < salaire_horaire_minimal){
            System.out.println(" IMPOSSIBLE : Votre salaire est inferieur a 8$");
        }

        if(this.nbr_heures_travail > 60){
            System.out.println("IMPOSSIBLE : Votre nombre d'heures de travail depasse les 60 heures");
        }
        return this.paiement;
    }
       
    }
        
        
    

