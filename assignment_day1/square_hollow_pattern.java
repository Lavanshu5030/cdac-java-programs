package assignment_day1;

public class square_hollow_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n = 6;
		for (i = 0; i < n; i++) { 
            for (j = 0; j < n; j++) { 
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) { 
                    System.out.print("*"); 
                } 
                else { 
                    System.out.print(" "); 
                } 
            } 
            System.out.println(); 
        } 

	}

}
