package com.example.ShoppingCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class ShoppingServiceImpl implements ShoppingService {

    private List<Integer> cart;

    @Override
    public Integer add(Integer id) {
        cart.add(id);
        return id;
    }

    @Override
    public List get() {
        return this.cart;
    }
}
