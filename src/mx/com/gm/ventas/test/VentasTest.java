
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        Producto producto3 = new Producto("Short", 25.00);
        Producto producto4 = new Producto("Bufanda", 20.00);
        Producto producto5 = new Producto("Chamarra", 500.00);
        Producto producto6 = new Producto("Vestido", 250.00);
        Producto producto7 = new Producto("Zapatos", 270.00);
        Producto producto8 = new Producto("Tennis", 450.00);
        Producto producto9 = new Producto("Botas", 300.00);
        Producto producto10 = new Producto("Sudadera", 350.00);
        Producto producto11 = new Producto("Saco", 470.00);
        
        Orden orden1 = new Orden();
        //orden1.mostrarOrden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        orden1.agregarProducto(producto11);
        //orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto10);
        orden2.agregarProducto(producto9);
        orden2.mostrarOrden();
    }
}
