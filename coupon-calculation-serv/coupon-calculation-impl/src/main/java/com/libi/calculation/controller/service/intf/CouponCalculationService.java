package com.libi.calculation.controller.service.intf;

import com.libi.calculation.api.beans.ShoppingCart;
import com.libi.calculation.api.beans.SimulationOrder;
import com.libi.calculation.api.beans.SimulationResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface CouponCalculationService {

    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
