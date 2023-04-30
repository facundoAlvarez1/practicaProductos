public class ProductoInformatico extends Producto{
    private String nombreFabricante;

    public ProductoInformatico() {
    }

    public ProductoInformatico(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public ProductoInformatico(int stock, String nombre, Double precio, String nombreFabricante) {
        super(stock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                '}';
    }

}
