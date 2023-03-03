/**
 * 
 */
package com.yjk.demo.factoryPattern.factory;

import com.yjk.demo.factoryPattern.shape.Shape;
import com.yjk.demo.factoryPattern.color.Blue;
import com.yjk.demo.factoryPattern.color.Color;
import com.yjk.demo.factoryPattern.color.Green;
import com.yjk.demo.factoryPattern.color.Red;

/**
 * @author yangjingkang
 * 2019年9月8日 下午5:20:41
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String colorType) {
		
		if(colorType == null)
		return null;
		
		if("RED".equalsIgnoreCase(colorType)) {
			return new Red();
		}else if("GREEN".equalsIgnoreCase(colorType)) {
			return new Green();
		}else if ("BLUE".equalsIgnoreCase(colorType)) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
	
}
