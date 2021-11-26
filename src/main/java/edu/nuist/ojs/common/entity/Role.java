package edu.nuist.ojs.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {

    private long id;

    private String abbr;

    private String zh;

    private String en;

    private long sameLevel; //默认为0

    private long journalId; //等同jid

    private String name;

    public void setI18N(boolean isZh){
        if(isZh){
            this.name = this.zh;
            if(this.name == null) this.name = this.en;
        }else{
            this.name = this.en;
            if(this.name == null) this.name = this.zh;
        }
        
    }

}
