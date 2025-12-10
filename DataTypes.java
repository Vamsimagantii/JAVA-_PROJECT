public class DataTypes{

    public static void main(String[] args) {

        byte age = 20;
        short year = 2025;
        int salary = 50000;
        long population = 8000000000L;

        float rating = 4.5f;
        double distance = 9876.543;

        char grade = 'A';
        boolean isJavaFun = true;

        String name = "sai";
        int[] marks = {90, 85, 88};

        System.out.println("=== Primitive Datatypes ===");
        System.out.println("byte age = " + age);
        System.out.println("short year = " + year);
        System.out.println("int salary = " + salary);
        System.out.println("long population = " + population);
        System.out.println("float rating = " + rating);
        System.out.println("double distance = " + distance);
        System.out.println("char grade = " + grade);
        System.out.println("boolean isJavaFun = " + isJavaFun);

        System.out.println("\n=== Non-Primitive Datatypes ===");
        System.out.println("String name = " + name);
        System.out.println("Array marks[0] = " + marks[0]);
    }
}