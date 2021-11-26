package edu.nuist.ojs.common.entity.review;

import java.sql.Timestamp;
import java.util.List;

import edu.nuist.ojs.common.entity.article.ArticleFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewResult {
	private long id;
	
	private long reviewActionId;
	private List<ArticleFile> files; 
	private String filesStr;
	private String appropriateness;
	private String clarity;
	private String originality;
	private String substance;
	private String significance;
	private String 	impact;
	private int recommendType;

	private Timestamp timeStamp;
	
	private String commendforAuthor;
	private String commendforEditor;
	
	
	public static String getScoreStr( int score ) {
		String rst = "";
		switch(score) {
		 	case 4:
		 		rst = "Very Strong";
		 		break;
		 	case 3: 
		 		rst = "Strong";
		 		break;
		 	case 2:
		 		rst = "Moderate";
		 		break;	
		 	case 1:
		 		rst = "Poor";
		 		break;
		 	case 0:
		 		rst = "Very Poor";
		 		break;
		}           
		return rst;
	}
	
	public int getScore(String comment ) {
		int rst = -1;
		if(comment!=null) {
			switch(comment) {
		 	case "Very Strong": 
		 		rst = 4;
		 		break;
		 	case "Strong": 
		 		rst = 3;
		 		break;
		 	case "Moderate": 
		 		rst = 2;
		 		break;	
		 	case "Poor": 
		 		rst = 1;
		 		break;
		 	case "Very Poor": 
		 		rst = 0;
		 		break;	
			} 
		}          
		return rst;
	}
}
