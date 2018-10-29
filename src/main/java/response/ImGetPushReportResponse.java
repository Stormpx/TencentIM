package response;

import java.util.List;

public class ImGetPushReportResponse {
    private List<PushReport> Reports;

    public List<PushReport> getReports() {
        return Reports;
    }

    public void setReports(List<PushReport> reports) {
        Reports = reports;
    }
}
