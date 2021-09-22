
public class DfEExercise1 {

	public static void main(String[] args) {
		 
		boolean isEdselHappy = true; // test to see if true or false - set to true as default
 
		int weight = 20; // In this line, weight is being stored as an int with value 20 
		String name = "Billy Bob"; // the name variable is assigned billy bob
		Dog goodBoy = new Dog(name, weight); // new instance of dog with the variables from above
		int x = weight - 10; // weight var - 10 stored in new var called x
		if (x < 15) goodBoy.bark(); // if x is less the dog goodboy barks
 
		while (x < 3) { // if x less than 3 
			goodBoy.play(); //then dog gets to play
		}
 
		int[] numList = {1,2,3,4,5,6};
		System.out.println("How are you");//ask question
		System.out.println("My " + name + " is doing great" //my dog name is great, yours?
				+ " how's yours");
		String num = "305"; 
		int z = Integer.parseInt(num);
		System.out.println(z);
	}
}
