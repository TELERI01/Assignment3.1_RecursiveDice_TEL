import java.util.Random;
public class RecDieRollerDriver {
	
	
	public static void main(String[] args) {
		
		System.out.println("====Dice Roller====");
		System.out.println("i is counting to 1000!");
		System.out.println("k is counting the 2's rolled!\n");
		DieRollerDriver dice = new DieRollerDriver();
		int result = dice.roll(0,0);
		System.out.println(result);
	}

}
