package pers.rb.maptest;
import java.util.HashMap;

import pers.rb.maptest.IfFunction;

public class Test {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // ��ȡ��ʼʱ��

		IfFunction<String> ifFunction = new IfFunction<>(new HashMap<>(5));
		
		/**
		 * ��Ӳ������ݣ� ���﷨��jdk8�����Ե�Lambda���ʽ���﷨
		 */
		ifFunction.add("helo", () -> System.out.println("���"))
				.add("hi", () -> System.out.println("��"))
				.add("a", () -> System.out.println("a"))
				.add("b", () -> System.out.println("b"))
				.add("c", () -> System.out.println("c"))
				.add("d", () -> System.out.println("d"))
				.add("e", () -> System.out.println("e"))
				.add("f", () -> System.out.println("f"))
				.add("g", () -> System.out.println("g"))
				.add("go",() -> System.out.println("go"))
				.doIfWithDefault("helloWorld", () -> System.out.println("û���ҵ���Ӧ��key!"));

		long endTime = System.currentTimeMillis(); // ��ȡ����ʱ��
		System.out.println("��������ʱ�䣺 " + (endTime - startTime) + "����");
	}
}