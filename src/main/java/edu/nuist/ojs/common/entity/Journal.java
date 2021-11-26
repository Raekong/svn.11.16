package edu.nuist.ojs.common.entity;


import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Journal { //出版社
	private long journalId;

	private long pid;

	private String title;

	private String abbreviation;

	private double jOrder;

	private String cover;

	private String publisher;

	private String researchfield;

	private String onlineissn;

	private String printissn;

	private String jsummary;

	private String jabout;
	
	private boolean isComplete;

	private String emaillist;

	private String principalname;

	private String principaltitle;

	private String principalemail;

	private String principalphone;

	private String principalAffiliation;

	private String supportname;

	private String supportemail;

	private String supportphone;

	private List<String> mailList;
	

}
