package model;

public class PushReport {
    private Integer Status;
    private String StartTime;
    private Integer Finished;
    private Integer Total;

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public Integer getFinished() {
        return Finished;
    }

    public void setFinished(Integer finished) {
        Finished = finished;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        Total = total;
    }
}
