package edu.nuist.ojs.common.entity.journalsetting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JournalSetting { //journal设置
	private long id;
	private long journalId;
	private String configPoint;
	private String configContent;

}
