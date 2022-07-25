package controllers;

import com.example.ShoppingCart.ShoppingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class Controller {
    private final ShoppingService shoppingService;

    public Controller(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping("/add")
    public Integer addProduct(@RequestParam Integer id){
        return shoppingService.add(id);
    }

    @GetMapping("/get")
    public List getCart(){
        return Collections.singletonList(shoppingService.get());
    }

}
