import java.util.ArrayList;
	
public class Pedido {
	private int orderId;
	private String dateCreated;
	private String dateShipped;
	private String customerName;
	private String customerId;
	private String status;
	private String shippingId;

	private InformacionEnvio informacionEnvio;
	private ArrayList<DetallesPedido> detallesPedido = new ArrayList<>();

	// constructor
	public Pedido(int orderId, String dateCreated, String dateShipped, String customerName, String customerId,
			String status, String shippingId, InformacionEnvio informacionEnvio) {
		this.orderId = orderId;
		this.dateCreated = dateCreated;
		this.dateShipped = dateShipped;
		this.customerName = customerName;
		this.customerId = customerId;
		this.status = status;
		this.shippingId = shippingId;
		this.informacionEnvio = informacionEnvio;
	}

	// getters and setters
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(String dateShipped) {
		this.dateShipped = dateShipped;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShippingId() {
		return shippingId;
	}

	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
	}

	public InformacionEnvio getInformacionEnvio() {
		return informacionEnvio;
	}

	public void setInformacionEnvio(InformacionEnvio informacionEnvio) {
		this.informacionEnvio = informacionEnvio;
	}

	public ArrayList<DetallesPedido> getDetallesPedido() {
		return detallesPedido;
	}

	public void setDetallesPedido(ArrayList<DetallesPedido> detallesPedido) {
		this.detallesPedido = detallesPedido;
	}

	// Metodos
	public void agregarDetalle(DetallesPedido detalle) {
		detallesPedido.add(detalle);
	}

	public void mostrarDetalles() {
		System.out.println("Detalles del Pedido ID: " + orderId);
		for (DetallesPedido d : detallesPedido) {
			System.out.println("Producto: " + d.getProductName() + ", Cantidad: " + d.getQuantity() + ", Subtotal: $"
					+ d.getSubtotal());
		}
	}

	public void placeOrder() {
	}
}
