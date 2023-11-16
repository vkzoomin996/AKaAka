 
public class Spa {
 	    public static void main(String[] args) {
	        String s = "iam  from  ts  vvvrr";

	        // Find the index of the first space
	        int firstSpaceIndex = s.indexOf("  ");
 
	        // Check if a space is found
	        if (firstSpaceIndex != -1) {
	            // Replace the first space with a hyphen
	            s = s.substring(0, firstSpaceIndex) + "- "+ s.substring(firstSpaceIndex + 2);
	        }

	        // Print the modified string
	        System.out.println(s);
	    }
	}

