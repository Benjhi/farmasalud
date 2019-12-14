import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ventanas.ConexionBD;
import ventanas.Interfaz;


public class Usuario extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet rs;
    
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    
public Usuario(){
    initComponents();
}

public void AgregarUsuario(){
    
    String pass=String.valueOf(txtcontraseña.getPassword());
    String SQL="INSERT into usuarios (usuario,contraseña) values(?, ?)";
    
    try {
        PreparedStatement pst=con.prepareStatement(SQL);
        
        pst.setString(1, txtusuario.getText());
        pst.setInt(2, pass);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        
    } catch (Exception e ) {
        JOptionPane.showMessageDialog(null, "Error de Registro" + e.getMessage());
    }
}
    
    
   
}
