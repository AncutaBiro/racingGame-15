package org.fasttrackit;

public class Mechanic {

    public void repair (Vehicle vehicle) {
        System.out.println( "Repairing vehicle " + vehicle.getName());

        vehicle.setTotalDistance(vehicle.getTotalDistance()-1);
        vehicle.setDamaged (false);


//        metoda inainte sa incapsulez Vehicle

//        System.out.println( "Repairing vehicle " + vehicle.name);
//
//        vehicle.totalDistance--;
//        vehicle.damaged = false;


    }
}
