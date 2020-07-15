/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietas1;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SYSTEMNET
 */
public class Conexion {
    Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaConexion ="jdbc:mysql://127.0.0.1/dietas";
    private String usuario ="root";
    private String clave = "";
    
    public Conexion(){
        
        
        try{
          Class.forName(driver);
          con= DriverManager.getConnection(cadenaConexion, usuario, clave);
          JOptionPane.showMessageDialog(null, "Se ha establecido conexion con la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido establecer una conexion con la base de datos"+e.getMessage());
        }
       
    }
    
    public Connection getConnection(){
        return con;
    }
}












