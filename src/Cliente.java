
public class Cliente {

private String nombre; 
private int edad; 
private String profesion; 
private int cantcarros; 
private double sueldo; 

    public Cliente(String nombre, int edad, String profesion, int cantcarros, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.cantcarros = cantcarros;
        this.sueldo = sueldo;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCantcarros() {
        return cantcarros;
    }

    public void setCantcarros(int cantcarros) {
        this.cantcarros = cantcarros;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setCostotrans(double costotrans) {
        this.sueldo = costotrans;
    }

    @Override
    public String toString() {
        return "Cliente: " + "nombre = " + nombre + ", edad = " + edad + ", profesion = " + profesion + ", Cantidad de caroos comprados = " + cantcarros + " , sueldo disponible = " + sueldo; 
    }


    
        








    
}
