package cn.bssys.po;

public class BsResource {
    private Long id;

    private String permission;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    @Override
    public String toString() {
        return "BsResource{" +
                "id=" + id +
                ", permission='" + permission + '\'' +
                '}';
    }
}