package com.neuedu.designPatterns.factoryPattern;

import java.util.*;

public abstract class Pizza{
	/**
	 * 名字
	 */
	String name;
	/**
	 * 面团
	 */
	String dough;
	/**
	 * 酱汁
	 */
	String sauce;
	ArrayList toppings = new ArrayList();

	/**
	 * 准备材料
	 */
	void prepare() {
		System.out.println("准备制作： "+name);
		System.out.println("面皮:"+dough);
		System.out.println("酱汁:"+sauce);
		System.out.println("披萨材料:");

		// add toppings
		for (int i =0; i<toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}

	/**
	 * 烘烤
	 */
	void bake() {
		System.out.println("350度烘烤25分钟");
	}

	/**
	 * 切割分块
	 */
	void cut() {
		System.out.println("把披萨沿对角切开");
	}

	/**
	 * 装盒
	 */
	void box() {
		System.out.println("把披萨放在披萨盒里");
	}

	public String getName() {
		return name;
	}
}