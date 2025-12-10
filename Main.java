class Car {
    String brand;
    String model;
    int year;

    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Honda", "City", 2022);
        c.showDetails();
    }
}
