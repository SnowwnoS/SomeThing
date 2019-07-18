package com.neuedu.designPatterns.factoryPattern;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		name = "纽约风格的素食披萨";
		dough = "马苏里拉奶酪丝";
		sauce = "蔬菜酱";

		toppings.add("马苏里拉奶酪丝");

	}
}