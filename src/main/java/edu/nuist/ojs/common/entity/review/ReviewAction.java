package edu.nuist.ojs.common.entity.review;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewAction {
	private long id;
	private long roundId;
	private long reviewId;
	private String responseDue;
	private String reviewDue;

	public static final int REQUESTED = 0;	//邀请
	public static final int REJECT = 1;		//拒绝
	public static final int REVIEW = 2;		//审稿
	public static final int COMPLETE = 3;	//审稿
	public static final int CLOSE = 4;	//审稿
	public static final int RESPONSEOVERDUE = 5;// 邀请回复逾期
	public static final int REVIEWOVERDUE = 6; // 审稿逾期
	
	public static final String[][] status = {
		{"Requested", "邀请中"},{"Rejected", "拒绝邀请"},{"Reviewing", "审稿中"}
		,{"Completed", "审稿结束"},{"Closed", "被中止"},{"Response Over Due", "邀请回复逾期"},
		{"Reviewing Over Due", "审稿逾期"}
	};

	private Timestamp creatTimestamp;
	
	private int curstate;
	private long articleId;
	private long editorId;
	private boolean closed;
	private long lastUpdate;  
	private int resultType;
	private String reviewerName;
	private String reviewerEmail;
	private String fileJson;
	private boolean end(){
		return false;
	}
}
