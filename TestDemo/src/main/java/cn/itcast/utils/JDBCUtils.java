package cn.itcast.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @创建人 xgh
 * @创建时间 2019/6/221:01
 * @描述
 */
public class JDBCUtils {

    private static DataSource dataSource;

    static {
        Properties prop = new Properties();
        InputStream is = JDBCUtils.class.getResourceAsStream("/druid.properties");
        try {
            prop.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(prop);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        //创建核心对象
        public static DataSource getDatasource(){
        return  dataSource;
        }
}

