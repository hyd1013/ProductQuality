package cn.bdqn.model.param;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName: ProductParam
 * @Description:
 * @Date: 2022-11-09 16:00:14
 * @Author: HuangYaoDong
 */
@Data
public class ProductParam {

    private String id;
    private String productName;
    private String productDesc;
    private int productSum;
    private BigDecimal productPrice;
    private String productDate;

}
