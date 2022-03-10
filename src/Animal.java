public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comunicarse() {
        System.out.println("MI nombre es " + nombre);
    }

    public abstract void respirar();

    public abstract void moverse();

    @Override
    public String toString() {
        return "Animal: " + nombre;
    }
}

