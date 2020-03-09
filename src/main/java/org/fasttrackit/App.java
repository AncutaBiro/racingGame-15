package org.fasttrackit;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to racing game!");

        //instance of the class Car
        Car carReference = new Car ();
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;

//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;

        Engine engine1 = new Engine();
        engine1.manufacturer =  "VW";
        engine1.capacity = 2000;

        carReference.engine = engine1;

        // one object with 2 references
        System.out.println( "Engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        engine1.capacity = 2100;

        System.out.println( "Updated engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);


        // concatenation= lipirea mai multor stringuri unul langa altul
        System.out.println("Properties of " + carReference.name);
        System.out.println("color: " + carReference.color);
        System.out.println("max speed: " + carReference.maxSpeed);
        System.out.println("mileage: " + carReference.mileage);
        System.out.println("fuel level: " + carReference.fuelLevel);
        System.out.println("racing number: " + carReference.racingNumber);
        System.out.println("damaged: " + carReference.damaged);

        Car car2 = new Car();
        car2.name = "Lamborghini";
        car2.damaged = true;

        System.out.println("Properties of " + car2.name);
        System.out.println("color: " + car2.color);
        System.out.println("damaged: " + car2.damaged);








    }
}
