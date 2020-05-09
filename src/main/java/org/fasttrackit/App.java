package org.fasttrackit;

import java.beans.VetoableChangeListener;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        Game game =  new Game ();
        game.start ();


//      // Set Collections : o lista care afiseaza elemente unice, nu afiseaza valori dublate. ex. lista CNP
//        Set<Integer> uniqueIntegers = new HashSet<>();  // wrapper class Integer
//        uniqueIntegers.add(1); // adaugare in Set
//        uniqueIntegers.add(2);
//        uniqueIntegers.add(3);
//        uniqueIntegers.add(3);
//      Iterator<Integer> iterator =  uniqueIntegers.iterator();  // citire, parcurgere in Set
//        while (iterator.hasNext()) {
//            Integer next = iterator.next ();   // auto-boxing int - Integer , auto-unboxing Integer - int
//            System.out.println(next); }

    // Map Collections : interface for pair key-value, ex. translations
//        Map<String, Integer> studentAge = new HashMap<>();
//        studentAge.put ("Ion", 20); // pair key-value: "Ion" key always unique, 20 value.
//        studentAge.put ("Flaviu", 30);
//
//        Integer age = studentAge.get("Flaviu"); // citire
//        System.out.println(age);
//
//        for (Map.Entry<String, Integer> entry: studentAge.entrySet()) { //parcurgere
//            System.out.println("Key " + entry.getKey());
//            System.out.println("Value " + entry.getValue());
//        }

//        //string pool
//        String a = "test";
//        String b = "test";
//        String c = new String ("test");
//
//        System.out.println(a == b);
//        System.out.println(a.equals(c));

        // POLYMORPHISM method implementation taken from object's Cheating Vehicle class not from variable's class Vehicle
//        Vehicle cheater = new CheatingVehicle();
//        cheater.setName("Cheater");
//
//        cheater.accelerate(60,1);
//
//        System.out.println("Total distance: " + cheater.getTotalDistance());
//
//
//        // variable type decided what methods can be invoked
//        // type casting
//        ((CheatingVehicle)cheater).fly();



//        Vehicle vehicle1 = new Vehicle();
////        vehicle1.totalVehicleCount = 1;
//
//        Vehicle vehicle2 = new Vehicle();
////        vehicle2.totalVehicleCount = 2;

//        Vehicle.totalVehicleCount = 50;
//
//        System.out.println("Total count from vechicle1: " + vehicle1.getTotalVehicleCount());
//        System.out.println("Total count from vechicle1: " + vehicle2.getTotalVehicleCount());
//        System.out.println("Total count from Vehicle Class: " + Vehicle.getTotalVehicleCount());


//        System.out.println( "Please enter vehicle name: ");
//        Scanner scanner = new Scanner(System.in);
//        String vehicleName = scanner.nextLine();
//
//        System.out.println("Entered name: " + vehicleName);
//
//        System.out.println("Welcome to racing game!");
//
//

        //instance of the class Car
//        Car carReference = new Car (engine1);
//        carReference.setName ("Audi");
//        carReference.setColor("red");
//        carReference.setMaxSpeed(260);
//        carReference.setMileage(6.2);
//        carReference.setFuelLevel(100);
//        carReference.setDamaged(true);
//
//        System.out.println(carReference);
//
//        System.out.println("Name: " + carReference.getName());

//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;

//
        //apelarea metodei
//        double currentDistance = carReference.accelerate(60, 1);
//        System.out.println( "Current distance: " + currentDistance);
//
//        Mechanic mechanic = new Mechanic ();
//        mechanic.repair(carReference);

//        System.out.println( "Is car damaged? " + carReference.damaged);

//
//        // one object with 2 references
//        System.out.println( "Engine details:");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//
//        engine1.capacity = 2100;
//
//        System.out.println( "Updated engine details:");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//
//        // concatenation= lipirea mai multor stringuri unul langa altul
//        System.out.println("Properties of " + carReference.name);
//        System.out.println("color: " + carReference.color);
//        System.out.println("max speed: " + carReference.maxSpeed);
//        System.out.println("mileage: " + carReference.mileage);
//        System.out.println("fuel level: " + carReference.fuelLevel);
//        System.out.println("racing number: " + carReference.racingNumber);
//        System.out.println("damaged: " + carReference.damaged);
//
//        Car car2 = new Car(new Engine());
//        car2.name = "Lamborghini";
//        car2.damaged = true;
//
//        System.out.println("Properties of " + car2.name);
//        System.out.println("color: " + car2.color);
//        System.out.println("damaged: " + car2.damaged);
//
//        // modulo (modulus operator), rezulta restul impartirii
////       System.out.println(4 % 2 );
////        System.out.println(4 % 2 == 0);
////       System.out.println(4 % 3);


    }
}
