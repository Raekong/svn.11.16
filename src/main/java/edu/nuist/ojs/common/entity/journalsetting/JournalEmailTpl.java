package edu.nuist.ojs.common.entity.journalsetting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class JournalEmailTpl {
    private String title;
	private String tpl;
	private String messagetpl;
}
