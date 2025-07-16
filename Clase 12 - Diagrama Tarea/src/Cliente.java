import java.util.ArrayList;

public class Cliente extends Usuario{
	private String customerName;
    private String address;
    private String email;
    private String creditCardInfo;
    private String shippingInfo;
    private float accountBalance;

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<CarritoDeCompras> carrito = new ArrayList<>();
    
    // constructor
    public Cliente(String userId, String password, String loginStatus, String registerDate,
                   String customerName, String address, String email, String creditCardInfo,
                   String shippingInfo, float accountBalance) {
        super(userId, password, loginStatus, registerDate);
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.creditCardInfo = creditCardInfo;
        this.shippingInfo = shippingInfo;
        this.accountBalance = accountBalance;
    }
    
    
    // getters and setters
    public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public String getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(String shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public ArrayList<CarritoDeCompras> getCarrito() {
		return carrito;
	}

	public void setCarrito(ArrayList<CarritoDeCompras> carrito) {
		this.carrito = carrito;
	}

	
	// Metodos	
	public void register() {
		System.out.println("Cliente registrado: " + customerName);
	}

	public void login() {
		System.out.println("Inicio de sesión del cliente: " + customerName);
	}

	public void updateProfile() {
		System.out.println("Perfil actualizado para: " + customerName);
	}

	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void agregarCarrito(CarritoDeCompras item) {
		carrito.add(item);
	}
}
