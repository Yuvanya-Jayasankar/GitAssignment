import java.util.*;
class Hello
{
        public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n:");
    int n = sc.nextInt();
    sc.nextLine();

    Student students[] = new Student[n];

    for(int i =0; i<n;i++){
        System.out.println("enter rollno:");
        int rollNo = sc.nextInt();
     sc.nextLine();
        System.out.println("enter name:");
        String name = sc.nextLine();
        System.out.println("enter marks:");
        double marks = sc.nextDouble();
          sc.nextLine();

        students[i] = new Student(rollNo, name, marks);
    }
    System.out.println("enter searchRoll:");
    int searchRoll = sc.nextInt();
    Student result = getStudentByRollNo(students, searchRoll);
    if(result != null){
        System.out.println("name-" + result.getName());
        System.out.println("marks-"+ result.getMarks());
    } else{
        System.out.println("No student found with the given roll number.");
    }
}
public static Student getStudentByRollNo(Student[] arr , int searchRoll){
    for(Student s: arr){
        if(s.getRollNo() == searchRoll){
            return s;
        }
    }
    return null;
}
}
class Student{
    private int rollNo;
    private String name;
    private double marks;
    public Student(int rollNo, String name, double marks)
    {
      this.rollNo = rollNo;
      this.name = name;
      this.marks = marks;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }
    
}