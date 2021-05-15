class Candle
{
String color;
int height;
double price;
void getColor(){
System.out.println ("The colour of the candel is " + color);
}
void getHeight()
{
System.out.println("Height of the candel id " + height);
}
void getPrice()
{
System.out.println("Price of thr candel is " + price);
}
void setColor(String c)
{
color = c;
}
void setHeight(int h)
{
	height=h;
double n = 2;
price = h * n;
}
}