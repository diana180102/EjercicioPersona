class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    //Constructor
    public Persona(String nombre, int edad, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Persona() {

    }

    //Get y set
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }






}
