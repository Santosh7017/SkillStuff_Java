package javaQuestions.assignment4;

import java.util.Scanner;

/*Ques 1. Create a Program Which describes a functionality of Car .create a private field for attribute of Car and also implement
a seperate method for displaying a data of Car.
Hint : (Attributes : Car_Model,color,Price,Avg. Milege)
 */
class Cars{
    private String car_Model;
    private String color;

    private int Price;
    private int avgMileage;


    public void setCar_Model(String car_Model) {
        this.car_Model = car_Model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setAvgMileage(int avgMileage) {
        this.avgMileage = avgMileage;
    }

    public String getCar_Model() {
        return car_Model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return Price;
    }

    public int getAvgMileage() {
        return avgMileage;
    }

}
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    Cars car = new Cars();

        System.out.println("Model name of the car: ");
        String model = sc.nextLine();
        car.setCar_Model(model);



        System.out.println("Color of the car: ");
        String color = sc.nextLine();
        car.setColor(color);

        System.out.println("Average Milage of the car: ");
        int mileage = sc.nextInt();
        car.setAvgMileage(mileage);




        System.out.println("Enter the price of the car: ");
        int price = sc.nextInt();
        car.setPrice(price);

        System.out.println("Car Model: "+ car.getCar_Model());
        System.out.println("Car's colour: "+car.getColor());
        System.out.println("Price of Car : Rs "+car.getPrice());
        System.out.println("Average Mileage of Car : "+car.getAvgMileage());


    }
}
