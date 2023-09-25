package br.com.ppaulo;

public  class NameCar {
    private String name;

    public NameCar(String nome) {
        this.name = this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
