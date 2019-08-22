package cn.itcast.web;

import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @创建人 xgh
 * @创建时间 2019/7/510:17
 * @描述
 */
@WebServlet(name = "TestServlet",urlPatterns = "/findAll")
public class TestServlet extends BaseServlet {
    //查询功能
    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService productService = new ProductService();
        List<Product> list = productService.findall();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(list);
        response.getWriter().print(json);
    }
    //添加功能
    protected void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     /*   String pid = request.getParameter("pid");
        String pname = request.getParameter("pname");
        String price = request.getParameter("price");
        String imgpath = request.getParameter("imgpath");
        String is_hot = request.getParameter("is_hot");
        String remark = request.getParameter("remark");
        String category_id = request.getParameter("category_id");

        ProductService productService = new ProductService();
        productService.addProduct(pid,pname,price,imgpath,is_hot,remark,category_id);
*/
        try {
            Map<String, String[]> map = request.getParameterMap();
            Product product = new Product();
            BeanUtils.populate(product,map);
            ProductService productService = new ProductService();
            productService.addProduct(product);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
