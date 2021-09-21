package com.PinBall.Main;

import com.PinBall.CommandClasses.BuyPinBall;
import com.PinBall.CommandClasses.PinBall;
import com.PinBall.CommandClasses.PinBallStore;
import com.PinBall.CommandClasses.PlayPinBall;
import com.PinBall.CommandClasses.Score;
import com.PinBall.CommandClasses.SellPinBall;
import com.PinBall.CommandClasses.StopGame;

public class PinBallMain {

	public static void main(String[] args) {
		
		PinBallStore store = new PinBallStore();
		PinBall object = new PinBall();
		
		BuyPinBall buy = new BuyPinBall(object);
		PlayPinBall play = new PlayPinBall(object);
		Score score = new Score(object);
		StopGame stop = new StopGame(object);
		SellPinBall sell = new SellPinBall(object);
		
		store.pinBallEventHandler(buy, "buy");
		store.pinBallEventHandler(sell, "sell");
		store.pinBallEventHandler(play, "play");
		store.pinBallEventHandler(score, "score");
		store.pinBallEventHandler(stop, "stop");
		
	}
}
