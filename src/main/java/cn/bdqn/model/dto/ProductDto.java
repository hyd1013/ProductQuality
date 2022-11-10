package cn.bdqn.model.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName: ProductDto
 * @Description:
 * @Date: 2022-11-09 14:43:57
 * @Author: HuangYaoDong
 */
@Data
public class ProductDto {
    private int id;
    private String productName;
    private String productDate;
    private int productSum;
    private String productDesc;
    private BigDecimal productPrice;
    private int score;

}
