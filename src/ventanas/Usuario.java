import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.SQLException;
import ventanas.ConexionBD;
import ventanas.Interfaz;


public class Usuario {
    PreparedStatement ps;
    ResultSet rs;
    
    
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    
    public Interfaz ValidarUsuario(String Nombre, String Contraseña){
        Interfaz ev=new Interfaz();
        String sql="SELECT * FROM usuarios where Nombre=? and Contraseña=?";
        try {
            cn=con.ConexionBD();
            ps.cn.prepareStatement(sql);
            ps.setString(1. Nombre);
            ps.setString(2. Contraseña);
            rs=ps.executeQuery();
            while (rs.next()){
                ev.setNombre(rs.getNombre(1));
                ev.setContraseña(rs.getString(2));
            }
        }catch (Exception e){
        
    }
    return ev;
    
    
    }
}
