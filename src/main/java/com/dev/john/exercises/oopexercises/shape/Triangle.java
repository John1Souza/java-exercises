package com.dev.john.exercises.oopexercises.shape;

public class Triangle{
  private double height;
  private double width;
  private double hypotenuse;
  
  public Triangle(){
    
  }
  
  public Triangle(double height, double width, double hypotenuse){
    this.height = height;
    this.width = width;
    this.hypotenuse = hypotenuse;
  }
  
  public double getHeight(){
    return height;
  }
  
  public double getWidth(){
    return width;
  }
  
  public double getHypotenuse(){
    return hypotenuse;
  }
  
  public void setHeight(double height){
    this.height = height;
  }
  
  public void setWidth(double width){
    this.width = width;
  }
  
  public void setHypotenuse(double hypotenuse){
    this.hypotenuse = hypotenuse;
  }
}