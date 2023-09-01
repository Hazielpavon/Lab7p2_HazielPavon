
import java.awt.Color;

public class Vehiculo {

    private String marca, modelo;
    private Color color;
    private int ano;
    private double precio;
    private int id;

    public Vehiculo(String marca, String modelo, Color color, int ano, double precio, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.precio = precio;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehiculos: " + "\n" + "Marca del vehiculo: " + marca+ "," + "\n" + "Modelo del vehiculo: " + modelo + "," + "\n" + "Anio del carro: " + ano + "," + "\n" + "Precio del vehiculo: " + precio + "," + "\n" + "Color: " + color + "," + "\n" + "id unico " + id;
    }

}
