class Square extends GeometricFigure{
    Square(int a, int b){
        super.height=a;
        super.width=b;
        Area(a,b);
    }
    void Area(int h, int w) {
      super.area=(h*w);
    }
}