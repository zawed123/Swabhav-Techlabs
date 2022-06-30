package com.monocept.model.test;

import java.util.HashMap;

import com.monocept.model.FrequencyDice;

public class DiceRollTest {

	public static void main(String args[]) {
		FrequencyDice f = new FrequencyDice();
		
		HashMap<Integer, Integer> map = f.rollDice(10);

		for (Integer k : map.keySet()) {
			System.out.println(k + "--" + map.get(k));
		}
	}
}
