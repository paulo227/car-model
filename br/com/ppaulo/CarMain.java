package br.com.ppaulo;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {

        List<CarModel> lista = new ArrayList<>();
        lista.add(new CarModel("CRUZE"));
        lista.add(new CarModel("ARGO"));
        lista.add(new CarModel("Corrola"));
        lista.add(new CarModel("Cayenne"));
    }
}
