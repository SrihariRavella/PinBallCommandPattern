package com.PinBall.CommandClasses;

import com.PinBall.CommandInterface.CommandOverPinBall;

public class StopGame implements CommandOverPinBall{

	PinBall pinball;
	
	public StopGame(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.stopGame();
	}

}
