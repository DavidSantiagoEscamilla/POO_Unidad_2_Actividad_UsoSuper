package ejercicioDos;

public class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + this.especie);
    }
}