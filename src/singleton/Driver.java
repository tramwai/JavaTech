package singleton;

import java.util.Date;

public class Driver {

    // Achieve singleton design pattern for the driver object

    private Driver(){}

    private static Driver driver;

    public static Driver getDriver(){
        if (driver == null) driver = new Driver();
        return driver;
    }

}
