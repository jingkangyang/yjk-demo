package org.demo.java8;

import java.util.Arrays;
import java.util.List;

public class Java8StreamDemo {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("a", "ab", "abc", "b", "bc");
		words.stream()
			.filter(word -> word.startsWith("a"))
			.forEach(System.out::println);
	}
}
