package edu.nuist.ojs.common.entity.article;

import lombok.Data;

@Data
public class ArticleDisscusion {
    public final static int AHTHOR = 1;
    public final static int MANAGER = 2;

    private long id;
    private long aid;
    private long sendId;
    private long receId;
    private String sendEmail;
    private long msgId;
    private int type;
}

