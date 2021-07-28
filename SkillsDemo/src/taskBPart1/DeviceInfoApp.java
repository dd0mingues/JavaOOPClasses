package taskBPart1;

import java.util.Scanner;

public class DeviceInfoApp {

	public static void main(String[] args) {
		
		//Importing the device list array from the other .java file 
		Device[] devices = DeviceList.getDeviceArray();
		
		//initializing a device navigator object with the device array that 	was just imported
		DeviceNavigator deviceNavigator = new DeviceNavigator(devices);
		
		//Initializing the variables outside of the scope of the while loop
		boolean moreInfo = false;

		//print the menus before the while loop starts
		printGUI(deviceNavigator,moreInfo);
		
		//this while loop will keep running the program until the the exit key is pressed
		while (true) {
			
			//prompt the user for an input
			System.out.println("Choose an option and press ENTER");
			String choice = k.nextLine();
			
			//case switch to parse all the user inputs. The program accepts numbers 1-7. 
			//If the user inputs anything else, the default case will run
			switch (choice) {
			//cases 1-4 get device requested and prints the GUI for so the user can continue to use the program
			case "1":
				//previous device
				deviceNavigator.getPreviousDevice();
				moreInfo = false;
				
				printGUI(deviceNavigator,moreInfo);
				break;
			case "2":
				//next device
				deviceNavigator.getNextDevice();
				moreInfo = false;

				printGUI(deviceNavigator,moreInfo);
				break;
			case "3":
				//first device
				deviceNavigator.getFirstDevice();
				moreInfo = false;
				
				printGUI(deviceNavigator,moreInfo);
				break;
			case "4":
				//last device
				deviceNavigator.getLastDevice();
				moreInfo = false;
				
				printGUI(deviceNavigator,moreInfo);
				break;
				
			//case 5 sets the more info boolean to true and prints the GUI again so the user can continue to use the program
			case "5":
				//device info
				moreInfo = true;

				printGUI(deviceNavigator,moreInfo);
				break;
				
			//case 6 runs the caseHelp method. It switches to the more help GUI. When the more help GUI is exited the regular GUI will get printed
			case "6":
				//display help
				caseHelp();

				printGUI(deviceNavigator,moreInfo);
				break;
				
			//case 7 exits the application
			case "7":
				System.out.println("Exiting application...");
				k.close();
				System.exit(0);
				break;
				
			//default case will print the GUI and give a message to the user that the input was invalid.
			default:
				printGUI(deviceNavigator,moreInfo);
				System.out.println("Invalid Input, Check Menu Options");
			}
		}
	}

	//method to show GUI. 
	private static void printGUI(DeviceNavigator nav, boolean moreInfo) {
		getSpace();
		displayOptions();
		displayCurrentDeviceInfo(nav,moreInfo);
	}
	
	//method to get more pace in the console.
	//works by printing 50 white lines on the console.
	//this is a work around the fact that the console cannot be cleared
	private static void getSpace() {
		//for (int i = 0; i < 50; ++i) System.out.println();
		
		//on the cmd this code should run and clear the console
		//using this code instead
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			System.out.println("Failed to clear console");
		}
	}

	//method to print the device info to the console. 
	//if more info is true, the manufacturer and device code will print in the console
	private static void displayCurrentDeviceInfo(DeviceNavigator nav, boolean moreInfo) {
			System.out.println("----------------------------------------------------");
			System.out.println("|");
			System.out.println("|\t\tDevice Information");
			System.out.println("|");
			int currentDeviceNumber = nav.getDeviceIndex() + 1;
			int totalDevices = nav.getDeviceCount();
			System.out.println("|\t\t----------");
			System.out.println("|\t\t" + currentDeviceNumber + " of " + totalDevices);
			System.out.println("|\t\t----------");
			System.out.println("|");
			System.out.println("| Name: \t" + nav.getCurrentDevice().getName());
			System.out.println("| Price: \t€" + nav.getCurrentDevice().getPrice());
			System.out.println("|");

			if (moreInfo) {
				System.out.println("| Manufacturer:\t" + nav.getCurrentDevice().getManufacturer());
				System.out.println("| Code:\t\t" + nav.getCurrentDevice().getCode());
				System.out.println("|");
			}
			
			System.out.println("----------------------------------------------------");
	}

	//prints to the console the options that shows the user what all the input does
	private static void displayOptions() {
		System.out.println("\t\tDevice Info System" 
				+ "\n" 
				+ "\n----------------------------------------------------"
				+ "\n|\t\tMenu options" 
				+ "\n|" 
				+ "\n|\t\t1 = Previous device" 
				+ "\n|\t\t2 = Next device"
				+ "\n|\t\t3 = First device" 
				+ "\n|\t\t4 = Last device" 
				+ "\n|\t\t5 = More info" 
				+ "\n|\t\t6 = Help" 
				+ "\n|"
				+ "\n|\t\t7 = Exit" 
				+ "\n----------------------------------------------------" 
				+ "\n\n -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n");
	}
	
	//method to display the help text to the console
	private static void displayHelp() {
		getSpace();
		System.out.println(" ----------------------------------------------------" + "\n|" 
				+ "\n| -- Help --" 
				+ "\n|"
				+ "\n| Device Information system displays basic" 
				+ "\n| and full information about devices." 
				+ "\n|"
				+ "\n| Browsing devices:" + "\n|" 
				+ "\n| Option 1&2 from the menu: Moves backwards"
				+ "\n| and forwards through the device list." 
				+ "\n|"
				+ "\n| Option 3&4 from the menu: Jumps straight to" 
				+ "\n| the first/last device in the device list."
				+ "\n|" 
				+ "\n| Show more information:" 
				+ "\n|" 
				+ "\n|  Option 5 prints more details and specs"
				+ "\n|  for the currently viewed device." 
				+ "\n|"
				+ "\n ----------------------------------------------------" 
				+ "\n|" 
				+ "\n|  Choose 1 - Back to main menu"
				+ "\n|  Choose 7 - Exit" 
				+ "\n|" 
				+ "\n ----------------------------------------------------");
	}

	//case switch that is triggered once he user requests it.
	private static void caseHelp() {
		
		//display the help text
		displayHelp();
		boolean validChoice = false;
		
		//Switch case will run while until the user exits to the main GUI
		while (!validChoice) {
			System.out.println("Choose an option");
			String choice2 = k.nextLine();
			switch (choice2) {
			//case 1 will return the user to the main menu
			//by setting valid choice to true, the loop will stop and the caseHelp method will finish.
			//then the case switch in the main method can continue.
			case "1":
				validChoice = true;
				break;
			
			//case 7 will exit the application entirely
			case "7":
				System.out.println("Exiting application...");
				k.close();
				System.exit(0);
				break;
				
			//if the user inputs an invalid input, the help menu will print again and the user
			//will be informed that the input was invalid
			default:
				displayHelp();
				System.out.println("Invalid Input, Check Menu Options");
			}
		}
	}

	//scanned to get the user input
	private static Scanner k = new Scanner(System.in);
}
