package cn.bdqn.mapper;

import cn.bdqn.model.dto.ProductDto;
import cn.bdqn.model.param.ProductParam;

import java.util.List;

/**
 * @ClassName: ProductMapper
 * @Description:
 * @Date: 2022-11-09 14:46:11
 * @Author: HuangYaoDong
 */
public interface ProductMapper {

    List<ProductDto> queryAll(String conditions);

    void delete(int id);

    void add(ProductParam productParam);

    void addQue(String id);
}
