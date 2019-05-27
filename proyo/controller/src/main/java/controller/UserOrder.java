package controller;

import contract.IUserOrder;
import contract.Order;

public class UserOrder implements IUserOrder{

	private Order ordr; 
	
	public UserOrder(Order order) {
		ordr = order; 
	}
	
	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
