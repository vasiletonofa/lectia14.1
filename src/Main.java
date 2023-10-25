import amprenta.*;
import calculator.Calculator;
import device.Device;

public class Main {
    public static void main(String[] args) {

//        Calculator calculator = new Calculator();
//        calculator.incrementCount();
//


//        Person nicolae = new Person();
//        nicolae.setAge(20);
//        nicolae.setName("Nicolae");
//        System.out.println(nicolae.getAge());
//        System.out.println(nicolae.getName());
//
//        Person vasile = new Person();
//        vasile.setAge(20);
//        vasile.setName("Nicolae");
//        System.out.println(vasile.getAge());
//        System.out.println(vasile.getName());
//
//      Ion ion = new Ion();
//      Ion ion2 = new Ion();
//
//        Amprenta vlad = new Amprenta() {
//            @Override
//            public void lasaAmprenta() {
//                System.out.println("Amprenta Vlad");
//            }
//
//            @Override
//            public void getAmprenta() {
//
//            }
//
//            @Override
//            public void setAmprenta() {
//
//            }
//        };
//
//
//        Amprenta vlad2 = new Amprenta() {
//            @Override
//            public void lasaAmprenta() {
//                System.out.println("Amprenta Vlad");
//            }
//
//            @Override
//            public void getAmprenta() {
//
//            }
//
//            @Override
//            public void setAmprenta() {
//
//            }
//        };
//
//
//        Amprenta ion = new Ion();
//
//        ion.lasaAmprenta();
//        andrei.lasaAmprenta();
//        vlad.lasaAmprenta();


//
//        AmprentaService amprentaService = new AmprentaService();
//        amprentaService.lasaAmprenta(new String[]{"Ion", "Vasile", "Nicolae", "Andrei", "Anton"});


        Device device = new Device();
        Device.Charger charger = new Device.Charger();
        charger.charge();


        Calculator calculator = new Calculator();
        Calculator.Ram ram = calculator.new Ram();


    }
}