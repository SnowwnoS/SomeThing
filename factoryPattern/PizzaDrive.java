package com.neuedu.designPatterns.factoryPattern;

public class PizzaDrive {

	public static void main(String[] args) {
		PizzaStoreWithFactoryMethod nyStore = new NYPizzaStore();
		PizzaStoreWithFactoryMethod chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("芝士");
		System.out.println("-------------Get a " + pizza.getName());


		pizza = chicagoStore.orderPizza("芝士");
		System.out.println("-------------Get a " + pizza.getName());
	}
}	