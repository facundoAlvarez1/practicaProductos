public class Silla extends Mueble{
    private boolean ruedas;
    public Silla() {
    }

    public Silla(boolean ruedas) {
        this.ruedas = ruedas;
    }

    public Silla(int stock, String nombre, Double precio, boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }


    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                '}' + super.toString();
    }

}
