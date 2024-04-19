package uxtj.apiinvernadero.apiinvernadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uxtj.apiinvernadero.apiinvernadero.models.Report;
import uxtj.apiinvernadero.apiinvernadero.service.ReportService;

import java.util.List;

@RestController
@RequestMapping("/api/greenhousecontrol/v1/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    // Método GET para obtener todos los informes
    @GetMapping
    public List<Report> getAllReports() {
        return reportService.getAllReports();
    }

    // Método POST para agregar un nuevo informe
    @PostMapping
    public Report addReport(@RequestBody Report report) {
        return reportService.saveReport(report);
    }

    // Método PUT para actualizar un informe existente
    @PutMapping("/{reportID}")
    public Report updateReport(@PathVariable Long reportID, @RequestBody Report updatedReport) {
        return reportService.updateReport(reportID, updatedReport);
    }

    // Método DELETE para eliminar un informe por su ID
    @DeleteMapping("/{reportID}")
    public void deleteReport(@PathVariable Long reportID) {
        reportService.deleteReport(reportID);
    }
}
