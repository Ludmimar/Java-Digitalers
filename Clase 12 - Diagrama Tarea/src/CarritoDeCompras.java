
public class CarritoDeCompras {
	 private int cartId;
     private int productId;
     private int quantity;
     private int dateAdded;

     //Constructor
     public CarritoDeCompras(int cartId, int productId, int quantity, int dateAdded) {
         this.cartId = cartId;
         this.productId = productId;
         this.quantity = quantity;
         this.dateAdded = dateAdded;
     }
     
     // getters and setters
     public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(int dateAdded) {
		this.dateAdded = dateAdded;
	}

	// metods
	public void addCartItem() {
		System.out.println("Producto agregado al carrito. ID: " + productId);
	}

	public void updateQuantity() {
		System.out.println("Cantidad actualizada para el producto ID: " + productId);
	}

	public void viewCartDetails() {
		System.out.println("Carrito ID: " + cartId + ", Producto ID: " + productId + ", Cantidad: " + quantity);
	}

	public void checkOut() {
		System.out.println("Checkout realizado para carrito ID: " + cartId);
	}
}
