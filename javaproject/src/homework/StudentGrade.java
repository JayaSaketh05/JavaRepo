package homework;

class StudentGrade {

    int maths, english, java;

    // Constructor
    StudentGrade(int m, int e, int j) {
        maths = m;
        english = e;
        java = j;
    }

    // Method to return total
    int getTotal() {
        return maths + english + java;
    }

    // Static method to find grade
    public static String findGrade(int total) 
    {
        if (total >= 280) 
        	return "A";
        else if (total < 280 && total >= 250) 
        	return "B";
        else if (total < 250 && total >= 230) 
        	return "C";
        else if (total < 230 && total >= 200) 
        	return "D";
        else if (total < 200 && total >= 150) 
        	return "E";
        else 
        	return "FAIL";
    }
    
    
    // AVERAGE Methods
    static double Average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    static double Average(float a, float b, float c) {
        return (a + b + c) / 3.0;
    }

    // AREA Methods
    static double Area(double radius) {               // Circle
        return 3.14159 * radius * radius;
    }

    static double Area(double length, double breadth) {  // Rectangle
        return length * breadth;
    }

    static double Area(int side) {                   // Square
        return side * side;
    }

    public static void main(String[] args) {

        // Two student objects
        StudentGrade s1 = new StudentGrade(100, 85, 95);
        StudentGrade s2 = new StudentGrade(60, 75, 65);

        int total1 = s1.getTotal();
        int total2 = s2.getTotal();

        System.out.println("Student 1 Total: " + total1);
        System.out.println("Student 1 Grade: " + findGrade(total1));

        System.out.println("Student 2 Total: " + total2);
        System.out.println("Student 2 Grade: " + findGrade(total2));
        
        System.out.println();
        
        
        // Average
        System.out.println("Average of 3 integers: " + Average(10, 20, 30));
        System.out.println("Average of 3 floats: " + Average(2.5f, 3.5f, 4.5f));
        System.out.println();

        // Area
        System.out.println("Area of Circle: " + Area(5.0));
        System.out.println("Area of Rectangle: " + Area(10.0, 20.0));
        System.out.println("Area of Square: " + Area(6));
    }
}
