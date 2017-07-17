package com.smily.demo.controller;

import com.smily.demo.domain.Product;
import com.smily.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
@Controller
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("products")
    public String list(Model model){
        model.addAttribute("products", productService.listAllProducts());
        return "products";
    }
    
    @RequestMapping("product/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "productShow";
    }
    
    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "productForm";
    }
    
    @RequestMapping("product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "productForm";
    }
    
    @PostMapping("product")
    public String saveProduct(Product product){
        
        productService.saveProduct(product);
        
        return "redirect:/product/" + product.getId();
    }
    
}
