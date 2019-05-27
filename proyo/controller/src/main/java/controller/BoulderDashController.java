package controller;

import contract.IOrderPerformer;
import contract.IBoulderDashModel;
import contract.IView;


public class BoulderDashController implements IOrderPerformer{

	private IView iView;
	private IBoulderDashModel iboulderDashModel; 
	
	public BoulderDashController (BoulderDashModel boulderDashModel, IView view) {
		
		iboulderDashModel = boulderDashModel; 
		iView = view; 
	}
	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}

	public BoulderDashController(IBoulderDashModel boulderDashModel) {
		
	}

	public void play() {
	
}

	public void setView(IView boulderDashView) {
	
}

	public void tick() {
	
}

}
