package com.game.repository;

import com.game.entity.Cart;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class CartRepository {
    private static final List<Cart> storage = new CopyOnWriteArrayList<Cart>() {{
     add(new Cart(1L, "Старик поучает сына: В жизни у тебя сынок два путя будет: или тебе в армию идти, или жениться",
             " в армию", 3, "жениться", 2 ));

     add(new Cart(2L, "Ну это - пиши \"пропало\"!", "в начало",
             1, null, 1 ));

     add(new Cart(3L, "Тогда у тебя два путя будет: или тебя убъют, или ты жив останешься.",
             "убъют", 4, "живой", 2 ));

     add(new Cart(4L, "Тогда у тебя два путя будет: похоронят тебя или под сосной, или под берёзой.",
             "сосна", 2, "берёза", 5 ));

     add(new Cart(5L, "Тогда у тебя два путя будет: пойдет берёза или на карандаши, или на бумагу.",
             "карандаши", 2, "бумага", 6 ));

     add(new Cart(6L, "Тогда у тебя два путя будет: бумагу сделают или писчую, или туалетную.",
             "писчая", 2, "туалетная", 7 ));

     add(new Cart(7L, "Тогда у тебя два путя будет: попадет бумага или в мужской туалет, или в женский.",
             "мужской", 2, "женский", 8 ));

     add(new Cart(8L, "Тогда у тебя два путя будет: остальное смотри на ютубе :)",
             "в начало", 1, null, 1 ));



    }};
    public Cart getById(long id) {
        for (Cart cart : storage) {
            if (cart.getId() == id) return cart;
        }
        return null;
    }



}
