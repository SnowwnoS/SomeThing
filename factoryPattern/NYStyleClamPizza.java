package com.neuedu.designPatterns.factoryPattern;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		name = "纽约蛤仔披萨";
		dough = "特厚面皮";
		sauce = "黑胡椒酱汁";

		toppings.add("马苏里拉奶酪丝");

	}
}