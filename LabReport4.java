class Student { //Student Class

    //Attributs
    private final String resgistrationNumber;
    private final String name;
    private final double cgpa;

    //constructor
    Student(String resistrationNumber, String name, double cgpa) {
        this.resgistrationNumber = resistrationNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    //methods of class / behaviour 
    //Only getMethods are provided, So it can never change
    String getName() {return name;}
    double getCgpa() {return cgpa;}
    String getResistrationNumber() {return resgistrationNumber;}

    //Method to display student info
   public String toString() {
    return "Registration No: " + resgistrationNumber + " Student Name: " + name + " CGPA: " + cgpa;
   }

}
public class LabReport4 {
    public static void main(String[] args) {
        //object of Student class
        Student myStudent = new Student(
            "0242310005101787", 
            "Tanvir Siddik", 
            2.4);
    
        System.out.println("\n\n" + myStudent);
    }

}
