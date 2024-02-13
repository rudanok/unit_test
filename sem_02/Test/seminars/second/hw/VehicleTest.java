package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void carInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void carHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void carTestDriveSpeed() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void motorcycleTestDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void carParkSpeed() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void motorcycleParkSpeed() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}