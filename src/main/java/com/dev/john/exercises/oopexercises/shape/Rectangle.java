package com.dev.john.exercises.oopexercises.shape;

public class Rectangle{
  private double height;
  private double width;
  
  public Rectangle(){
    
  }
  
  public Rectangle(double height, double width){
    this.height = height;
    this.width = width;
  }
  
  public double getHeight(){
    return height;
  }
  
  public double getWidth(){
    return width;
  }
  
  public void setHeight(double height){
    this.height = height;
  }
  
  public void setWidth(double width){
    this.width = width;
  }
}