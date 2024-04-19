package uxtj.apiinvernadero.apiinvernadero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uxtj.apiinvernadero.apiinvernadero.models.Report;
import uxtj.apiinvernadero.apiinvernadero.projections.ViewReportProjection;
import uxtj.apiinvernadero.apiinvernadero.repository.ViewReportRepository;

import java.util.List;

@Service
public class ViewReportService {

    @Autowired
    private ViewReportRepository viewReportRepository;

    public List<Report> getAllViewReports() {
        return viewReportRepository.findAll();
    }
}
