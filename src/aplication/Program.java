package aplication;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

		System.out.println(order);

		//	Conversão de String para enum
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
