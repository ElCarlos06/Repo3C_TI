package mx.edu.utez.demo3.dao.impl;

import mx.edu.utez.demo3.config.DBConnection;
import mx.edu.utez.demo3.dao.IAlumnoDao;
import mx.edu.utez.demo3.model.Alumno;
import mx.edu.utez.demo3.model.Asignatura;
import mx.edu.utez.demo3.model.Carrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoImplDao implements IAlumnoDao {
    @Override
    public List<Alumno> findAll() throws SQLException {
        String sql="SELECT * FROM ALUMNOO";
        List<Alumno> alumnos=new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno=new Alumno();
                alumno.setNombre(rs.getString("NOMBRE"));
                alumno.setApellidos(rs.getString("APELLIDOS"));
                alumno.setCorreo(rs.getString("CORREO"));
                alumno.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
                alumno.setIdCarrera(rs.getInt("ID_CARRERA"));
                alumno.setId(rs.getInt("ID"));
                alumno.setAsignaturas(getAsignaturaByAlumno(alumno.getId()));
                alumnos.add(alumno);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return alumnos;
    }

    @Override
    public Alumno findAlumnoById(int id) throws SQLException {
        String sql="SELECT * FROM ALUMNOO WHERE ID=?";
        Alumno alumno=new Alumno();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alumno.setNombre(rs.getString("NOMBRE"));
                alumno.setApellidos(rs.getString("APELLIDOS"));
                alumno.setCorreo(rs.getString("CORREO"));
                alumno.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
                alumno.setIdCarrera(rs.getInt("ID_CARRERA"));
                alumno.setId(rs.getInt("ID"));
            }
            return  alumno;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void create(Alumno alumno) throws SQLException {
        String sql = "INSERT INTO \"ADMIN\".\"ALUMNOO\" (NOMBRE, APELLIDOS, CORREO, FECHA_NACIMIENTO, ID_CARRERA) " +
                "VALUES (?, ?, ?, TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'), ?)";


        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellidos());
            ps.setString(3, alumno.getCorreo());
            ps.setString(4, alumno.getFechaNacimiento().toString() + " 00:00:00");
            ps.setInt(5, alumno.getIdCarrera());

            ps.executeUpdate();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Alumno alumno) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    private List<Asignatura> getAsignaturaByAlumno(int id) throws SQLException {
        String sql = "SELECT AA.ID_ALUMNO, AA.ID_ASIGNATURA, ASIG.* FROM ALUMNO_ASIGNATURA AA\n" +
                "JOIN ASIGNATURA ASIG\n" +
                "ON AA.ID_ASIGNATURA = ASIG.ID\n" +
                "where AA.ID_ALUMNO=?";
        List<Asignatura> asignaturas = new ArrayList<>();
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Asignatura asignatura=new Asignatura();
                asignatura.setNombre(rs.getString("NOMBRE"));
                asignatura.setDescripcion(rs.getString("DESCRIPCION"));
                asignaturas.add(asignatura);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return asignaturas;
    }

    public static void main(String[] args) {
        AlumnoImplDao dao = new AlumnoImplDao();
        try {
            List<Alumno> alumnos = dao.findAll();
            for (Alumno a : alumnos) {
                System.out.println(a.getNombre());
                for (Asignatura asig: a.getAsignaturas()){
                    System.out.println(asig.getNombre());
                    System.out.println("----------------");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
