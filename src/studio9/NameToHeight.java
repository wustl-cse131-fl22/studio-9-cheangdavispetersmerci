package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String, String> heightinches = new HashMap<>();
		heightinches.put("Emily", "66 inches");
		heightinches.put("Daniel", "68 inches");
		heightinches.put("Haya", "67 inches");
		heightinches.put("Mercy", "66 inches");
		String name = "i";
		while(!name.equals("quit")) {
			System.out.println("Name?");
			name = in.nextLine();
			boolean trip = false;
			for(String i : heightinches.keySet()){
				if(i.equals(name)) {
					System.out.println(heightinches.get(name));
					trip = true;
				}
			}
			if (!trip) {
				System.out.println("null");
			}
		}
	}
}
