package Service;

import Repository.OrderRepo;
import entity.Coupon;
import entity.Order;

import java.util.List;

public class OrderService {
    @Autowired
    OrderRepo orderRepo;
   public Order getOrders(){
       Order order =orderRepo.findById(id);
       List<Coupon> couponList=order.getCouponList();
       Long price=order.getOrderPrice();
       for (Coupon c:couponList) {
           price=price-((price*c.getDiscountPercent())/100);
           order.setOrderPrice(price);
       }
       return  order;

   }
   public Order saveOrders(){
       return orderRepo.save(order);
   }
//Assumption-> Alongwith the order coupon code will also be provided to the order , based upon the coupon code the price will be calculated  as written in the service.
}
