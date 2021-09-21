package com.PinBall.CommandClasses;

import com.PinBall.CommandInterface.CommandOverPinBall;

public class Score implements CommandOverPinBall{

	PinBall pinball;
	
	public Score(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.score();
	}

}
