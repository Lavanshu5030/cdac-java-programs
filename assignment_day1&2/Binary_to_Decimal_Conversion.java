package assignment_day1;

public class Binary_to_Decimal_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 010; 
        int dec_value = 0; 
  
        int base = 1; 
  
     
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
  
        System.out.println(dec_value);


	}

}
