package cn.bdqn.service.impl;

import cn.bdqn.mapper.ProductMapper;
import cn.bdqn.model.dto.ProductDto;
import cn.bdqn.model.param.ProductParam;
import cn.bdqn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: ProductServiceImpl
 * @Description:
 * @Date: 2022-11-09 14:52:04
 * @Author: HuangYaoDong
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDto> queryAll(String conditions) {
        return productMapper.queryAll(conditions);
    }

    @Override
    public void delete(int id) {
        productMapper.delete(id);
    }

    @Override
    public void add(ProductParam productParam) {
        productMapper.add(productParam);
        productMapper.addQue(productParam.getId());
    }
}
