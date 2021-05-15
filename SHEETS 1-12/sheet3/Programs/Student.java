class Student extends Person
{
    String major;
    double avg;
    Student(String firstName,String lastName,String address,int pincode,long phonenum,String major,double avg){
        super(firstName,lastName,address,pincode,phonenum);
        this.major = major;
        this.avg = avg;
    }
    void setMajor(String major)
    {
        this.major = major;
    }
     
    void setAvg(double avg)
    {
        this.avg = avg;
    }
     
    public String getMajor()
    {
        return major;
    }
     
    public double getAvg()
    {
        return avg;
    }
 
    public String toString()
    {
        String str = super.toString();
        System.out.println(str);
        return "His major is " + getMajor() + " and his average is " + getAvg();
    }
} 