
public class DetallesPedido {
	 private int orderId;
	    private int productId;
	    private String productName;
	    private int quantity;
	    private float unitCost;
	    private float subtotal;
	    
	    // Constructor
	    public DetallesPedido(int orderId, int productId, String productName, int quantity, float unitCost) {
	        this.orderId = orderId;
	        this.productId = productId;
	        this.productName = productName;
	        this.quantity = quantity;
	        this.unitCost = unitCost;
	        calcPrice();
	    }
	    
	    // getters and setters   
	    public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public float getUnitCost() {
			return unitCost;
		}

		public void setUnitCost(float unitCost) {
			this.unitCost = unitCost;
		}

		public float getSubtotal() {
			return subtotal;
		}

		public void setSubtotal(float subtotal) {
			this.subtotal = subtotal;
		}

		public void calcPrice() {
	        subtotal = quantity * unitCost;
	    }
}
