package edu.nuist.ojs.common.entity;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    public static final int WAITING = 0;
    public static final int PAYEDANDWAITCHECK = 1;
    public static final int CHECKED = 1;

    public static final String WIRE = "Wire Transfer";
    public static final String ONLINE = "Online";

	private long id;
	
	private long aid;
    private long jid;
    //这是由编辑设置的支付参数
	private int orgPageNumber;
	private int orgTotalAPC;
    private int orgWire;
    private int orgOnline;
    
    //这是用户设置的真实支付参数,如果是外链是可以空的
    private long userId;
	private int payPageNumber;
    private int payTotal;
	private String payType;
	private String payEmail;

	// 0,待支付 1,待审查 2,完成支付
	private int state;
	
	//外链ID
	private String linkMd5;
	//如果是使用文件上传则要保存上传文件的ID
    private long wireFileId;

	//支付时间
	private Timestamp paytime; 
	private Timestamp timeStamp; 

	 //是否补交
	 private boolean isBack;
}
