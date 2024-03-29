package com.neuedu.designPatterns.factoryPattern;

public class ChicagoPizzaStore extends PizzaStoreWithFactoryMethod {
	Pizza createPizza(String type) {
		if (type.equals("芝士")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("全素")) {
			return new ChicagoStyleVeggiePizza();
		} else if (type.equals("蛤蜊")) {
			return new ChicagoStyleClamPizza();
		} else return null;
	}
}