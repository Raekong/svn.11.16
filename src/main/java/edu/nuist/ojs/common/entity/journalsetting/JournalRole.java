package edu.nuist.ojs.common.entity.journalsetting;

import edu.nuist.ojs.common.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JournalRole {
    public static final int ORG = -1;
    private long jid;    //如果是-1，就是原生，如果不是就是用户自定义
    private String abbr;
    private String zh;
    private String en;
    private String sameAbbr; //等同的角色权限，原生为 NULL

    
    public boolean equals(JournalRole r){
        String a1 = "";
        String a2 = "";
        if(this.jid != ORG) a1 = this.sameAbbr;  //如果不是原生，则取相同权限原生缩写
        if(r.getJid() != ORG) a2 = r.getSameAbbr();  //如果不是原生，则取相同权限原生缩写

        return a1.equals(a2);
    }

    public Role getRole(){ //journalRole转换成role 默认role的sameLevel值为0
        return Role.builder()
                   .abbr(this.abbr)
                   .en(this.en)
                   .zh(this.zh)
                   .journalId(this.jid)
                   .sameLevel(0)
                   .build();

    }

    public JournalRole(Role r){ //传递role转换成journalRole
        if(r.getSameLevel() != 0){ //自定义的角色
            this.abbr = JournalRoleEnum.getAllOriginRolesForJournal()[(int)r.getSameLevel()].getAbbr();
        }else{
            this.abbr = r.getAbbr();
        } 
        this.en = r.getEn();
        this.zh = r.getZh();
        this.sameAbbr = r.getSameLevel()+"";
        this.jid = r.getJournalId();
    }

}
