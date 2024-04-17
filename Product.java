public abstract class Product {
	private String name;
	private double price;
	private int quantity;
	private int item_num;
	private boolean status;
	
	public Product()
	{
	}
	
	public Product( int item_num, String name, int quantity, double price )
	{
		super();
		this.item_num=item_num;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		this.status= true;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setItemNum(int item_num) {
		this.item_num=item_num;
	}
	
	public int getItemNum() {
		return item_num;
	}
	
	public void setStatus(boolean status) {
		this.status=status;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public double getInventoryValue() {
		return price*quantity;
	}
	
	public void addQuantity(int quantity) {
		if (status) {
			this.quantity+=quantity; 
		}
		else
			System.out.println("Cannot add stock to a discontinued product line.");
	}
	public void deductQuantity(int quantity) {
		if(status) {
			this.quantity-=quantity;
			
			if (this.quantity < 0) {
				this.quantity = 0;
			//ensure no negative quantity value
			}
		}
		else {
			System.out.println("Cannot deduct stock from a discontinued product line.");
		}
	}
	@Override
	public String toString(){
		public String toString() {
		System.out.println("Item Number: " + item_num + "\nProduct Name: " + name + "\nQuantity Available: " + quantity + "\nPrice (RM): " + price + "\nInventory Value (RM): " 
				+ getInventoryValue() + "\nProduct Status: " + (status? "active":"discontinue"));
	}
	public abstract void ProductDetails();
	
}


