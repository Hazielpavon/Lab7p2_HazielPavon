
public class Venta {

    private String vendedor; 
    private String cliente; 
    private double costo; 
    private String carro; 

    public Venta(String vendedor, String cliente, double costo, String carro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.costo = costo;
        this.carro = carro;
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
        return  "Venta = " + vendedor + " , cliente = " + cliente + " , costo = " + costo + ", carro = " + carro;
    }
    
    
    
    
    
    
    

}
