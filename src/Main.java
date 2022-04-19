public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("natalia", 33, 2323235, 30);
        Trabajador trabajador = new Trabajador("Diana ", 32, 46546, 60000);


        System.out.println("---Datos de Cliente---");
        System.out.println("Nombre: "+ cliente.getNombre() +
                            " Edad: "+ cliente.getEdad()+
                            " Telefono: "+ cliente.getTelefono()+
                            " Credito "+ cliente.getCredito());

        System.out.println("---Datos de Trabajor---");
        System.out.println("Nombre: "+ trabajador.getNombre() +
                " Edad: "+ trabajador.getEdad()+
                " Telefono: "+ trabajador.getTelefono()+
                "  Credito "+ trabajador.getSalario());



    }
}