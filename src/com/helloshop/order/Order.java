package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {

    //자동 임포트 시 패키지명 주의
    // : 여기서는 com.helloshop 패키지를 사용해야 함
    User user;
    Product product;

    //public 있어야 다른 곳에서도 Order 호출가능
    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
