public class DemoCandles
{
public static void main(String args[])
{
Candle a = new Candle();
ScentedCandle b = new ScentedCandle();
a.setColor("yellow");
a.setHeight(9);
b.setColor("orange");
b.setScent("jasmine");
b.setHeight(7);
a.getHeight();
a.getColor();
a.getPrice();
System.out.println("Scented candel");
b.getHeight();
b.getColor();
b.getScent();
b.getPrice();
}
}