package edu.nuist.ojs.common.entity.monitor;

import lombok.Data;

@Data
public class PaymentHistory {
    private long pid;
    private long aid;
    private String paydate;
    private String paytype;
    private int paynum;
    private int paid;
    private String payemail;
}
