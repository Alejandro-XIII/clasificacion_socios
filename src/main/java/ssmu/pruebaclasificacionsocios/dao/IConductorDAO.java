package ssmu.pruebaclasificacionsocios.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ssmu.pruebaclasificacionsocios.model.Conductor;

import java.util.List;

@Repository
public interface IConductorDAO extends CrudRepository<Conductor,Integer> {
    @Query("FROM Conductor c WHERE c.promedioCalificacion>4")
    public List<Conductor> findByPromedioCalificacionGreaterThan();
}
