package com.PinBall.CommandClasses;

import com.PinBall.CommandInterface.CommandOverPinBall;

public class PlayPinBall implements CommandOverPinBall{

	PinBall pinball;
	
	public PlayPinBall(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.playPinBall();
	}

}
