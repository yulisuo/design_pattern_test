package com.yls.factorypattern;

public class ShapeFactory {
	
	public static final String TYPE_CIRCLE = "circle";
	public static final String TYPE_SQUARE = "square";
	public static final String TYPE_RECTANGLE = "rectangle";
	
	public Shape getShape(String type){
		if(type == null){
			return null;
		}
		if(type.equals(TYPE_CIRCLE)){
			return new Circle();
		}else if(type.equals(TYPE_RECTANGLE)){
			return new Rectangle();
		}else if(type.equals(TYPE_SQUARE)){
			return new Square();
		}else{
			return null;
		}
	}
}
