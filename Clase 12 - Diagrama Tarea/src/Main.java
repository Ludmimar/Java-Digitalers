
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("u001", "1234", "activo", "2025-07-11",
                "Juan Pérez", "Calle Falsa 123", "juan@mail.com", "1234-5678-9012-3456",
                "Retiro en domicilio", 5000);

        cliente.register();
        cliente.login();
        
        CarritoDeCompras item = new CarritoDeCompras(1, 101, 2, 20250711);
        cliente.agregarCarrito(item);

        System.out.println("-------------------------------------------------");
        item.addCartItem();
        item.updateQuantity();
        item.viewCartDetails();
        item.checkOut();
        System.out.println("-------------------------------------------------");
        InformacionEnvio envio = new InformacionEnvio("S001", "Express", 1000, 2);
        Pedido pedido = new Pedido(1, "2025-07-11", "2025-07-12", "Juan Pérez", "u001", "pendiente", "S001", envio);

        DetallesPedido detalle1 = new DetallesPedido(1, 201, "Teclado", 2, 1500);
        DetallesPedido detalle2 = new DetallesPedido(1, 202, "Mouse", 1, 1000);
        pedido.agregarDetalle(detalle1);
        pedido.agregarDetalle(detalle2);
        pedido.mostrarDetalles();

        cliente.agregarPedido(pedido);
        System.out.println("-------------------------------------------------");
        DetallesPedido detalle3 = new DetallesPedido(1, 203, "Monitor", 2, 1500);
        DetallesPedido detalle4 = new DetallesPedido(1, 204, "Impresora", 1, 1000);
        
        pedido.agregarDetalle(detalle3);
        pedido.agregarDetalle(detalle4);
        pedido.mostrarDetalles();
        
        cliente.agregarPedido(pedido);
        
        System.out.println("Pedidos del cliente: " + cliente.getPedidos().size());
        
        
    }
}


