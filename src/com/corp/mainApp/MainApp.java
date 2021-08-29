package com.corp.mainApp;

import com.corp.dao.Chain;
import com.corp.daoImpl.AddNumbers;
import com.corp.daoImpl.DivideNumbers;
import com.corp.daoImpl.MultiplyNumbers;
import com.corp.daoImpl.SubtractNumbers;
import com.corp.model.Numbers;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		// Here I define all of the objects in the chain

		boolean run = true;

		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();

		// Here I tell each object where to forward the
		// data if it can't process the request

		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);

		//Scanner scan = new Scanner(System.in);
		while (run) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the mathematical operations like Add, Sub, Mult, Div:");
			String operation = scan.nextLine();
			if(operation.equals("add") || operation.equals("sub") || operation.equals("mult") || operation.equals("div") ) {
				System.out.println("Enter number 1: ");
				int input1 = scan.nextInt();

				System.out.println("Enter number 2: ");
				int input2 = scan.nextInt();
				
				// Define the data in the Numbers Object
				// and send it to the first Object in the chain

				 Numbers request = new Numbers(input1, input2, operation);

				 chainCalc1.calculate(request);
			}

			if (operation.equals("exit"))

			{
				System.out.println("Exiting Application");
				run = false;
			}
				System.out.println("____________________");
		}

	}

}