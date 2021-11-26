package edu.nuist.ojs.common.entity.article;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleHistory {
    private long id;
    private long aid;
    private String workflow;
    private String status;
    private int round;  
    private String desc;
    private long userId;
    private String username;
    private String userEmail;
    private long msgId;    
    private Timestamp stamp;

    public String getFileVersion(){
        return this.getWorkflow() + "-" + this.getRound();
    }
}

