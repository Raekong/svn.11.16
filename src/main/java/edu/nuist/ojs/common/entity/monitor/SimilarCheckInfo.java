package edu.nuist.ojs.common.entity.monitor;
import lombok.Data;

@Data
public class SimilarCheckInfo {
    private long pid;
    private long aid;
    private long eid;
    private String eemail;
    private String ename;

    private int totalrounds;
    private String startdate;
    private String status;
    
}
