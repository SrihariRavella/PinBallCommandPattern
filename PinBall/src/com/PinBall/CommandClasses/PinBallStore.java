package com.PinBall.CommandClasses;

import com.PinBall.CommandInterface.CommandOverPinBall;

public class PinBallStore {

	public void pinBallEventHandler(CommandOverPinBall object,String cmd){

			if("buy".equals(cmd)) {
				object.execute();
			}else if("sell".equals(cmd)) {
				object.execute();
			}else if("play".equals(cmd)) {
				object.execute();
			}else if("score".equals(cmd)) {
				object.execute();
			}else if("stop".equals(cmd)) {
				object.execute();
			}
	}
}
