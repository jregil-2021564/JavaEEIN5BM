
package modelo;
 
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Cliente;
 
public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public Cliente validar(String correoCliente, String contrasena) {
        //Instanciar el objeto de la entidad Cliene
        Cliente cliente = new Cliente();
        //Agregar una variable de tipo string para nuestra consulta sql
        String sql = "select * from Cliente where correoCliente = ? and contrasena = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            ps.setString(1, correoCliente);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente.setCodigoCliente(rs.getInt("codigoCliente"));
                cliente.setNombreCliente(rs.getString("nombreCliente"));
                cliente.setContrasena(rs.getString("contrasena"));
            }
        } catch (Exception e) {
            System.out.println("El usuario o contrasena son incorrectos");
            e.printStackTrace();
        }
        return cliente;
    }
}
