package entity;
@Entity
@Data
public class Coupon {
    @Id
    @Column(name="coupon_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long couponId;
    private String couponType;

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Long getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Long discountPercent) {
        this.discountPercent = discountPercent;
    }

    private Long discountPercent;

}
