import java.util.Scanner;
public class CollegeList
{
    public static void main(String[] args)
    {
        CollegeEmployee[] c = new CollegeEmployee[4];
        Faculty[] f = new Faculty[3];
        Student[] s = new Student[7];
        Scanner sc = new Scanner(System.in);
        String response,fname,lname,address,dept,major;
        int pin,securitynum;
        double salary,avg;
        long phone;
        boolean tenured;
        String cont ="y";
        String QUIt = "Q";
         int i=0;
         int j=0;
         int k=0;
        System.out.println("Enter C for CollegeEmployee entry or F fot Faculty entry or S for Student  entry");
        response = sc.nextLine();
        while(response!="Q"){
            if(response.equals("C")){
            while(cont.equals("y"))
            {
                c[i]=new CollegeEmployee();
                System.out.println("Enter first name");
                fname = sc.nextLine();
                c[i].setFirstName(fname);
                System.out.println("Enter last name");
                lname = sc.nextLine();
                c[i].setLastName(lname);               
                System.out.println("Enter address");
                address = sc.nextLine();  
                c[i].setAddress(address);              
                System.out.println("Enter pin code");
                pin = sc.nextInt();
                c[i].setPincode(pin);
                System.out.println("Enter phone number");
                phone = sc.nextLong();
                c[i].setphonenum(phone);
                System.out.println("Enter security number");
                securitynum = sc.nextInt();
                c[i].setSnum(securitynum);
                System.out.println("Enter Anual salary");
                salary = sc.nextDouble();
                sc.nextLine();
                c[i].setAsal(salary);
                System.out.println("Enter department name");
                dept = sc.nextLine(); 
                c[i].setdept(dept);
                System.out.println("Enter more entries? (y/n)");
                cont = sc.nextLine();
                if(i==3){
                    System.out.println("Entered maxium number of entries");
                    cont="n";
                }
                i++;
            }
           System.out.println("Enter C for CollegeEmployee entry or F fot Faculty entry or S for Student  entry");
            response = sc.nextLine();
            cont ="y";
            }
            if(response.equals("F")){
            while(cont.equals("y"))
            {
                f[j]=new Faculty();
                System.out.println("Enter first name: ");
                fname = sc.nextLine();
                f[j].setFirstName(fname);
                System.out.println("Enter last name");
                lname = sc.nextLine();
                f[j].setLastName(lname);               
                System.out.println("Enter address");
                address = sc.nextLine();  
                f[j].setAddress(address);              
                System.out.println("Enter pin code");
                pin = sc.nextInt();
                f[j].setPincode(pin);
                System.out.println("Enter phone number");
                phone = sc.nextLong();
                f[j].setphonenum(phone);
                System.out.println("Enter security number");
                securitynum = sc.nextInt();
                f[j].setSnum(securitynum);
                System.out.println("Enter Anual salary");
                salary = sc.nextDouble();
                f[j].setAsal(salary);
                System.out.println("Enter department name");
                dept = sc.nextLine(); 
                sc.nextLine();
                f[j].setdept(dept);
                System.out.println("Enter true if tenured or enter false if not tenured");
                tenured=sc.nextBoolean();
                sc.nextLine();
                f[j].setTenured(tenured);
                System.out.println("Enter more entries ? (y/n)");
                cont = sc.nextLine();
                if(j==2){
                    System.out.println("Entered maxium number of entries");
                    cont="n";
                }
                j++;
            }
            System.out.println("Enter C for CollegeEmployee entry or F fot Faculty entry or S for Student  entry");
            response = sc.nextLine();
            cont ="y";
            }
            if(response.equals("S")){
            while(cont.equals("y"))
            {
                s[k]=new Student();
                System.out.println("Enter first name");
                fname = sc.nextLine();
                s[k].setFirstName(fname);
                System.out.println("Enter last name");
                lname = sc.nextLine();
                s[k].setLastName(lname);               
                System.out.println("Enter address");
                address = sc.nextLine();  
                s[k].setAddress(address);              
                System.out.println("Enter pin code");
                pin = sc.nextInt();
                s[k].setPincode(pin);
                System.out.println("Enter phone number");
                phone = sc.nextLong();
                sc.nextLine();
                s[k].setphonenum(phone);
                System.out.println("Enter major");
                major =sc.nextLine();
                s[k].setMajor(major);
                System.out.println("Enter average");
                avg=sc.nextDouble();
                sc.nextLine();
                s[k].setAvg(avg);
                System.out.println("Enter more entries? (y/n)");
                cont = sc.nextLine();
                if(k==6){
                    System.out.println("Entered maxium number of entries");
                    cont="n";
                }
                k++;
            }
            System.out.println("quiting");
            response="Q";
            
            
            }
        }
        if(response.equals("Q")){
           
            for (int p =0;p<i;p++){
                c[p].display();
            } 
            for(int q=0;q<j;q++){
                f[q].display();
            }
            for(int r=0;r<k;r++){
                s[r].display();
            }
         }
         int h = 4-i;
         if(h!=0){
         System.out.println(h +" CollegeEmployee data not Entered");
     }
         h=3-j;
         if(h!=0){
         System.out.println(h+ " Faculty data not Entered");
     }
         h=7-k;
         if(h!=0){
         System.out.println(h + " Student data not Entered");
     }
         
    }
}