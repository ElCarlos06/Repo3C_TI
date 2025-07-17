package mx.edu.utez.demo3.dao.impl;

import mx.edu.utez.demo3.config.DBConnection;
import mx.edu.utez.demo3.dao.ICarreraDao;
import mx.edu.utez.demo3.model.Alumno;
import mx.edu.utez.demo3.model.Carrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarreraDaoImpl implements ICarreraDao {
    @Override
    public List<Carrera> findAll() throws SQLException {
        String sql="SELECT * FROM CARRERA";
        List<Carrera> carreras =new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Carrera carrera=new Carrera();
                carrera.setNombre(rs.getString("NOMBRE"));
                carrera.setDescrpcion(rs.getString("DESCRIPCION"));
                carrera.setId(rs.getInt("ID"));
                carrera.setAlumnos(getAlumnoByCarrera(carrera.getId()));
                carreras.add(carrera);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return carreras;
    }

    @Override
    public Carrera findCarreraById(int id) throws SQLException {
        String sql="SELECT * FROM CARRERA WHERE ID=?";
        Carrera carrera=new Carrera();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                carrera.setNombre(rs.getString("NOMBRE"));
                carrera.setDescrpcion(rs.getString("DESCRIPCION"));
                carrera.setId(rs.getInt("ID"));
            }
            return  carrera;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void create(Carrera carrera) throws SQLException {
        String sql = "INSERT INTO CARRERA (ID, NOMBRE,DESCRIPCION) VALUES (?,?,?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,carrera.getId());
            ps.setString(2,carrera.getNombre());
            ps.setString(3,carrera.getDescrpcion());
            ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Carrera carrera) throws SQLException {
        String sql = "UPDATE CARRERA " +
            "SET NOMBRE = ?, DESCRIPCION = ? " +
            "WHERE ID = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, carrera.getNombre());
            ps.setString(2, carrera.getDescrpcion());
            ps.setInt(3,carrera.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM CARRERA WHERE ID = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<Alumno> getAlumnoByCarrera(int id) throws SQLException {
        String sql = "SELECT A.ID, A.NOMBRE, A.CORREO, C.NOMBRE AS CARRERA " +
                "FROM ALUMNOO A " +
                "JOIN CARRERA C ON A.ID_CARRERA = C.ID " +
                "WHERE A.ID_CARRERA = ?";
        List<Alumno> alumnos = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setNombre(rs.getString("NOMBRE"));
                alumno.setCorreo(rs.getString("CORREO"));
                alumnos.add(alumno);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return alumnos;
    }
    /// /PARA EL FIND ALL
    public static void main(String[] args) {
        CarreraDaoImpl dao = new CarreraDaoImpl();
        try {
            List<Carrera> carreras = dao.findAll();
            for (Carrera c : carreras) {

                for (Alumno alum : c.getAlumnos()) {
                    System.out.println(alum.getNombre());
                    System.out.println(alum.getCorreo());
                    System.out.println(c.getNombre());
                    System.out.println("----------------");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /// ///PARA CREAR
    /*public static void main(String[] args) {
        Carrera nueva = new Carrera();
        nueva.setId(4);
        nueva.setNombre("NANO");
        nueva.setDescrpcion("TP");
        CarreraDaoImpl dao = new CarreraDaoImpl();
        try {
            dao.create(nueva);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/
    /// ///PARA ACTUALIZAR
    /*public static void main(String[] args) {
        Carrera update = new Carrera();
        update.setId(4);
        update.setNombre("NANO1");
        update.setDescrpcion("TP2");
        CarreraDaoImpl dao = new CarreraDaoImpl();
        try {
            dao.update(update);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/
    /*/// ///PARA ELIMINAR
    public static void main(String[] args) {
        Carrera delete = new Carrera();
        delete.setId(4);
        CarreraDaoImpl dao = new CarreraDaoImpl();
        try {
            dao.delete(delete.getId());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/
}
