/**
 * 
 */
package com.yjk.demo.factoryPattern.factory;

/**创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 * @author yangjingkang
 * 2019年9月8日 下午5:24:10
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {

	      if(factoryType.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(factoryType.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      return null;
	}
}
