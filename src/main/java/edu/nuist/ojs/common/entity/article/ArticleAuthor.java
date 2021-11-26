package edu.nuist.ojs.common.entity.article;
import java.util.List;

import lombok.Data;
@Data
public class ArticleAuthor {
    private long id;
    private int order;
    private long aid;
    private String name;
    private String email;
    private String affiliation;
    private String country;
    private boolean corresponding;

}
