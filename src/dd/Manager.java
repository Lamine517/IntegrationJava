/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dd;

/**
 *
 * @author LENOVO
 */
public class Manager extends Employe{

    int nbr_heure_golf;
    public Manager(String prenom, String nom, int ID, int nbr_heures_travail, float taux_horaire) {
        super(prenom, nom, ID, nbr_heures_travail, taux_horaire);
        this.nbr_heure_golf = 0;
    }

    public void ajouterHeureGolfe(int nbr_heure_golf)
    {
        this.nbr_heures_travail = this.nbr_heures_travail + nbr_heure_golf;
        System.out.println("Manager "+this.prenom +" "+this.nom+" votre salaire est "+this.payHebdo());
    }
}
