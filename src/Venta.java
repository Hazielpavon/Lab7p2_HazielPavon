
public class Venta {

    private String vendedor; 
    private String cliente; 
    private double costo; 
    private String carro; 

    public Venta(Vendedor vendedor, Cliente cliente, double costo, Vehiculo carro) {
        
        this.costo = costo;
        
    }

    public Venta() {
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return  "Venta = "+ "\n" + vendedor + "cliente = " + cliente + "," + "\n"+ "costo = " + costo + "," + "\n" + "carro = " + carro;
    }
    
    
    
    
    
    
    

}
