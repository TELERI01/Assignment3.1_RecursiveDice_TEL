import java.util.Random;

public class DieRollerDriver {
	Random random = new Random();
	int sides = 6;
	/**
	 * Constructor
	 */
	public DieRollerDriver() {
		
	}
	/**
	 * 
	 * @param i variable to count to 1000
	 * @param k variable to keep track of twos 
	 * @return if conditions on i and k aren't met, will return a 
	 * 		   recursive function to roll again, otherwise when it is done it return a roll
	 */
	public int roll(int i, int k) {
		int roll = random.nextInt(7);
		int lastTwo =0;
		int mean;
		 //Rolls the six sided dice;
		System.out.println("Number Rolled: " + roll+ " #: i:" +i +"; k:"+ k);
		
		if(i<1000) {
			if(roll == 2) {
				if(k==0) {
					//System.out.println("It took "+i+ " rolls to get this two!");
					lastTwo = i;
					k++;
				}
				else if(k!=0){
					int num = k-lastTwo;
					//System.out.println("It took "+num+ " rolls to get this two!");
					k += 1;
				}
			}
			return roll(i+1, k);//Recursive Function here!
		}else {
			System.out.println("\nDone! There were " + k + " 2's rolled! Mean is below!");
			mean = 1000/k;
		}
		
		return mean;
	}
}
