package cn.bdqn.controller;

import cn.bdqn.model.dto.ProductDto;
import cn.bdqn.model.param.ProductParam;
import cn.bdqn.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: ProductController
 * @Description:
 * @Date: 2022-11-09 14:54:29
 * @Author: HuangYaoDong
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    //当使用@Controller注解时，controller默认返回视图名称，
    // 当方法返回值为String类型时，返回值为视图名称

    @GetMapping("/")
    public String queryAll(
            @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
            @RequestParam(value = "conditions",required = false,defaultValue = "") String conditions,
            Model model
    ){
        //传递参数到前端使用Model model对象
        PageHelper.startPage(pageNum, 2);
        List<ProductDto> productDtos = productService.queryAll(conditions);
        PageInfo<ProductDto> pageInfo = new PageInfo<>(productDtos);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("conditions",conditions);
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/insert")
    public String insert(){
        return "insert";
    }

    @PostMapping("/add")
    public String add(ProductParam productParam){
        productService.add(productParam);
        return "redirect:/";
    }

}
