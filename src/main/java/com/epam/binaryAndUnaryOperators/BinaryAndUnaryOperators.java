package com.epam.binaryAndUnaryOperators;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class BinaryAndUnaryOperators {

	public static void main(String[] args) {
		IntPredicate checkPrimeOrNot = (integer) -> {
			for (int i = 2; i < integer; i++) {
				if (integer % i == 0)
					return false;
			}
			return true;
		};
		System.out.println(checkPrimeOrNot.test(19));

		IntConsumer printSquareOfNumber = integer -> System.out.println(integer * integer);

		printSquareOfNumber.accept(23);

		IntSupplier getRandomNumberBelow5000 = () -> new Random().nextInt(5000);
		System.out.println(getRandomNumberBelow5000.getAsInt());
	}
}