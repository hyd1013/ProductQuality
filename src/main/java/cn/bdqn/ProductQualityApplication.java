package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: ProductQualityApplication
 * @Description:
 * @Date: 2022-11-09 14:30:00
 * @Author: HuangYaoDong
 */
@MapperScan(basePackages = "cn.bdqn.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class ProductQualityApplication {

    //dto 代表返回的数据模型，最终响应到前端
    //pojo 代表内部使用的数据模型，不被前端及其他数据影响
    //param 代表参数模型，用来接受前端请求传输的参数

    public static void main(String[] args) {
        //springboot启动run方法
        SpringApplication.run(ProductQualityApplication.class,args);
    }

}
