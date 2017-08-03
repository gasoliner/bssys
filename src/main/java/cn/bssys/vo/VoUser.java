package cn.bssys.vo;

import cn.bssys.po.BsUser;

/**
 * Created by 万洪基 on 2017/7/5.
 */
public class VoUser extends BsUser {

    private String voDep;

    private String voSex;

    public VoUser() {
    }

    public VoUser(BsUser user){
        this.setAnswer(user.getAnswer());
        this.setDefenseplace(user.getDefenseplace());
        this.setDefensetime(user.getDefensetime());
        this.setDeptid(user.getDeptid());
        this.setDirection(user.getDirection());
        this.setEmail(user.getEmail());
        this.setEmployeenum(user.getEmployeenum());
        this.setLocked(user.getLocked());
        this.setMajor(user.getMajor());
        this.setPassword(user.getPassword());
        this.setPhone(user.getPhone());
        this.setQuestion(user.getQuestion());
        this.setDirection(user.getDirection());
        this.setRemarks(user.getRemarks());
        this.setRole(user.getRole());
        this.setRoleidsstr(user.getRoleidsstr());
        this.setSalt(user.getSalt());
        this.setSex(user.getSex());
        this.setUsername(user.getUsername());
        this.setUid(user.getUid());
    }

    public String getVoDep() {
        return voDep;
    }

    public void setVoDep(String voDep) {
        this.voDep = voDep;
    }

    public String getVoSex() {
        return voSex;
    }

    public void setVoSex(String voSex) {
        this.voSex = voSex;
    }
}
