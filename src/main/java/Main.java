import com.aljoschazoeller.java.domain.base.Car;
import com.aljoschazoeller.java.domain.base.Motorcycle;
import com.aljoschazoeller.java.domain.base.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.printVehicle();

        Car c1 = new Car();
        c1.printCar();

        Motorcycle m1 = new Motorcycle();
        System.out.println(m1.getType());

        System.out.println(m1);
    }
}
