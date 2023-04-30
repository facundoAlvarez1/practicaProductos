import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Producto> p = new ArrayList<>();
        DecimalFormat formato = new DecimalFormat("#");
        Silla s = new Silla(20,"Silla recta",2000.15,false);
        Escritorio e = new Escritorio(30,"Escritorio Fino",4000.20,5.5,1.2);
        Impresora i = new Impresora(50,"Epson456",12000.1,"Delta Computacion",14);
        Netbook n = new Netbook(12,"Samsung",12300.1,"Delta Computacion",16);

        p.add(s);
        p.add(e);
        p.add(i);
        p.add(n);

        //Punto 3
        System.out.println(s);
        System.out.println(e);
        System.out.println(i);
        System.out.println(n);

        //Punto 4
      s.aplicarDescuento(5);
        System.out.println(s);

        for (Producto nuevo:p) {
            switch (nuevo.getClass().getSimpleName()){
                case "Silla":
                    System.out.println(nuevo.getPrecio());
                    nuevo.aplicarDescuento(5);
                    String resultado = formato.format(nuevo.getPrecio());
                    System.out.println(resultado);
                    break;
                case "Escritorio":
                    System.out.println(nuevo.getPrecio());
                    nuevo.aplicarDescuento(10);
                    String resultado1 = formato.format(nuevo.getPrecio());
                    System.out.println(resultado1);
                    break;
                case "Impresora":
                    System.out.println(nuevo.getPrecio());
                    nuevo.aplicarDescuento(15);
                    String resultado2 = formato.format(nuevo.getPrecio());
                    System.out.println(resultado2);
                    break;
                case "Netbook":
                    System.out.println(nuevo.getPrecio());
                    nuevo.aplicarDescuento(20);
                    String resultado3 = formato.format(nuevo.getPrecio());
                    System.out.println(resultado3);
                    break;
            }
        }
    }
}