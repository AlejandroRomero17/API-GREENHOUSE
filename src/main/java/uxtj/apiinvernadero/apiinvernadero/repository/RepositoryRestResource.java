package uxtj.apiinvernadero.apiinvernadero.repository;

import uxtj.apiinvernadero.apiinvernadero.projections.ViewReportProjection;

public @interface RepositoryRestResource {

    Class<ViewReportProjection> excerptProjection();

}
