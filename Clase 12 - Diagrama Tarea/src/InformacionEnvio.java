
public class InformacionEnvio {
	private String shippingId;
    private String shippingType;
    private int shippingCost;
    private int shippingRegionId;

    // Constructor
    public InformacionEnvio(String shippingId, String shippingType, int shippingCost, int shippingRegionId) {
        this.shippingId = shippingId;
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
        this.shippingRegionId = shippingRegionId;
    }
    
    //getters and setters    
    public String getShippingId() {
		return shippingId;
	}

	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
	}

	public String getShippingType() {
		return shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public int getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
	}

	public int getShippingRegionId() {
		return shippingRegionId;
	}

	public void setShippingRegionId(int shippingRegionId) {
		this.shippingRegionId = shippingRegionId;
	}

	public void updateShippingInfo() {}
}
