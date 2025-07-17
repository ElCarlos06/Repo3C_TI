package mx.edu.utez.demo3.dao;

import mx.edu.utez.demo3.model.Asignatura;

import java.sql.SQLException;
import java.util.List;

public interface IAsignaturaDao {
    public List<Asignatura> findAll() throws SQLException;
    public Asignatura findAsignaturaById(int id) throws SQLException;
    void create(Asignatura asignatura) throws SQLException;
    void update(Asignatura asignatura) throws SQLException;
    void delete(int id) throws SQLException;
}
