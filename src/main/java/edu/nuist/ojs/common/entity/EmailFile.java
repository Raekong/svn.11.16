package edu.nuist.ojs.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class EmailFile {
    private String path;//表示本地文件系统路径，或者URL    
    private String fileName;//表示原文件名
    private String fileType;//表示原文件类型
    private boolean islink; //表示是否在云中，如果是云中，则PATH,指的URL，如果不是，则指的是本地路径
}
