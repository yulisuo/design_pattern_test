package com.yls.factorypattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape s1 = sf.getShape(ShapeFactory.TYPE_CIRCLE);
		s1.draw();
		Shape s2 = sf.getShape(ShapeFactory.TYPE_SQUARE);
		s2.draw();
		Shape s3 = sf.getShape(ShapeFactory.TYPE_RECTANGLE);
		s3.draw();
	}

}
