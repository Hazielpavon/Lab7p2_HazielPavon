
public class Vendedor {
    
    
    private String nombre; 
    private int carrosven; 
    private double dingen; 

    public Vendedor(String nombre, int carrosven, double dingen) {
        this.nombre = nombre;
        this.carrosven = carrosven;
        this.dingen = dingen;
    }

    public Vendedor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarrosven() {
        return carrosven;
    }

    public void setCarrosven(int carrosven) {
        this.carrosven = carrosven;
    }

    public double getDingen() {
        return dingen;
    }

    public void setDingen(double dingen) {
        this.dingen = dingen;
    }

    @Override
    public String toString() {
        return "Vendedor: " + "nombre=" + nombre + ", carrosven=" + carrosven + ", dingen=" + dingen + '}';
    }
    
    
    
    
    
}
