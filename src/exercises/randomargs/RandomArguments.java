package exercises.randomargs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomArguments {
	public static void main(String[] args) {
		List<String> arguments = new ArrayList<String>();
		
		arguments.add("Scout");
		arguments.add("Chris");
		arguments.add("Jen");
		arguments.add("Will");
		arguments.add("Braden");
		arguments.add("Cherie");
		
		Collections.shuffle(arguments);
		
		for(String arg : arguments) {
			System.out.println(arg);
		}
		
	}
}
