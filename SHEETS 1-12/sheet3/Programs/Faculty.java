class Faculty extends CollegeEmployee
{
    boolean tenured;
    Faculty(String firstName,String lastName,String address,int pincode,long phonenum,int n,double b,String dept,boolean t){
        super(firstName,lastName,address,pincode,phonenum,n,b,dept);
        this.tenured=t;
    }
    void setTenured(boolean t){
        this.tenured=t;
    }
    
    public String toString()
    {
        String str = super.toString();
        System.out.println(str);
        if(tenured){
            return "Faculty member is tenured";
        }
        else{
            return "Faculty member is not tenured";
        }
 
    }   
}