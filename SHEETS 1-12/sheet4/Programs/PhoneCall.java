abstract class PhoneCall
{
    String phn;
    double price;
     PhoneCall(String phn)
    {
        this.phn =  phn;
        this.price = 0.0;
    }
    abstract String getPhoneNumber();
    abstract double getPrice();
    abstract void getInf();
    abstract void setPrice();

}