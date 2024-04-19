package uxtj.apiinvernadero.apiinvernadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uxtj.apiinvernadero.apiinvernadero.projections.ViewReportProjection;
import uxtj.apiinvernadero.apiinvernadero.repository.ViewReportRepository;
// import uxtj.apiinvernadero.apiinvernadero.models.Report;

import java.util.List;

@RestController
@RequestMapping("/api/greenhousecontrol/v1/viewreport")
public class ViewReportController {

    @Autowired
    private ViewReportRepository viewReportRepository;

    // Método GET
    @GetMapping
    public List<ViewReportProjection> getAllViewReports() {
        return viewReportRepository.findAllProjectedBy();
    }

    // informe por su ID
    @GetMapping("/{reportID}")
    public ViewReportProjection getViewReportById(@PathVariable Long reportID) {
        return viewReportRepository.findByReportIDProjectedBy(reportID);
    }
}
