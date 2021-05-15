import java.util.Scanner;
public class CreateLoans{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Loan[] l = new Loan[5];
		String ch,ln,lon,p;
		double amt,ir;
		int term;
		for(int i=0;i<5;i++){
		    System.out.println("Enter b for BusinessLoan & p for personal loan");
		    if(i!=0){
		        sc.nextLine();
		    }
			ch=sc.nextLine();
			System.out.println("Enter lastName");
			ln=sc.nextLine();
			System.out.println("Enter loan number");
			lon=sc.nextLine();
			System.out.println("Enter amount");
			amt=sc.nextDouble();
			System.out.println("prime interest rate");
			ir=sc.nextDouble();
			System.out.println("Enter term number");
			term=sc.nextInt();
			if(ch.equals("b")){
				l[i]=new BusinessLoan(lon,ln,amt,term,ir);
			}
			else if(ch.equals("p")){
				l[i]=new PersonalLoan(lon,ln,amt,term,ir);
			}
			else{
				System.out.println("Invalid loan type");
			}
		}
		for(int j = 0;j<5;j++){
			p=l[j].toString();
			System.out.println(p);
		}
	}
}