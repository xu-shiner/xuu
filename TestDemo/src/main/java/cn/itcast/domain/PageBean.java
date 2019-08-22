package cn.itcast.domain;

import java.util.List;

// 封装分页需要的数据
@SuppressWarnings("all")
public class PageBean {
    private List list;  //页面要展示的数据
    private int totalCount;    // 总条数
    private int totalPage;     // 总页数
    private int pageNumber;   //  当前页
    private int pageSize;     //  每页展示的条数

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
