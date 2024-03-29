package com.neuedu.designPatterns.factoryPattern;

public class NYPizzaStore extends PizzaStoreWithFactoryMethod {
	Pizza createPizza(String type) {
		if (type.equals("芝士")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("全素")) {
			return new NYStyleVeggiePizza();
		} else if (type.equals("蛤蜊")) {
			return new NYStyleClamPizza();
		} else return null;
	}
}