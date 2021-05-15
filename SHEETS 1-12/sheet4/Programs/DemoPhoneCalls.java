public class DemoPhoneCalls {
public static void main(String [] args) {

    IncomingPhoneCall in=new IncomingPhoneCall("9014914993");
    OutgoingPhoneCall out=new OutgoingPhoneCall("9456552237",40);
    in.getInf();
    out.getInf();
 }
}