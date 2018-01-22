package com;
/**
 * 
 * @author yuvarajgowda K
 *
 *	program to print 'a' on multiples of 3 and 
 *					 'b' on multiles of five
 *					 'ab' on multiples of both 3 and 5
 *					 from 1 to 100
 */
public class Multiples {

	/**
	 * funtction to check whether number is multiple of 3 or not
	 * @param n - number which has to check whether it is multiple of 3 
	 * @return	boolen value true if the number is multiple of 3
	 * 						 false if the number is not multiple of three
	 */
	public static boolean isMultipleOfThree(int n){
		if(0==(n%3))
			return true;
		return false;
	}
	
	
	/**
	 * funtction to check whether number is multiple of 5 or not
	 * @param n - number which has to check whether it is multiple of 5 
	 * @return	boolen value true if the number is multiple of 5
	 * 						 false if the number is not multiple of 5
	 */
	public static boolean isMultipleOfFive(int n){
		if(0==(n%5))
			return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		int i;
		for(i=2;i<100;i++){
			//if the number is multiple of both 3 and 5 then print ab
			if(isMultipleOfFive(i) && isMultipleOfThree(i)){
				System.out.println("ab");
				continue;
			}
			//if the number is multiple of 5 only then print b
			else if(isMultipleOfFive(i)){
				System.out.println("b");
				continue;
			}
			
			//if the number is multiple of 3 only then print a
			else if(isMultipleOfThree(i)){
				System.out.println("a");
				continue;
			}
		}

	}

}
