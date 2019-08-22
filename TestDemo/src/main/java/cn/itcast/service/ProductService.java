package cn.itcast.service;

import cn.itcast.dao.ProductDao;
import cn.itcast.domain.Product;

import java.util.List;

/**
 * @创建人 xgh
 * @创建时间 2019/7/510:22
 * @描述
 */
public class ProductService {
    public List<Product> findall() {
        ProductDao productDao = new ProductDao();
       return productDao.findAll();

    }

    /*public void addProduct(String pid, String pname, String price, String imgpath, String is_hot, String remark, String category_id) {
      *//*  ProductDao productDao = new ProductDao();
        productDao.addProduct(pid,pname,price,imgpath,is_hot,remark,category_id);*//*
    }*/

    public void addProduct(Product product) {
        ProductDao productDao = new ProductDao();
        productDao.addProduct(product);
    }
}
