package com.libi.customer.impl.service.intf;


import com.libi.calculation.api.beans.ShoppingCart;
import com.libi.calculation.api.beans.SimulationOrder;
import com.libi.calculation.api.beans.SimulationResponse;
import com.libi.customer.api.beans.RequestCoupon;
import com.libi.customer.api.beans.SearchCoupon;
import com.libi.customer.dao.entity.Coupon;
import com.libi.template.api.beans.CouponInfo;

import java.util.List;

// 用户对接服务
public interface CouponCustomerService {

    // 领券接口
    Coupon requestCoupon(RequestCoupon request);

    // 核销优惠券
    ShoppingCart placeOrder(ShoppingCart info);

    // 优惠券金额试算
    SimulationResponse simulateOrderPrice(SimulationOrder order);

    void deleteCoupon(Long userId, Long couponId);

    // 查询用户优惠券
    List<CouponInfo> findCoupon(SearchCoupon request);
}
