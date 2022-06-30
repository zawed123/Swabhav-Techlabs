package com.monocept.model;

import java.util.HashMap;
import java.util.Random;

public class FrequencyDice {

	public HashMap<Integer, Integer> rollDice(int times) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < times; i++) {
			int number=(int)(Math.random()*6)+1;
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			}
			if (!map.containsKey(number)) {
				map.put(number, 1);
			}
		}
		return map;
	}

}