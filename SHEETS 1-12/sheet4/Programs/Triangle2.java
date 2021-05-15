class Triangle2 extends GeometricFigure implements SidedObject{

    Triangle2(int a, int b){
        super.height=a;
        super.width=b;
        super.sides=3;
        Area(a,b);
    }
    void Area(int h, int w) {
        super.area=(h*w)/2;
    }
    public void display(){
    	System.out.println("Area of the figure is " + super.area + " and number of sides are " + super.sides);
    }
}