package edu.nuist.ojs.common.entity.article;

import lombok.Data;

@Data
public class ArticleReviewer {
    private long id;

    private long aid;
    private String email;
    private String name;
    private String affiliation;
    private String researchfield;
} 
