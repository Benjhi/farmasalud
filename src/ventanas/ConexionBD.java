/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;

/**
 *
 * @author renzo
 */
public class ConexionBD {

    static com.mysql.jdbc.Statement createStatements() {
        return null;
        
    }
    Connection cn;
    
    public Connection conexion(){
        
        try {
        
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/farmasalud","root","123456789");
        System.out.println("Se la conexion exitosamente");
        
        
    }catch(Exception e){
        System.out.println(e.getMessage());
    }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
    
    
}
