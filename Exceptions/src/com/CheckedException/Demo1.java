package com.CheckedException;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		Optional<Integer> o = Optional.of(10);
		Integer orElseThrow = o.orElseThrow(() -> new ArithmeticException(""));
		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		} finally {
			System.out.println("finally");
		}
	}
}



