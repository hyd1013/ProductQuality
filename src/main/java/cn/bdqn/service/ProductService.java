package cn.bdqn.service;

import cn.bdqn.model.dto.ProductDto;
import cn.bdqn.model.param.ProductParam;

import java.util.List;

/**
 * @ClassName: ProductService
 * @Description:
 * @Date: 2022-11-09 14:51:58
 * @Author: HuangYaoDong
 */
public interface ProductService {

    List<ProductDto> queryAll(String conditions);

    void delete(int id);

    void add(ProductParam productParam);
}
