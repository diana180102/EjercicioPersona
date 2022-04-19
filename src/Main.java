public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Diana", 32, 45456465);

        System.out.println("Nombre: "+persona.getNombre() +
                            " Edad: " + persona.getEdad() +
                            " Telefono: "+ persona.getTelefono());


    }
}