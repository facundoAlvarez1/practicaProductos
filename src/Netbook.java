public class Netbook extends ProductoInformatico{
    private Integer memoria;
    public Netbook() {
    }

    public Netbook(String nombreFabricante, Integer memoria) {
        super(nombreFabricante);
        this.memoria = memoria;
    }

    public Netbook(int stock, String nombre, Double precio, String nombreFabricante, Integer memoria) {
        super(stock, nombre, precio, nombreFabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Netbook{" +
                "memoria=" + memoria +
                '}'+ super.toString();
    }
}
