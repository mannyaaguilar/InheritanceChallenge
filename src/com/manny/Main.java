package com.manny;

public class Main {

    public static void main(String[] args) {
	//Challenge!
        // Start with a base class of Vehicle, then create a Car class that
        //inherits from the base class
        // Finally, create another class, a specific type of Car that inherits from the Car class
        // You should be able to hand steering, change gears, and moving (i.e. speed)
        // You will want to decide where to put the appropriate state and behaviors (fields and methods)
        // As mentioned above, changing gears, increasing/decreasing speed should be included
        // For your specific type of vehicle, you will want to add something specific for that type of car
        // Inheritance gives you lots of flexibility to model real life Objects in software.

    Outlander outlander = new Outlander(36);
    outlander.steer(45);
    outlander.accelerate(30);
    outlander.accelerate(20);
    outlander.accelerate(-42);
    }
}
