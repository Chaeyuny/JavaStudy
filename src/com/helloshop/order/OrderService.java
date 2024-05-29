package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {

    //패키지 구성 시 서로 관련된 클래스는 하나의 패키지에 모으고,
    // 관련이 적은 클래스는 다른 패키지로 분리한다.
    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
