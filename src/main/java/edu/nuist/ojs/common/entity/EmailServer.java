package edu.nuist.ojs.common.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class EmailServer implements Serializable {
    private String host;
    private String port;
    private String username;
    private String password;
    private String toName;
    private String toAddress;
    private String subject;
    private String content;
    private String messageId;
    private String name;
    private List<EmailFile> emailFiles;
    

}
