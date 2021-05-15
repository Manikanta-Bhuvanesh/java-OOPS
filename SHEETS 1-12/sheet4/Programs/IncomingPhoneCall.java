class IncomingPhoneCall extends PhoneCall {

    double r=0.02;
     IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPrice();
    }
    void setPrice() {
        super.price = 0.02;
    }
     void getInf(){
        System.out.println("Incoming phone call for "+getPhoneNumber()+",Price for a call is $"+getPrice());
    }
      String getPhoneNumber()
      {
          return super.phn;
      }
      double getPrice()
      {
          return super.price;
      }
}