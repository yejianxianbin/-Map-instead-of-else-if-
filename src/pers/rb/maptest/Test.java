package pers.rb.maptest;
import java.util.HashMap;

import pers.rb.maptest.IfFunction;

public class Test {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 获取开始时间

		IfFunction<String> ifFunction = new IfFunction<>(new HashMap<>(5));
		
		/**
		 * 添加测试数据， 这语法是jdk8新特性的Lambda表达式的语法
		 */
		ifFunction.add("helo", () -> System.out.println("你好"))
				.add("hi", () -> System.out.println("嗨"))
				.add("a", () -> System.out.println("a"))
				.add("b", () -> System.out.println("b"))
				.add("c", () -> System.out.println("c"))
				.add("d", () -> System.out.println("d"))
				.add("e", () -> System.out.println("e"))
				.add("f", () -> System.out.println("f"))
				.add("g", () -> System.out.println("g"))
				.add("go",() -> System.out.println("go"))
				.doIfWithDefault("helloWorld", () -> System.out.println("没有找到对应的key!"));

		long endTime = System.currentTimeMillis(); // 获取结束时间
		System.out.println("程序运行时间： " + (endTime - startTime) + "毫秒");
	}
}