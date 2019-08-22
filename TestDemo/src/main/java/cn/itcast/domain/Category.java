package cn.itcast.domain;

/**
 * @创建人 xgh
 * @创建时间 2019/7/59:10
 * @描述
 * 设计商品分类实体类 Category  :   分类id   cid    分类名称 cname
 */
public class Category {
    private int cid;
    private String cname;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
