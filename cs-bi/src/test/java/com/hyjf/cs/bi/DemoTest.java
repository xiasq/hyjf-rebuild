package com.hyjf.cs.bi;

import org.junit.Test;

/**
 * @author xiasq
 * @version DemoTest, v0.1 2018/1/26 11:31
 */
public class DemoTest {

	@Test
	public void test1() {
		String str = "12";
		if (str.length() < 3) {
			System.out.println("test...");
		} else {
			System.out.println(str.substring(0, 3));
		}
	}

}
