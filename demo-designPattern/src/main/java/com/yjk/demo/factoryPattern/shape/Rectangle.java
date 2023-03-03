/**
 * 
 */
package com.yjk.demo.factoryPattern.shape;

/**
 * @author yangjingkang
 * 2019年9月8日 下午4:19:38
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
