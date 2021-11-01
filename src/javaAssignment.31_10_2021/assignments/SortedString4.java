package com.technoelevate.assignments;

import java.util.Arrays;

public class SortedString4 {
	public static void main(String[] args){   
	    
	   
	            
	    String[] my_array2 = {
	            "Java",
				
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++"
	        };        
	    
	    
	    System.out.println("Original string array : "+Arrays.toString(my_array2));
	    Arrays.sort(my_array2);
	    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
	    }
	}

