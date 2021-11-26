package edu.nuist.ojs.common.entity.article;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import lombok.Data;

@Data
public class Article {
    private long id;
    private long pid;
    private long jid;
    private long sectionId;
    private long submitorId;
    private String title;
    private String abstractTxt;
    private String keywords;

    private List<ArticleAuthor> authors;  
    private List<ArticleFile> files;
    private List<ArticleReviewer> reviewers;

    private Timestamp timeStamp; 

    public Article (){};

    public static Article getArticle(JSONObject obj){
        Article a = JSONObject.toJavaObject(obj, Article.class);
        JSONArray arr = obj.getJSONArray("authors") ;

        List<ArticleAuthor> authors = new LinkedList<>();
        for(int i=0; i<arr.size(); i++) {
            authors.add(JSONObject.toJavaObject(arr.getJSONObject(i), ArticleAuthor.class));
        }
        a.setAuthors(authors);

        arr = obj.getJSONArray("reviewers") ;
        List<ArticleReviewer> reviewers = new LinkedList<>();
        for(int i=0; i<arr.size(); i++) {
            reviewers.add(JSONObject.toJavaObject(arr.getJSONObject(i), ArticleReviewer.class));
        }
        a.setReviewers(reviewers);

        // arr = obj.getJSONArray("files") ;
        // List<ArticleFile> files = new LinkedList<>();
        // for(int i=0; i<arr.size(); i++) {
        //     files.add(JSONObject.toJavaObject(arr.getJSONObject(i), ArticleFile.class));
        // }
        // a.setFiles(files);

        return a;
    }
}
