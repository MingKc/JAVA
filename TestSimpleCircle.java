package ninth;

public class TestSimpleCircle {
	public static void main(String[] args) {
	
		SimpleCircle circle1=new SimpleCircle();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		
		SimpleCircle circle2=new SimpleCircle(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		
		SimpleCircle circle3=new SimpleCircle(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());

	}
}

class SimpleCircle{
	double radius;
	
	public SimpleCircle(){
		radius=1;
	}
	
	public SimpleCircle(double newRadius){
		radius=newRadius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	public void setRadius(double newRadius){
		radius=newRadius;
	}
}