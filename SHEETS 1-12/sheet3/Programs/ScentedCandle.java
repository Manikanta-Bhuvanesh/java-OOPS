class ScentedCandle extends Candle
{
 String scent;
 void getScent()
{
System.out.println("The scent of the candel is " + scent);
}
void setScent(String s)
{
scent = s;
}
void setHeight(int h)
{
double n = 3;
super.setHeight(h);
price = h * n;
}
}