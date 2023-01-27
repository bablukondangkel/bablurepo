package com.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class QuantifierTest {
	
	QuantizerImpl qn = new QuantizerImpl();
	
	@Test
	void testQuantize() {
		int mockSpeed =5;
		int quant = qn.quantize(mockSpeed);
		Assert.assertNotEquals(quant, 0);
	}

}
