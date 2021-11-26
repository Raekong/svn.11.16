package edu.nuist.ojs.common.entity.monitor;
import lombok.Data;

@Data
public class ArticleInfos {
    private long pid;
    private long aid;
    private long eid;
    private String eemail;
    private String ename;
    private String title;

    private String subdate;
    private String enddate;
    private long subid;
    private String subemail;
    private String subname;

    private String authors;
    
    private long jid;
    private String jtitle;
    private long sid;
    private String stitle;

    private int sindex;
    private String status;
}
