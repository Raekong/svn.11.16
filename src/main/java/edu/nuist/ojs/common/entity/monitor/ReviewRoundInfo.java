package edu.nuist.ojs.common.entity.monitor;

import lombok.Data;

@Data
public class ReviewRoundInfo {
    private long pid;
    private long aid;
    private int seq;
    private String reviewers;

    private int total;
    private int completed;
    private int reviewing;
    private int overdue;
    private int decline;
    
    private String result;
}
