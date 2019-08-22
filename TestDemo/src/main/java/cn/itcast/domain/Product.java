package cn.itcast.domain;

/**
 * @创建人 xgh
 * @创建时间 2019/7/59:10
 * @描述
 * 设计商品实体类Product： 商品id , 商品名称pname , 商品价格price，商品类别category_id ,
 * 商品是否热门 is_hot ，商品图片路径imgpath，商品描述：remark
 *
 */
public class Product {
    private int pid;
    private  String pname;
    private int price;
    private String imgpath;
    private boolean is_hot;
    private String remark;
    private int category_id;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public boolean isIs_hot() {
        return is_hot;
    }

    public void setIs_hot(boolean is_hot) {
        this.is_hot = is_hot;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
