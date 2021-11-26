package edu.nuist.ojs.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRoleRelation {

    private long id;

    private long journalId;//判断是否原生，等同于jid

    private long roleId;

    private long userId;
}
