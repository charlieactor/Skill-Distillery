package com.skilldistillery.web;

import java.util.List;

public interface LotteryBallDao {
	public List<Ball> makeBalls(int numBalls, int maxNum);
}
