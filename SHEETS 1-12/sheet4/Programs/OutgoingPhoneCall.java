class OutgoingPhoneCall extends PhoneCall {

    double r = 0.04;
    int minutes;
     OutgoingPhoneCall(String phoneNumber, int minutes){
        super(phoneNumber);
        this.minutes = minutes;
        setPrice();
    }
    void setPrice() {
        super.price = 0.04;
    }
    void getInf() {
        System.out.println("Outgoing phone call for " + getPhoneNumber() + " "+ r + " per minute at " + minutes + " minutes is $" + price*minutes);
    }
     public String getPhoneNumber()
     {
         return super.phn;
     }
     public double getPrice()
     {
         return super.price;
     }

}
