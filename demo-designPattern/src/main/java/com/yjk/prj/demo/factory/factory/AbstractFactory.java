/**
 * 
 */
package com.yjk.prj.demo.factory.factory;

import com.yjk.prj.demo.factory.color.Color;
import com.yjk.prj.demo.factory.shape.Shape;

/**为 Color 和 Shape 对象创建抽象类来获取工厂
 * @author yangjingkang
 * 2019年9月8日 下午5:14:54
 */
public abstract class AbstractFactory {
	
	public abstract Color getColor(String colorType);
	
	public abstract Shape getShape(String shapeType);
	
	public String newMethod() {
		return "抽象类新增方法";
	}

}
