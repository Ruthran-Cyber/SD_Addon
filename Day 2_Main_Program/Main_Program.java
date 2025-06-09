package sd_addon;
public class Main_Program {
	    public static void main(String[] args) {
	        String s = "madam";
	        int i = 0, j = s.length() - 1;
	        while (i < j && s.charAt(i++) == s.charAt(j--));
	        System.out.println(i >= j ? "Palindrome" : "Not Palindrome");
	    }
	}

	



