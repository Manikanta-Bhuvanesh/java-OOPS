import java.lang.Math;
class Circle{
	double r;
	double d;
	double area;
	Circle(){
		this.r = 1;
		this.d = 2*1;
		this.area = Math.PI*1*1;
	}
	void setRadius(double r){
		this.r = r;
		this.d = 2*r;
		this.area = Math.PI*r*r;
	}
	void getRadius(){
		System.out.println(this.r + "radius circle has " + this.d + " diameter and " + this.area + " area.");
	}
}