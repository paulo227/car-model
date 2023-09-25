package br.com.ppaulo;

public class CarModel extends NameCar{
    public CarModel(String nome) {
        super(nome);

        if (nome.equals("Corrola") || nome.equals("Cross") || nome.equals("Camry")){
            System.out.println("Carro(s) TOYOTA!!!");
        } else if (nome.equals("ARGO") || nome.equals("MOBI") || nome.equals("CRONOS")) {
            System.out.println("Carro(s) FIAT!!!");
        } else if (nome.equals("ONIX") || nome.equals("CRUZE")) {
            System.out.println("Carro(s) CHEVROLET!!!");
        }else {
            System.out.println("Modelo não encontrado ):");
        }
    }

}
