package com.monocept.model.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import com.monocept.model.FrequencyDice;

public class DiceRollUnitTest {

	@Test
	public void checkDiceTest()
	{
		FrequencyDice f=new FrequencyDice();
		HashMap<Integer,Integer> map=f.rollDice(10);
		
		int count=0;
		for(Integer k:map.keySet())
			count+=map.get(k);
		assertEquals(count,10);
	}
}
