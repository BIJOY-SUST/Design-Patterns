import java.util.*;

 interface ShapeArea{
    public double calculateArea();
}

 class Circle implements ShapeArea{
    private double radius;

    @Override
    public double calculateArea(){
        return Math.PI*getRadius()*getRadius();
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}


 class Rectangle implements ShapeArea{
    private double height;
    private double width;

    public double calculateArea(){
        return getHeight()*getWidth();
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}


class OpenClosed{
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.setRadius(13.5);
        System.out.println("The Area of the Circle is : " + circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(50);
        rectangle.setWidth(65);
        System.out.println("The area of rectangle is : " + rectangle.calculateArea());
    }
}