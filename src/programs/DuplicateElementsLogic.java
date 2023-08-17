package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsLogic {

	public static void main(String[] args) {

		String infra[] = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "SauceLabs", "Azure", "GCP" };

		// 1. brute force
		// 2. HashSet
		// 3. HashMap
		// 4. stream class

		// 1. brute force - using for loop

		System.out.println(" Brute force method");

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}

		// 2. Hashset

		System.out.println(" HashSet Method");
		Set<String> data = new HashSet<String>();

		for (String s : infra) {
			if (data.add(s) == false) {
				System.out.println(s);
			}
		}
		
		
		
		
	}

}
