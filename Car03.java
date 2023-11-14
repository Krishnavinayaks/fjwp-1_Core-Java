/*
Assignment-1.

? Write a Java program named Car
? The Car class should have the following attributes: make (String), model(String) , year (short) , and price(int) .
? The car class should have a constructor that takes all the attributes.
? Add a main method to instantiate car objects.
? The program should allow the user to create and display objects of each
---------------------------------------------------------------------------------------------------------------------
*/
public class Car03 {
    private String make;
    private String model;
    private short year;
    private int price;

    public Car03(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static void main(String[] args) {
        Car03 car1 = new Car03("Toyota", "Camry", (short) 2022, 25000);
        Car03 car2 = new Car03("Honda", "Civic", (short) 2023, 30000);
        Car03 car3 = new Car03("Ford", "Mustang", (short) 2021, 35000);

        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.year + " " + car1.price);
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.year + " " + car2.price);
        System.out.println("Car 3: " + car3.make + " " + car3.model + " " + car3.year + " " + car3.price);
    }
}

