package cn.bssys.vo;

import cn.bssys.po.BsDefengroup;

/**
 * Created by 万洪基 on 2017/6/29.
 */
public class VodefenseGroup extends BsDefengroup {

    public VodefenseGroup() {
    }

    public VodefenseGroup(BsDefengroup bsDefengroup) {
        this.setGroupid(bsDefengroup.getGroupid());
        this.setId(bsDefengroup.getId());
        this.setMembers(bsDefengroup.getMembers());
        this.setLeader(bsDefengroup.getLeader());
        this.setCollege(bsDefengroup.getCollege());
    }
}
