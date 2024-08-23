
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    
    public static Connection getConexion(){
        
        String url= "jdbc:sqlserver://localhost:1433;"
                + "database=Concesionaria;"
                + "user=sa;"
                + "password=Emi7337175.;";
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
