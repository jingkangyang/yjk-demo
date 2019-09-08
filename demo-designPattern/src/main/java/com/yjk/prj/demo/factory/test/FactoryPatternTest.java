/**
 * 
 */
package com.yjk.prj.demo.factory.test;

import com.yjk.prj.demo.factory.color.Color;
import com.yjk.prj.demo.factory.factory.AbstractFactory;
import com.yjk.prj.demo.factory.factory.FactoryProducer;
import com.yjk.prj.demo.factory.factory.ShapeFactory;
import com.yjk.prj.demo.factory.shape.Shape;

/**使用该工厂，通过传递类型信息来获取实体类的对象
 * @author yangjingkang
 * 2019年9月8日 下午4:31:39
 */
public class FactoryPatternTest {
	public static void main(String[] args) {
		System.out.println("*****工厂调用*****");
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		//抽象工厂调用
		System.out.println("*****抽象工厂调用*****");
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory("SHAPE");
		Shape shapeCircle = shapeFactory2.getShape("CIRCLE");
		shapeCircle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color colorRed = colorFactory.getColor("RED");
		colorRed.fill();
		
		//抽象类新增方法
		System.out.println(colorFactory.newMethod());
	}
}
