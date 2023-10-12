import java.util.Random;
/**
 * CS215
 * @author tylerlericos
 * Johnson
 * Recursive Dice
 */
public class RecDieRollerDriver {
	public static void main(String[] args) {
		//Testing Code
		System.out.println("====Dice Roller====");
		System.out.println("i is counting to 1000!");
		System.out.println("k is counting the 2's rolled!\n");
		DieRollerDriver dice = new DieRollerDriver();
		int result = dice.roll(0,0);//Rolls, 0's for base roll
		System.out.println(result);//Prints the integer result when roll method is finished!
	}

}
