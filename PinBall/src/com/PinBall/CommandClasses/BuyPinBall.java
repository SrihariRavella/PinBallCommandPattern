package com.PinBall.CommandClasses;

import com.PinBall.CommandInterface.CommandOverPinBall;

public class BuyPinBall implements CommandOverPinBall{

	PinBall pinball;
	
	public BuyPinBall(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.buyPinBallMachine();
	}

}
