class Triangle extends GeometricFigure{

    Triangle(int a, int b){
        super.height=a;
        super.width=b;
        Area(a,b);
    }
    void Area(int h, int w) {
        area=(h*w)/2;
    }
    
}