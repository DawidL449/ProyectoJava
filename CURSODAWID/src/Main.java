import Producto.Producto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Products");
    }
    Producto products1 = new Producto  ("aceite" , 1, 6.0 ,"botella de cristal");
    Producto products2 = new Producto  ("agua" , 2, 6,0 "botella de cristal");
    Producto products3 = new Producto  ("macarrones", 3, 6.0 ,"plastico");
    Producto products4 = new Producto  ("aceite" , 4, 6,0 "botella de cristal");
    Producto products5 = new Producto  ("aceite" , 5, 6.0 "botella de cristal");
    Producto[] arrayproducts =new Producto []{products1,products2,products3,products4,products5};
      System.out.println(products1);
        System.out.println(products2);
        System.out.println(products3);
        System.out.println(products4);
        System.out.println(products5);

}