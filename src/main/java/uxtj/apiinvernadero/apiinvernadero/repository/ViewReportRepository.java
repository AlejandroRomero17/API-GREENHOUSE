package uxtj.apiinvernadero.apiinvernadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uxtj.apiinvernadero.apiinvernadero.models.Report;
import uxtj.apiinvernadero.apiinvernadero.projections.ViewReportProjection;

import java.util.List;

@Repository
public interface ViewReportRepository extends JpaRepository<Report, Long> {
    
    // Definimos una consulta utilizando @Query para seleccionar solo los campos deseados
    @Query("SELECT r.reportID as reportID, r.date as date, r.time as time, r.observations as observations FROM Report r")
    List<ViewReportProjection> findAllProjectedBy();
    
    // Método para obtener un informe por su ID con la proyección
    @Query("SELECT r.reportID as reportID, r.date as date, r.time as time, r.observations as observations FROM Report r WHERE r.reportID = ?1")
    ViewReportProjection findByReportIDProjectedBy(Long reportID);
}
