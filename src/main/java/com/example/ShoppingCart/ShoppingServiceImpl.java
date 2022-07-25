package com.example.ShoppingCart;

import java.util.List;

public class ShoppingServiceImpl implements ShoppingService {

    public List cart;

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
