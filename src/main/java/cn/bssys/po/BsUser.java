package cn.bssys.po;

public class BsUser {
    private Long uid;

    private String employeenum;

    private String username;

    private String password;

    private String salt;

    private Integer deptid;

    private String phone;

    private String email;

    private String roleidsstr;

    private Boolean locked;

    private String role;

    private Integer sex;

    private Integer major;

    private Integer title;

    private String question;

    private String answer;

    private String direction;

    private String remarks;

    private String defensetime;

    private String defenseplace;

    private Integer kind;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getEmployeenum() {
        return employeenum;
    }

    public void setEmployeenum(String employeenum) {
        this.employeenum = employeenum == null ? null : employeenum.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRoleidsstr() {
        return roleidsstr;
    }

    public void setRoleidsstr(String roleidsstr) {
        this.roleidsstr = roleidsstr == null ? null : roleidsstr.trim();
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDefensetime() {
        return defensetime;
    }

    public void setDefensetime(String defensetime) {
        this.defensetime = defensetime == null ? null : defensetime.trim();
    }

    public String getDefenseplace() {
        return defenseplace;
    }

    public void setDefenseplace(String defenseplace) {
        this.defenseplace = defenseplace == null ? null : defenseplace.trim();
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }
}