package com.game.controller;

import com.game.entity.Cart;
import com.game.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/carts")
public class CartController {
    private final CartService cartService;


    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/{ID}")
    public ResponseEntity<Cart> getCart(@PathVariable("ID") long id){
        if (id <= 0) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        Cart cart = cartService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(cart);

    }

}
