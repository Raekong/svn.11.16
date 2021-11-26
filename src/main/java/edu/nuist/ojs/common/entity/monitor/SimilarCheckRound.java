package edu.nuist.ojs.common.entity.monitor;
import lombok.Data;

@Data
public class SimilarCheckRound {
    private long pid;
    private long aid;
    private String result;
    private int total;
    private int first;
    private int second;
    private int third;

    
    private int seq;
}
