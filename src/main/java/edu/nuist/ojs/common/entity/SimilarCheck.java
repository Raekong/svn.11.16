package edu.nuist.ojs.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SimilarCheck {

    private long id;
    private long jid;
    private long aid; //论文ID
    private String title;
    private String fileName;
    private String fileType;
    private String checkid;//查重ID
    private int round;   //第几轮查重
    private boolean pass;//是否通过
    private String link;//文件链接
    private String totalSimilar;//总重复率
    private String frsSimilar; //第一个分项率
    private String secSimilar;//第二个分项率
    private String thrSimilar; //第三个分项率

    private boolean uploaded; //是否上传检索
}
