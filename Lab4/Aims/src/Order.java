import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	public static final int MAX_NUMBERS_ORDER = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	private int qtyOrdered = 0;
	private String dateOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
	
	// Methods
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if( this.qtyOrdered < MAX_NUMBERS_ORDER) {
			this.itemsOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.println("This item has been added");
		}else {
			System.out.println("The order is almost full");
		}
	}
	
	

	public Order() {
		super();
		
		if(nbOrders + 1 < MAX_LIMITED_ORDERS) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			this.dateOrdered = dateFormat.format(date);
			nbOrders +=1;
		}else System.out.println("Can not be added more order");
	}



	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for (DigitalVideoDisc dvd : dvdList) {
			if(qtyOrdered < MAX_NUMBERS_ORDER) {
				System.out.println("The item " + dvd.getTitle() + " is added");
				itemsOrdered[this.qtyOrdered++] = dvd;
			}else {
				System.out.println("Can not add more dvd");
				break;
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered + 2 < MAX_NUMBERS_ORDER) {
			itemsOrdered[this.qtyOrdered++] = dvd1;
			itemsOrdered[this.qtyOrdered++] = dvd2;
		}else {
			System.out.println("Can not add 2 items because of being full of items");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		int i;
		for(i = 0 ; i < this.qtyOrdered ; i++) {
			if(disc.getTitle() == itemsOrdered[i].getTitle()) {
				break;
			}
		}
		for(;i< this.qtyOrdered ; i++) {
			itemsOrdered[i] = itemsOrdered[i+1];
		}
		if(i == 0) {
			System.out.println("This item is not in order");
		}else {
			this.qtyOrdered -= 1;
			System.out.println("This item has been removed. The remaining item(s): " + this.qtyOrdered);
		}
	}
	
	public float totalCost() {
		float totalCostCount = 0.00f;
		for (DigitalVideoDisc digitalVideoDisc : itemsOrdered) {
			if(digitalVideoDisc != null) {
				
				totalCostCount += digitalVideoDisc.getCost();
			}
			
		}
		return totalCostCount;
	}
	
	public void print() {
		System.out.println("*********************Order***************************");
		System.out.println("Date: " + this.dateOrdered);
		for ( int i = 0 ; i < this.qtyOrdered ; i++ ) {
			
			System.out.println("DVD-"+ itemsOrdered[i].getTitle() + "-" + itemsOrdered[i].getCategory() +"-" + itemsOrdered[i].getDirector() +"-" + itemsOrdered[i].getLength()  +":" + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*****************************************************");
	}
	
	
	//Getter and setter
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public String getDateOrderd() {
		return dateOrdered;
	}

	public void setDateOrderd(String dateOrderd) {
		this.dateOrdered = dateOrderd;
	}
}