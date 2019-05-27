package view;

import java.util.Observable;

import contract.IBoulderDashController;
import contract.IOrderPerformer;
import contract.IView;

public class BoulderDashView implements IView, Runnable{

	
	public BoulderDashView(IOrderPerformer orderPerformer, IBoulderDashController boulderDashController, Observable observable) {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String displayMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printMessage(String string) {
		// TODO Auto-generated method stub
		
	}

}
