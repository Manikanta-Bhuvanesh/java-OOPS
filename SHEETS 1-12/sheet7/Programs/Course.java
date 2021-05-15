class Course {
	String dept;
	int cn;
	double c;
	public Course(String dept, int cn, double c) throws CourseException {
		if(dept.length()!=3 || (cn<100 || cn>499) || (c<0.5 || c>6)) {
			throw new CourseException("Error in given details");
			}
			this.dept = dept;
			this.cn = cn;
			this.c = c;
			System.out.println("Created successfully");
		}
}