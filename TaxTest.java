package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxTest {
	@Test
	public void testTaxC0() {
		assertEquals(15, new TaxCa().TaxC(6000,2000));
		
	}
	@Test
	public void testTaxC1() {
		
		assertEquals(245, new TaxCa().TaxC(9000,2000));
	}
	@Test
	public void testTaxC2() {
		
		assertEquals(1370, new TaxCa().TaxC(15000,2000));
	}
	@Test
	public void testTaxC3() {
		
		assertEquals(945, new TaxCa().TaxC(13000,2000));
	}
	@Test
	public void testTaxC4() {
		
		assertEquals(8495, new TaxCa().TaxC(43000,2000));
	}
	@Test
	public void testTaxC5() {
		
		assertEquals(13595, new TaxCa().TaxC(60000,2000));
	}
	@Test
	public void testTaxC6() {
		
		assertEquals(24520, new TaxCa().TaxC(90000,2000));
	}
}
