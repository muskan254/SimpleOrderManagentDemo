package entity;


import java.util.List;

@Entity
public class Order {
    @Id
    @Column(name="order_Id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @OneToMany(cascade=cascadeType.ALL)
    private List<Coupon> couponList;
    private Long OrderId;

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    private Long orderPrice;
    private  Long orderCount;


    public List<Coupon> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<Coupon> couponList) {
        this.couponList = couponList;
    }
}
