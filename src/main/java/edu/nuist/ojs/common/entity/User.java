package edu.nuist.ojs.common.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements SessionKey {
	private long userId;

	private String username;

	private String password;

	private String firstname;

	private String middlename;

	private String lastname;

	private String title;

	private String email;

	private String url;

	private String mailing_address;

	private String country;

	private boolean disabled;

	private Byte inline_help;

	private String affiliation;

	private String interests;

	private boolean isActived;
	
	private String role;
	
	public String getUserFullName() {
		return this.firstname + " " + (this.middlename!=null?"":this.middlename + " ") + (this.lastname!=null?"":this.lastname + " ");
	}
	private boolean superUser ;		//是否超级用户

	private boolean root ;	//是否出版社管理员

	private long publisherId;	//用户所属出版社Id超级用户不属于任一出版社，该值为0；-1为出错无对应出版社

	private String i18n = I18N.EN;

	@Override
	public String get(Object O) {
		return this.getClass().getSimpleName() +"-"+ this.userId;
	}
}
