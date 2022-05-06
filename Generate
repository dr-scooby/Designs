/**
 * 
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import plans.*;

/**
 * @author jismailx
 * Generate the main method, entry point of application
 */
public class Generate {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		GetPlanFactory factory = new GetPlanFactory();
		

		System.out.println("Enter the name of the plan, Domestic, Commercial, Institution:> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planname = br.readLine();
	
		System.out.println("Enter number of units the bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());
		
		Plan pl = factory.getPlan(planname);
		
		System.out.println("Bill amount for " + planname + " of " + units + " units is:" );
		
		pl.getRate();
		pl.calculateBill(units);
		
	}

}
