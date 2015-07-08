package day3;

public interface Usb {
	interface Assaultable {
		 void attack();
	}
	interface Mobile {
		 void move();
	}
	abstract class Weapon implements Assaultable, Mobile {
		public void attack(){
		}  
		public void move(){
		}
	}
	class Tank extends Weapon {
		 public void attack() {
		   System.out.println("Tank attacks");
		 }
		 public void move() {
		   System.out.println("Tank moves");
			 }
}   class Flighter extends Weapon {
	 public void attack() {
		   System.out.println("Flighter attacks");
		 }
		 public void move() {
		   System.out.println("Flighter, moves");
			 }
	
}   class WarShip extends Weapon {
	 public void attack() {
		   System.out.println("WarShip attacks");
		 }
		 public void move() {
		   System.out.println("WarShip, moves");
			 }
	
}
class Army {
	 private Weapon[] w ;
	 private int size = 0;
	 public Army(int i) {
	 w = new Weapon[i];
	 }

	 public void addWeapon(Weapon weapon) {
	 if (size >= w.length) {
	 System.out.println("军队装备足够了!");
	 return;
	 } 
	 else {
	  w[size] = weapon;
	 size++;
	 }
	 }

	 public void attacAll() {
	 for (Weapon wea : w) {
	 if (wea != null) {
	 wea.attack();
	 }
	 }
	 }

	 public void moveAll() {
	 for (Weapon wea : w) {
	 if (wea != null) {
	 wea.move();
	 }
	 }
	 }



		}
}


	
		

