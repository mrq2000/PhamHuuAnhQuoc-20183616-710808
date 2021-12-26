package controller.shipping;

import entity.order.Order;

public interface ShippingFeeCalculator {
    int calculateShippingFee(Order order);
}