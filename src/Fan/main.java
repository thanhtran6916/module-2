package Fan;

import java.sql.Time;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSlow(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOnOff(true);
        System.out.println("Fan1");
        System.out.println(fan1.toString());

        System.out.println("");

        System.out.println("Fan2"   );
        Fan fan2 = new Fan();
        fan2.setSlow(fan2.medium);
        System.out.println(fan2.toString());
    }
}
