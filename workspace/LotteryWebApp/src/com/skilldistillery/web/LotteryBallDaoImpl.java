package com.skilldistillery.web;

import java.util.ArrayList;
import java.util.List;

public class LotteryBallDaoImpl implements LotteryBallDao {

	@Override
	public List<Ball> makeBalls(int numBalls, int maxNum) {
		List<Ball> balls = new ArrayList<>();
		OUTER: for (int i = 0; i < numBalls; i++) {
			int rand = (int) (1 + Math.random() * maxNum);
			Ball b = new Ball(rand);
			for (int j = 0; j < balls.size(); j++) {
				if (balls.get(j).getNum().equals(Integer.toString(rand))) {
					i -= 1;
					continue OUTER;
				}
			}
			balls.add(b);
		}
		return balls;
	}
}
