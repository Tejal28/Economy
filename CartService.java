package com.store.service;

import com.store.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
