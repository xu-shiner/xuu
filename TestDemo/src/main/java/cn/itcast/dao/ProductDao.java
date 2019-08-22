package cn.itcast.dao;

import cn.itcast.domain.Product;
import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @创建人 xgh
 * @创建时间 2019/7/510:23
 * @描述
 */
public class ProductDao {
    public  List<Product> findAll() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDatasource());
        String sql ="select * from product";
        List<Product> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
        return list;
    }

    public void addProduct(Product p) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDatasource());
        String sql ="update product values(?,?,?,?,?,?,?)";
        Object[] params={p.getPid(),p.getPname(),p.getImgpath(),p.getRemark(),p.isIs_hot(),p.getPrice(),p.getCategory_id()};
        int count = jdbcTemplate.update(sql, params);
    }

  /*  public void addProduct(String pid, String pname, String price, String imgpath, String is_hot, String remark, String category_id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDatasource());
        String sql ="update product values(?,?,?,?,?,?,?)";
         Object[] params={};
        int count = jdbcTemplate.update(sql, params);
    }*/
}
