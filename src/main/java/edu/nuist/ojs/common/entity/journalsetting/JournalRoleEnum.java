package edu.nuist.ojs.common.entity.journalsetting;


public class JournalRoleEnum {
    public static final JournalRole AUTHOR =  new JournalRole(-1, "author", "作者", "Author", null);
    public static final JournalRole PREREVIEWER =  new JournalRole(-1, "perreviewer", "预审人", "Pre-Reviewer", null);
    public static final JournalRole REVIEWER =  new JournalRole(-1, "reviewer", "审稿人", "Reviewer", null);
    public static final JournalRole MANAGER =  new JournalRole(-1, "manager", "期刊主管", "Journal Manager", null);
    public static final JournalRole OFFICE =  new JournalRole(-1, "office", "编辑主管", "Editorial Office", null);
    public static final JournalRole CHIEF =  new JournalRole(-1, "chief", "主编", " Editor in Chief", null);
    public static final JournalRole ACHIEF =  new JournalRole(-1, "achief", "副主编", "Associate Editor in Chief", null);
    public static final JournalRole SECTION =  new JournalRole(-1, "section", "责任编辑", "Section Editor", null);
    public static final JournalRole GUEST =  new JournalRole(-1, "guest", "客座编辑", "Guest Editor", null);
    public static final JournalRole FINANCIAL =  new JournalRole(-1, "financial", "财务编辑", "Financial Editor", null);
    public static final JournalRole PRODUCTION =  new JournalRole(-1, "production", "出版编辑", "Production Editor", null);
    public static final JournalRole COPY =  new JournalRole(-1, "copy", "排版编辑", "Copy Editor", null);
    public static final JournalRole SIMILARITY =  new JournalRole(-1, "similarity", "查重编辑", "Similarity Checker", null);

    //这个角色的排列顺序必须固定，代表着权限从大到小
    public static JournalRole[] getAllOriginRolesForJournal(){
        JournalRole[] rst = new JournalRole[13];
        rst[0] = MANAGER; rst[1] = OFFICE; rst[2] = CHIEF; rst[3] = ACHIEF; 
        rst[4] = SECTION; rst[5] = GUEST; rst[6] = FINANCIAL; rst[7] = PRODUCTION; rst[8] = COPY; rst[9] = SIMILARITY; rst[10] = PREREVIEWER;
        rst[11] = AUTHOR; rst[12] = REVIEWER; 
        return rst;
    };
}
