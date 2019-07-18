package com.neuedu.designPatterns.factoryPattern;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "纽约风格的沙司和芝士披萨";
		dough = "薄面皮";
		sauce = "番茄酱";

		toppings.add("碎雷奇亚干酪奶酪");
	}
}