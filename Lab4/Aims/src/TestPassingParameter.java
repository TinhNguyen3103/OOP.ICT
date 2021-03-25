
public class TestPassingParameter {
	public static void main(String args[]) {
		DigitalVideoDisc jungleDigitalVideoDisc = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cindereDigitalVideoDisc = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDigitalVideoDisc, cindereDigitalVideoDisc);
		System.out.println("Jungle dvd title: " + jungleDigitalVideoDisc.getTitle());
		System.out.println("Cinderella: " + cindereDigitalVideoDisc.getTitle());
		
		changeTitle(jungleDigitalVideoDisc, cindereDigitalVideoDisc.getTitle());
		System.out.println(jungleDigitalVideoDisc.getTitle());
	}
	
	public static void swap(Object o1,Object o2) {
		Object tempObject = o1;
		o1 = o2;
		o2 = tempObject;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd,String newTitle) {
		String oldTitleString = dvd.getTitle();
		dvd.setTitle(newTitle);
		dvd = new DigitalVideoDisc(oldTitleString);
	}
}
