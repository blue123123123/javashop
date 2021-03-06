package ru.pelmegov.javashop.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pelmegov.javashop.dao.CartDAO;
import ru.pelmegov.javashop.service.CartService;
import ru.pelmegov.javashop.model.cart.Cart;

@Service
public class CartServiceImpl implements CartService {

    private final CartDAO cartDAO;

    public CartServiceImpl(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }

    @Override
    @Transactional
    public void updateCart(Cart cart) {
        this.cartDAO.updateCart(cart);
    }
}
