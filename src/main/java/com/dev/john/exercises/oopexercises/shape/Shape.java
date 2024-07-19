package com.dev.john.exercises.oopexercises.shape;

import java.lang.Math;

public class Shape{
  public Shape(){
    
  }
  
  public void calculateArea(Object object){
    if(object instanceof Circle){
      Circle circle = (Circle) object;
      double area = 3.14 * Math.pow(circle.getRay(), 2);
      double perimeter = 2 * 3.14 * circle.getRay();
      System.out.printf("The perimeter of this Circle is: %.2f \nand the area is: %.2f \n", perimeter, area);
    }else if(object instanceof Rectangle){
      Rectangle rectangle = (Rectangle) object;
      double area = rectangle.getWidth() * rectangle.getHeight();
      double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
      System.out.printf("The perimeter of this Rectangle is: %.2f \nand the area is: %.2f \n", perimeter, area);
    }else if(object instanceof Triangle){
      Triangle triangle = (Triangle) object;
      double area = (triangle.getWidth() * triangle.getHeight())/2;
      double perimeter = triangle.getWidth() + triangle.getHeight() + triangle.getHypotenuse();
      System.out.printf("The perimeter of this Triangle is: %.2f \nand the area is: %.2f \n", perimeter, area);
    }
  }
}