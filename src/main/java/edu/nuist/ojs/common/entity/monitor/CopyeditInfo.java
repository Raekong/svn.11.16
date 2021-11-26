package edu.nuist.ojs.common.entity.monitor;

import lombok.Data;

@Data
public class CopyeditInfo {
    private long pid;
    private long aid;
    private long eid;
    private String eemail;
    private String ename;

    private String status;
    private String startdate;
    private String enddate;
}
