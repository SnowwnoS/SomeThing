package com.neuedu.designPatterns.factoryPattern;

public abstract class PizzaStoreWithFactoryMethod {
	abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}