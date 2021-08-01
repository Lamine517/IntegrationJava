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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectage {
	Connection con;
	public Connectage(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
//			con=DriverManager.getConnection("jdbc:mysql://localhost/gestion_paiement","root","");
                        con = DriverManager.getConnection ("jdbc:mysql://localhost/gestion_paiement?characterEncoding=utf8&useSSL=false&useUnicode=true","root","") ;
			System.out.println("bien connectée!");
		}
		catch(ClassNotFoundException | SQLException ex){
			
			System.out.println("probleme de connection!");	
		}
	}
        //ma fonction laconnexion()
	public Connection laconnexion(){
		return con;
	}

}

