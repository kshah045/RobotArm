import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            RobotArm robotArm = new RobotArm(1, 1);
        } catch (Exception e) {
            System.out.println("You probably should start by implementing the constructor :)");
        }
        System.out.println("Congratulations, you run the application");
    }
}
