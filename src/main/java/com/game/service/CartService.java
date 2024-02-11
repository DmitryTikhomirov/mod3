package com.game.service;

import com.game.entity.Cart;
import com.game.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
  private final CartRepository cartRepository;
  public CartService(@Autowired CartRepository cartRepository){
      this.cartRepository = cartRepository;
  }
  public Cart getById(long id){
      Cart cart = cartRepository.getById(id);
      if(cart == null){
          cart = new Cart(0L,"error cart", "", 1, "", 1);
      }
      return cart;
  }
}
