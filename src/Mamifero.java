public class Mamifero extends Animal {

    public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    public void respirar() {
        System.out.println("Respiro aire por los pulmones");
    }

    @Override
    public void moverse() {
        System.out.println("Me muevo a 4 patas");
    }

    public void mamar() {
        System.out.println("Cuando soy pequeño mamo");
    }
}
