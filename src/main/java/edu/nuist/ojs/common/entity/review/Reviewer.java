package edu.nuist.ojs.common.entity.review;


import edu.nuist.ojs.common.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reviewer {
	private long id;
	private String name;
	private String email;
	
	private String affiliation;
	private String researchField;
	private long userId = -1l;
	
	public Reviewer( User u ) { 
		this.affiliation = (u.getAffiliation() == null ? "-" : u.getAffiliation());
		this.name = (u.getUsername() == null ? "-" : u.getUsername());
		this.email = (u.getEmail() == null ? "-" : u.getEmail());
		this.researchField = (u.getInterests() == null ? "" : u.getInterests());
		this.userId = u.getUserId();
	}
	
	
	public Reviewer(String researchField, String affiliation, String name, String email ) {
		this.affiliation = (affiliation == null ? "-" : affiliation);
		this.researchField = (researchField == null ? "-" : researchField);
		this.name = (name == null ? "-" : name);
		this.email = (email == null ? "-" : email);
	}
	
}
