
public class TV extends Product{
	
	private String screenType;
    private String resolution;
    private double displaySize;

	public TV(int item_num, String name, int quantity, double price,
            String screenType, String resolution, double displaySize) {
		
		super(item_num, name, quantity, price);
        this.screenType = screenType;
        this.resolution = resolution;
        this.displaySize = displaySize;
	}
	
	public String getScreenType() {
        return screenType;
    }
	
	public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getResolution() {
        return resolution;
    }
    
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getStockValue() {
        return getPrice() * getQuantity();
    }
    
    public String toString(){
    	return("Item Number       : " + this.getItemNum() + "\nProduct Name      : " + this.getName() +
    			"\nScreen type       : " + this.getScreenType() + "\nResolution        : " + this.getResolution() + "\nDisplay size      : " + this.getDisplaySize() +
    			"\nQuantity Available: " + this.getQuantity() + "\nPrice (RM)        : " + this.getPrice() + "\nInventory Value (RM): " 
				+ this.getInventoryValue() + "\nProduct Status    : " + (this.getStatus()?"active":"discontinue"));

    }
	public void ProductDetails(){
	}
}

