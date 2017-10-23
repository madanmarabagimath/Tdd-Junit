package com.emids.javatestcases;

import org.junit.Assert;
import org.junit.Test;
import com.emids.javaclass.Calculator;

public class CalculatorTestCases {
	@Test
	public final void methodmusttakeinputnumberssepartedbycomma() {
		Calculator.add("1,2,3");
	}

	@Test
	public final void whentheinputStringisemptyThenitreturnszero() {
		Calculator.add("");
		Assert.assertEquals(0, Calculator.add(""));
	}

	@Test
	public final void whenmultiplenumbersThenitmusthandleallthoseandgivethesum() {
		Calculator.add("1,2,3,4,5,6");
		Assert.assertEquals(21, Calculator.add("1,2,3,4,5,6"));
	}

	@Test
	public final void wheninputisgivenwiththenewlinedelimiterThenitmustreturnsthesumofthosenumbers() {
		Calculator.add("1\n2");
		Assert.assertEquals(3, Calculator.add("1\n2"));
	}

	@Test
	public final void whenthenumbersaresaparatedbyundefineddelimiterThenalsoitmustwork() {
		Calculator.add("1,2;3,4,5,6");
		Assert.assertEquals(21, Calculator.add("1,2;3,4,5,6"));
	}

	@Test(expected = RuntimeException.class)
	public final void whennegetivenumberarethereininputThenitthorwsexception() {
		Calculator.add("1,-2,2,3,4,5,6");

	}

	@Test

	public final void wheninputismorethanthousandThenitmustigone() {
		Calculator.add("1,2,3,4,1000");
		Assert.assertEquals(10, Calculator.add("1,2,3,4,1000"));
	}

}
