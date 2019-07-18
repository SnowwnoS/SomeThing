package com.neuedu.designPatterns.factoryPattern;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "芝加哥风格的蔬菜披萨";
		dough = "特厚面皮";
		sauce = "蔬菜酱";

		toppings.add("马苏里拉奶酪丝");

	}
}