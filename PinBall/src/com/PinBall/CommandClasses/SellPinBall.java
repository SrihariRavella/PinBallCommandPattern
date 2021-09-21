package com.PinBall.CommandClasses;

import com.PinBall.CommandInterface.CommandOverPinBall;

public class SellPinBall implements CommandOverPinBall{

	PinBall pinball;
	
	public SellPinBall(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.sellPinBallMachine();
	}

}
