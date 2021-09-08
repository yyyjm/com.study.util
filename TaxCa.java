package com.imooc.util;

public class TaxCa {
	public int TaxC(int salary,int ins) {
		double beyond = salary - ins - 3500;
		double tax=0;
    	if (beyond <= 0) {
            tax = 0;
        } else if (beyond <= 1500) {
            tax = beyond * 0.03;
        } else if (beyond <= 4500) {
            tax = beyond * 0.1 - 105;
        } else if (beyond <= 9000) {
            tax = beyond * 0.2 - 555;
        } else if (beyond <= 35000) {
            tax = beyond * 0.25 - 1005;
        } else if (beyond <= 55000) {
            tax = beyond * 0.3 - 2755;
        } else if (beyond <= 80000) {
            tax = beyond * 0.35 - 5505;
        } else {
            tax = beyond * 0.45 - 13505;
        }
    	 
         
         
         System.out.println("应缴纳个人所得税：" + tax);
    	return (int)tax;
	}
}
