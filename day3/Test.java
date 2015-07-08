package day3;

public class Test implements Usb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army(3);
		 a.addWeapon(new Tank());
		 a.addWeapon(new Flighter());
		 a.addWeapon(new WarShip());
		 a.attacAll();
		 a.moveAll();
		 }
	}

