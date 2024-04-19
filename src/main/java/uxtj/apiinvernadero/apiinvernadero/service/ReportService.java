package uxtj.apiinvernadero.apiinvernadero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uxtj.apiinvernadero.apiinvernadero.models.Report;
import uxtj.apiinvernadero.apiinvernadero.repository.ReportRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    public Optional<Report> getReportById(Long id) {
        return reportRepository.findById(id);
    }

    public Report saveReport(Report report) {
        return reportRepository.save(report);
    }

    public Report updateReport(Long id, Report newReport) {
        Optional<Report> optionalReport = reportRepository.findById(id);
        if (optionalReport.isPresent()) {
            Report report = optionalReport.get();
            report.setDate(newReport.getDate());
            report.setTime(newReport.getTime());
            report.setUserID(newReport.getUserID());
            report.setName(newReport.getName());
            report.setObservations(newReport.getObservations());
            return reportRepository.save(report);
        } else {
            return null;
        }
    }

    public void deleteReport(Long id) {
        reportRepository.deleteById(id);
    }
}
