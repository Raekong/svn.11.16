package edu.nuist.ojs.common.entity.monitor;
import lombok.Data;

@Data
public class ReviewActionInfo {
    private long pid;
    private long aid;
    private long rid;
    private String remail;
    private String rname;

    private String result;
    private String startdate;
    private String enddate;
}
