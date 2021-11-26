package edu.nuist.ojs.common.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Message {
   
    private long id;

    private int type; //1.PUBLIHSER, 2, journal, 3 user
    public final static int PUBLISHER = 1;
    public final static int JOURNAL = 2;
    public final static int USER = 3;

    //如果是期刊的业务流，取的是期刊的ID和期刊配置的邮箱，如果没有配置，则使用出版社的邮箱账号
    //如果是出版社的业务流，取的是出版社的ID和出版社配置的邮箱
    //sender
    private String host;
    private int port;
    private String password;
    private String senderName;
    private long sendId;
    private String senderAccount; 

    //receiver
    private long recvId;
    private String recvName;
    private String recvEmail;

    private String configPoint;
    private long timestamp;
    private boolean isEmail;
    private String emailId;
    private String title;
    private String content;

    private List<EmailFile> appends;
    private String appendsJSONStr;

}
