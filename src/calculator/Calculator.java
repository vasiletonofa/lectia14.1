package calculator;

public class Calculator {

    private int count;
    private Ram ram;

    public Calculator(int count) {
        this.count = count;
        ram = new Ram();
    }

     private class Ram extends InternetCafe  { // default, private, public, protected
         public void incrementCount() {
             System.out.println( count);
         }

         public int getCount() {
             return count;
         }
     }

     public void callIncrementCount() {
         ram.incrementCount();
     }

     public int getCount() {
         return count;
     }

     public void incrementCount() {
         ram.incrementCount();
     }

     public int getCountFromRam() {
         return  ram.getCount();
     }

     public void innerMethodClass() {

        String test = "";

        class Cpu {
            String producator;

            public void increment() {
                System.out.println(count);
                System.out.println();
            }
        }

        Cpu cpu = new Cpu();
        cpu.increment();
         System.out.println(cpu.producator);
     }


     public void callCpu() {

     }
}



class MotherBoard {

}