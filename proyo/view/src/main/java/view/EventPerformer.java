package view;

import java.awt.event.KeyEvent;

import contract.IOrderPerformer;
import contract.IUserOrder;
import controller.BoulderDashController;

public class EventPerformer {
	
	private IOrderPerformer iOrderPerformer; 
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		
		iOrderPerformer = orderPerformer; 
		
	}
	public void eventPerform( KeyEvent keyEvent) {
		
	}
}
