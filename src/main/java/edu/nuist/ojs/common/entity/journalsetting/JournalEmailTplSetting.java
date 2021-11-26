package edu.nuist.ojs.common.entity.journalsetting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JournalEmailTplSetting {
    private JournalEmailTpl tpl;
	private String recipents;
	private String name;
	private boolean isDefault;
}
