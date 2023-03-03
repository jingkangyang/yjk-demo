/**
 * 
 */
package com.yjk.demo.factoryPattern.factory;

import com.yjk.demo.factoryPattern.shape.Shape;
import com.yjk.demo.factoryPattern.color.Color;
import com.yjk.demo.factoryPattern.shape.Circle;
import com.yjk.demo.factoryPattern.shape.Rectangle;
import com.yjk.demo.factoryPattern.shape.Square;

/**创建一个工厂，生成基于给定信息的实体类的对象
 * @author yangjingkang
 * 2019年9月8日 下午4:25:27
 */
public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(String shapeType) {
		
		if(shapeType == null)
		return null;
		
		if("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		}else if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
