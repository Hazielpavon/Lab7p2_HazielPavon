
import java.awt.Color;

public class Vehiculo {

    private String marca;
    private Color color;
    private int ano;
    private double precio; 

    public Vehiculo(String marca, Color color, int ano, double precio) {
        this.marca = marca;
        this.color = color;
        this.ano = ano;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + " marca = " + marca + " , color = " + color + " , ano = " + ano + ", precio = " + precio;
    }
            
}
