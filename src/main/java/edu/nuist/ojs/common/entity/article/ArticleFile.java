package edu.nuist.ojs.common.entity.article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleFile {
    private long id;

    private long aid;
    private String version;
    private String fileType;
    private String innerId;
    private String originName;

}
