package device;

public class Device {



    // Anonymous Class
    // Inner Clas
    // Restul nu se folosesc

   static int count;

    public Charger charger;

    public static void hello() {
        System.out.println("Hello");
    }

    public static class Charger {
        public void charge() {
            System.out.println("Charging device" + count);

            hello();
        }
    }

}
