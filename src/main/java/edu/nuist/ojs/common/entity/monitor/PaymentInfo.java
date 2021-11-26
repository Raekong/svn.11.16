package edu.nuist.ojs.common.entity.monitor;

import lombok.Data;

@Data
public class PaymentInfo {
    private long pid;
    private long aid;
    private long eid;
    private String eemail;
    private String ename;

    private int apc;
    private int totalpage;
    private String startdate;
    private int totalpaid;

}
