 class Cliente  extends Persona{

    int credito = 0;

     public Cliente(String nombre, int edad, int telefono, int credito) {
         super(nombre, edad, telefono);

         this.credito = credito;
     }

     public int getCredito(){
         return  credito;
     }

     public void setCredito(int credito){
         this.credito = credito;
     }


 }
