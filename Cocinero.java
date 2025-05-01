public class Cocinero {
    String nombre;
    int experiencia;
    String especialidad;
    public Cocinero(String nombre,int experiencia,String especialidad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;

    }
    public void mostrar() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Años de experiencia: "+experiencia);
        System.out.println("Especialidad: "+especialidad);


    }
}
