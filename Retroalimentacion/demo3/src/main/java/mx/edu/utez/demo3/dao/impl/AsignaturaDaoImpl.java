package mx.edu.utez.demo3.dao.impl;

import mx.edu.utez.demo3.config.DBConnection;
import mx.edu.utez.demo3.dao.IAsignaturaDao;
import mx.edu.utez.demo3.model.Alumno;
import mx.edu.utez.demo3.model.Asignatura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AsignaturaDaoImpl implements IAsignaturaDao {

    @Override
    public List<Asignatura> findAll() throws SQLException {
        String sql="SELECT * FROM ASIGNATURA";
        List<Asignatura> asignaturas =new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Asignatura asignatura=new Asignatura();
                asignatura.setNombre(rs.getString("NOMBRE"));
                asignatura.setDescripcion(rs.getString("DESCRIPCION"));
                asignatura.setId(rs.getInt("ID"));
                asignatura.setAlumnos(getAlumnoByAsignatura(asignatura.getId()));
                asignaturas.add(asignatura);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return asignaturas;
    }

    @Override
    public Asignatura findAsignaturaById(int id) throws SQLException {
        String sql="SELECT * FROM ASIGNATURA WHERE ID=?";
        Asignatura asignatura=new Asignatura();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                asignatura.setNombre(rs.getString("NOMBRE"));
                asignatura.setDescripcion(rs.getString("DESCRIPCION"));
                asignatura.setId(rs.getInt("ID"));
            }
            return  asignatura;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void create(Asignatura asignatura) throws SQLException {
        String sql = "INSERT INTO ASIGNATURA (ID,NOMBRE) VALUES (?,?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,asignatura.getNombre());
            ps.setString(2,asignatura.getDescripcion());
            ps.executeQuery();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Asignatura asignatura) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    private List<Alumno> getAlumnoByAsignatura(int id) throws SQLException {

        return List.of();
    }

    public static void main(String[] args) {
        AsignaturaDaoImpl dao = new AsignaturaDaoImpl();
        try {
            List<Asignatura> asignaturas = dao.findAll();
            for (Asignatura a : asignaturas) {
                System.out.println(a.getNombre());
                for (Alumno alum: a.getAlumnos()){
                    System.out.println(alum.getNombre());
                    System.out.println("----------------");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
