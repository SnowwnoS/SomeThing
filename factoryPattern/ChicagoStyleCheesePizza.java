package com.neuedu.designPatterns.factoryPattern;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "芝加哥风格的深盘芝士披萨";
		dough = "特厚面皮";
		sauce = "李子番茄酱";

		toppings.add("马苏里拉奶酪丝");
	}

	void cut() {
		System.out.println("把披萨切成方形");
	}
}