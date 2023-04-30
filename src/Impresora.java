public class Impresora extends ProductoInformatico{
    private Integer hojaXminuto;

    public Impresora() {
    }

    public Impresora(String nombreFabricante, Integer hojaXminuto) {
        super(nombreFabricante);
        this.hojaXminuto = hojaXminuto;
    }

    public Impresora(int stock, String nombre, Double precio, String nombreFabricante, Integer hojaXminuto) {
        super(stock, nombre, precio, nombreFabricante);
        this.hojaXminuto = hojaXminuto;
    }

    public Integer getHojaXminuto() {
        return hojaXminuto;
    }

    public void setHojaXminuto(Integer hojaXminuto) {
        this.hojaXminuto = hojaXminuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "hojaXminuto=" + hojaXminuto +
                '}' + super.toString();
    }
}
