package uxtj.apiinvernadero.apiinvernadero.projections;

import java.util.Date;

public interface ViewReportProjection {
    Long getReportID();
    Date getDate();
    String getTime();
    String getObservations();
}