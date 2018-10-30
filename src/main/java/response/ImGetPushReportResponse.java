package response;

import model.PushReport;

import java.util.List;

public class ImGetPushReportResponse extends GeneralResponse{
    private List<PushReport> Reports;

    public List<PushReport> getReports() {
        return Reports;
    }

    public void setReports(List<PushReport> reports) {
        Reports = reports;
    }
}
