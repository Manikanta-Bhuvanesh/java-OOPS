class Square2 extends GeometricFigure implements SidedObject{
    Square2(int a, int b){
        super.height=a;
        super.width=b;
        super.sides=4;
        Area(a,b);
    }
    void Area(int h, int w) {
      super.area=(h*w);
    }
    public void display(){
    	System.out.println("Area of the figure is " + super.area + " and number of sides are " + super.sides);
    }
}