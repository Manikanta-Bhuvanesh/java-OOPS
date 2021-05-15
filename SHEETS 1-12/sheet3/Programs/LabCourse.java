class LabCourse extends CollegeCourse

{
  double lf = 50.00;
  double cf;
  LabCourse(String dpt, int cn, int c)
  {
      super(dpt, cn, c);
      cf = super.getcourseFee() + lf;
  }
  double getLabCourseFee()
  {
      return cf;
  }
  void display()
  {
      System.out.println("department " + super.getdpt());
      System.out.println("Course number " + super.getcourseNo());
      System.out.println("Credit hours " + super.getCredits());
      System.out.println("Course fee " + this.getLabCourseFee());      
        }

}