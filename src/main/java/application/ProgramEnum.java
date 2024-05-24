package application;

import Enums.OrderStatus;
import entities.Order;

import java.util.Date;

public class ProgramEnum {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order.toString());

        OrderStatus orderStatus1 = OrderStatus.DELIVERED;

        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED"); //Conversao de String para Enum

        System.out.println(orderStatus1);
        System.out.println(orderStatus2);
    }
}
