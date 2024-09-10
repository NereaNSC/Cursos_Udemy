package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO{

    // METODO LISTAR CLIENTE
    @Override
    public List<Cliente> listarCliente() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;   // objeto para preparar la sentencias SQL
        ResultSet rs;   // Objeto que obtiene el resultado de la consulta
        Connection con = Conexion.getConexion();
        var sql = "SELECT * FROM cliente ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var cliente = new Cliente ();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }

        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return clientes;
    }

    // METODO BUSCAR CLIENTE POR ID
    @Override
    public boolean buscarClientePorID(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.getConexion();
        var sql = "SELECT * FROM cliente WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar cliente por ID: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conecxión: " + e.getMessage());
            }
        }
        return false;
    }

    // METODO AGREGAR CLIENTE
    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "INSERT INTO cliente (nombre, apellido, membresia) " + " VALUES (?, ?, ?) ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al añadir un cliente nuevo: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    // METODO MODIFICAR CLIENTE
    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "UPDATE cliente SET nombre=?, apellido=?, membresia=? " + "WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar el cliente: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return false;
    }

    // METODO ELIMINAR CLIENTE
    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        String sql = "DELETE FROM cliente WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar el cliente: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch(Exception e){
                System.out.println("Error al cerrar conexión : " + e.getMessage());
            }
        }
        return false;
    }
}