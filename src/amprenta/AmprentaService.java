package amprenta;

public class AmprentaService {


    public void lasaAmprenta(String[] names) {

        for (String personName : names) {
            Amprenta amprenta = new Amprenta() {
                @Override
                public void lasaAmprenta() {
                    System.out.println("Amprenta " + personName);
                }
            };

            amprenta.lasaAmprenta();
        }

    }
}
