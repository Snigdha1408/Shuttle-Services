
package SalukiExpressRoute;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BusRouteClass implements BusRoute{
	static int initialdestination = 0;	
	static int finaldestination = 0;
	static int difference = 0;
	static int difference2 = 0;
	static int difference3 = 0;
	static int difference4 = 0;
	static String initialdestinationstring = null;
	static String finaldestinationstring = null;
	
public static void main(String[] args) {
	// Adjacencymatrix shows relation between the stops if route exits or not
	//int [][] am = {{0,1,1,1,1}, {0,0,1,1,1}, {0,0,0,1,1}, {0,0,0,0,1},{0,0,0,0,0}};
	

	int [][] east = {{1, 00, 20,55}, {2, 01,21,56}, {3, 3,23,57}, {4, 05,25,49},{5, 07,27,60}};
	int [][] west= {{1, 01, 15, 52}, {2, 02, 16, 53}, {3, 03,20,55}, {4, 04,22,57}, {5, 05, 25, 60}};	
	int [][] mall = {{1, 02, 25, 51}, {2, 05, 28, 54}, {3, 8,31,57}, {4, 11,34,58}, {5, 14, 34, 60}};	
	int [][] crosstown = {{1, 03, 25, 50}, {2, 05, 28, 53}, {3, 8,31,55}, {4, 11,34,56}, {5, 14, 34, 59}};	
	
	Date obj1 = new Date();
	SimpleDateFormat dt = new SimpleDateFormat("mm"); 
	SimpleDateFormat dt1 = new SimpleDateFormat("ss"); 
	int minute = Integer.parseInt(dt.format(obj1));
	String second = dt1.format(obj1);
	
	
	BusRouteClass obj2 = new BusRouteClass();
	obj2.initialdestination();
	obj2.finaldestination();
	
	
	if (initialdestinationstring.equals("Studentcenter")){
		initialdestination = 1;
	}
	if (initialdestinationstring.equals("Engineeringbuilding")){
		initialdestination = 2;
	}
	if (initialdestinationstring.equals("Poplarstreet")){
		initialdestination = 3;
	}
	if (initialdestinationstring.equals("Washingtonstreet")){
		initialdestination = 4;
	}
	if (initialdestinationstring.equals("Loganpark")){
		initialdestination = 5;
	}
if (finaldestinationstring.equals("Studentcenter")){
	finaldestination = 1;	
	}
	if (finaldestinationstring.equals("Engineeringbuilding")){
		finaldestination = 2;
	}
	if (finaldestinationstring.equals("Poplarstreet")){
		finaldestination = 3;
	}
	if (finaldestinationstring.equals("Washingtonstreet")){
		finaldestination = 4;
	}
	if (finaldestinationstring.equals("Loganpark")){
		finaldestination = 5;
	}
	
	System.out.println(initialdestination);
	System.out.println(finaldestination);
	
	//if(am[initialdestination][finaldestination]==1){
	
	if(initialdestinationstring.equals("Loganpark")&& finaldestinationstring.equals("Washingtonstreet"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Loganpark")&& finaldestinationstring.equals("Poplarstreet"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Loganpark")&& finaldestinationstring.equals("Studentcenter"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Loganpark")&& finaldestinationstring.equals("Engineeringbuilding"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Washingtonstreet")&& finaldestinationstring.equals("Studentcenter"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Washingtonstreet")&& finaldestinationstring.equals("Poplarstreet"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Washingtonstreet")&& finaldestinationstring.equals("Engineeringbuilding"))
	{
		System.out.println("route doesn't exists");
	}
	
	if(initialdestinationstring.equals("Poplarstreet")&& finaldestinationstring.equals("Engineeringbuilding"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Poplarstreet")&& finaldestinationstring.equals("Studentcenter"))
	{
		System.out.println("route doesn't exists");
	}
	if(initialdestinationstring.equals("Engineeringbuilding")&& finaldestinationstring.equals("Studentcenter"))
	{
		System.out.println("route doesn't exists");
	}
	
	
	
	
	
	
	
//	for (int row=0; row <= 4; row++){
//		for(int col=0; col <= 3; col++){
		//	System.out.println("row " + " " + row + "," + " " + "col" + col + " " + BusRoute1[row][col]);
			if ((initialdestination == east[0][0]) && (finaldestination ==east[1][0])){
			if (minute <= east[0][1]){
				difference = east[0][1] - minute;
				difference = difference + (east[1][1] - east[0][1]);	
				System.out.println("Overall time for east " + difference+"   "+ "minutues");
			}
			if ((minute > east[0][1]) && (minute <= east[0][2])){
				difference = east[0][2] - minute;
				difference = difference + (east[1][2] - east[0][2]);	
				System.out.println("Overall time for east " + difference+"   "+ "minutues");
	
			}
			if ((minute > east[0][2]) && (minute <= east[0][3])){
				difference = east[0][3] - minute;
				difference = difference + (east[1][3] - east[0][3]);	
				System.out.println("Overall time for east " + difference+ "   "+"minutues");
	
			}
			
			}
					
			if ((initialdestination == east[0][0]) && (finaldestination == east[2][0])){
				if (minute <= east[0][1]){
					difference = east[0][1] - minute;
					difference = difference + (east[2][1] - east[0][1]);	
					System.out.println("Overall time for east " + difference+ "   "+"minutues");
				}
				if ((minute > east[0][1]) && (minute <= east[0][2])){
					difference = east[0][2] - minute;
					difference = difference + (east[2][2] - east[0][2]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}
				if ((minute > east[0][2]) && (minute <= east[0][3])){
					difference = east[0][3] - minute;
					difference = difference + (east[2][3] - east[0][3]);	
					System.out.println("Overall time for east " + difference+ "   "+"minutues");
		
				}
	
			}
			
			

			if ((initialdestination == east[0][0]) && (finaldestination == east[3][0])){
				if (minute <= east[0][1]){
					difference = east[0][1] - minute;
					difference = difference + (east[3][1] - east[0][1]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
				}
				if ((minute > east[0][1]) && (minute <= east[0][2])){
					difference = east[0][2] - minute;
					difference = difference + (east[3][2] - east[0][2]);	
					System.out.println("Overall time for east" + difference+"   "+ "minutues");
		
				}
				if ((minute > east[0][2]) && (minute <= east[0][3])){
					difference = east[0][3] - minute;
					difference = difference + (east[3][3] - east[0][3]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}

			}

			
			
			if ((initialdestination == east[0][0]) && (finaldestination == east[4][0])){
				if (minute <= east[0][1]){
					difference = east[0][1] - minute;
					difference = difference + (east[4][1] - east[0][1]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
				}
				if ((minute > east[0][1]) && (minute <= east[0][2])){
					difference = east[0][2] - minute;
					difference = difference + (east[4][2] - east[0][2]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}
				if ((minute > east[0][2]) && (minute <= east[0][3])){
					difference = east[0][3] - minute;
					difference = difference + (east[4][3] - east[0][3]);	
					System.out.println("Overall time for east " + difference+ "   "+"minutues");
		
				}

				
			}

			
			
			if ((initialdestination == east[1][0]) && (finaldestination == east[2][0])){
				if (minute <= east[1][1]){
					difference = east[1][1] - minute;
					difference = difference + (east[2][1] - east[1][1]);	
					System.out.println("Overall time for east" + difference+ "   "+"minutues");
				}
				if ((minute > east[1][1]) && (minute <= east[1][2])){
					difference = east[1][2] - minute;
					difference = difference + (east[2][2] - east[1][2]);	
					System.out.println("Overall time for east" + difference+ "   "+"minutues");
		
				}
				if ((minute > east[1][2]) && (minute <= east[1][3])){
					difference = east[1][3] - minute;
					difference = difference + (east[2][3] - east[1][3]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}	
			}
						
			if ((initialdestination == east[1][0]) && (finaldestination == east[3][0])){
				if (minute <= east[1][1]){
					difference = east[1][1] - minute;
					difference = difference + (east[3][1] - east[1][1]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
				}
				if ((minute > east[1][1]) && (minute <= east[1][2])){
					difference = east[1][2] - minute;
					difference = difference + (east[3][2] - east[1][2]);	
					System.out.println("Overall time for east " + difference+ "   "+"minutues");
		
				}
				if ((minute > east[1][2]) && (minute <= east[1][3])){
					difference = east[1][3] - minute;
					difference = difference + (east[3][3] - east[1][3]);	
					System.out.println("Overall time for east " + difference+ "   "+"minutues");
		
				}	

			}

			if ((initialdestination == east[1][0]) && (finaldestination == east[4][0])){
				if (minute <= east[1][1]){
					difference = east[1][1] - minute;
					difference = difference + (east[4][1] - east[1][1]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
				}
				if ((minute > east[1][1]) && (minute <= east[1][2])){
					difference = east[1][2] - minute;
					difference = difference + (east[4][2] - east[1][2]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}
				if ((minute > east[1][2]) && (minute <= east[1][3])){
					difference = east[1][3] - minute;
					difference = difference + (east[4][3] - east[1][3]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}	
			}
			
			
			
			if ((initialdestination == east[2][0]) && (finaldestination == east[3][0])){
				if (minute <= east[2][1]){
					difference = east[1][1] - minute;
					difference = difference + (east[3][1] - east[2][1]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
				}
				if ((minute > east[2][1]) && (minute <= east[2][2])){
					difference = east[1][2] - minute;
					difference = difference + (east[3][2] - east[2][2]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}
				if ((minute > east[2][2]) && (minute <= east[2][3])){
					difference = east[1][3] - minute;
					difference = difference + (east[3][3] - east[2][3]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}		
			}
						
			if ((initialdestination == east[2][0]) && (finaldestination == east[4][0])){
				if (minute <= east[2][1]){
					difference = east[1][1] - minute;
					difference = difference + (east[4][1] - east[2][1]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
				}
				if ((minute > east[2][1]) && (minute <= east[2][2])){
					difference = east[1][2] - minute;
					difference = difference + (east[4][2] - east[2][2]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}
				if ((minute > east[2][2]) && (minute <= east[2][3])){
					difference = east[1][3] - minute;
					difference = difference + (east[4][3] - east[2][3]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}		

			}

			if ((initialdestination == east[3][0]) && (finaldestination == east[4][0])){
				if (minute <= east[3][1]){
					difference = east[1][1] - minute;
					difference = difference + (east[4][1] - east[3][1]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
				}
				if ((minute > east[3][1]) && (minute <= east[3][2])){
					difference = east[1][2] - minute;
					difference = difference + (east[4][2] - east[3][2]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}
				if ((minute > east[3][2]) && (minute <= east[3][3])){
					difference = east[1][3] - minute;
					difference = difference + (east[4][3] - east[3][3]);	
					System.out.println("Overall time for east " + difference+"   "+ "minutues");
		
				}		

			}
			
			// Bus Route 2
			if ((initialdestination == west[0][0]) && (finaldestination == west[1][0])){
				if (minute <= west[0][1]){
					difference2 = west[0][1] - minute;
					difference2 = difference2 + (west[1][1] - west[0][1]);	
					System.out.println("Overall time for west" + difference2+"   "+ "minutues");
				}
				if ((minute > west[0][1]) && (minute <= west[0][2])){
					difference2 = west[0][2] - minute;
					difference2 = difference2 + (west[1][2] - west[0][2]);	
					System.out.println("Overall time for west " + difference2+"   "+ "minutues");
		
				}
				if ((minute > west[0][2]) && (minute <= west[0][3])){
					difference2 = west[0][3] - minute;
					difference2 = difference2 + (west[1][3] - west[0][3]);	
					System.out.println("Overall time for west " + difference2+ "   "+"minutues");
		
				}
				
				}
				
				
			
							
				if ((initialdestination == west[0][0]) && (finaldestination == west[2][0])){
					if (minute <= west[0][1]){
						difference2 = west[0][1] - minute;
						difference2 = difference2 + (west[2][1] - west[0][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[0][1]) && (minute <= west[0][2])){
						difference2 = west[0][2] - minute;
						difference2 = difference2 + (west[2][2] - west[0][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[0][2]) && (minute <= west[0][3])){
						difference2 = west[0][3] - minute;
						difference2 = difference2 + (west[2][3] - west[0][3]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
		
				}
				
				
				
				
				

				if ((initialdestination == west[0][0]) && (finaldestination == west[3][0])){
					if (minute <= west[0][1]){
						difference2 = west[0][1] - minute;
						difference2 = difference2 + (west[3][1] - west[0][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[0][1]) && (minute <= west[0][2])){
						difference2 = west[0][2] - minute;
						difference2 = difference2 + (west[3][2] - west[0][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[0][2]) && (minute <= west[0][3])){
						difference2 = west[0][3] - minute;
						difference2 = difference2 + (west[3][3] - west[0][3]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}

				}

				
				
				
				if ((initialdestination == west[0][0]) && (finaldestination == west[4][0])){
					if (minute <= west[0][1]){
						difference2 = west[0][1] - minute;
						difference2 = difference2 + (west[4][1] - west[0][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[0][1]) && (minute <= west[0][2])){
						difference2 = west[0][2] - minute;
						difference2 = difference2 + (west[4][2] - west[0][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[0][2]) && (minute <= west[0][3])){
						difference2 = west[0][3] - minute;
						difference2 = difference2 + (west[4][3] - west[0][3]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}

					
				}

				
				
				
				
				
				
				if ((initialdestination == west[1][0]) && (finaldestination == west[2][0])){
					if (minute <= west[1][1]){
						difference2 = west[1][1] - minute;
						difference2 = difference2 + (west[2][1] - west[1][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[1][1]) && (minute <= west[1][2])){
						difference2 = west[1][2] - minute;
						difference2 = difference2 + (west[2][2] - west[1][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[1][2]) && (minute <= west[1][3])){
						difference2 = west[1][3] - minute;
						difference2 = difference2 + (west[2][3] - west[1][3]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}	
				}
							
				if ((initialdestination == west[1][0]) && (finaldestination == west[3][0])){
					if (minute <= west[1][1]){
						difference2 = west[1][1] - minute;
						difference2 = difference2 + (west[3][1] - west[1][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[1][1]) && (minute <= west[1][2])){
						difference2 = west[1][2] - minute;
						difference2 = difference2 + (west[3][2] - west[1][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[1][2]) && (minute <= west[1][3])){
						difference2 = west[1][3] - minute;
						difference2 = difference2 + (west[3][3] - west[1][3]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}	

				}

				if ((initialdestination == west[1][0]) && (finaldestination == west[4][0])){
					if (minute <= west[1][1]){
						difference2 = west[1][1] - minute;
						difference2 = difference2 + (west[4][1] - west[1][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[1][1]) && (minute <= west[1][2])){
						difference2 = west[1][2] - minute;
						difference2 = difference2 + (west[4][2] - west[1][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[1][2]) && (minute <= west[1][3])){
						difference2 = west[1][3] - minute;
						difference2 = difference2 + (west[4][3] - west[1][3]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}	
				}
				
				
				
				
				
				if ((initialdestination == west[2][0]) && (finaldestination == west[3][0])){
					if (minute <= west[2][1]){
						difference2 = west[1][1] - minute;
						difference2 = difference2 + (west[3][1] - west[2][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[2][1]) && (minute <= west[2][2])){
						difference2 = west[1][2] - minute;
						difference2 = difference2 + (west[3][2] - west[2][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[2][2]) && (minute <= west[2][3])){
						difference2 = west[1][3] - minute;
						difference2 = difference2 + (west[3][3] - west[2][3]);	
						System.out.println("Overall time for west" + difference2+"   "+"minutues");
			
					}		
				}
							
				if ((initialdestination == west[2][0]) && (finaldestination == west[4][0])){
					if (minute <= west[2][1]){
						difference2 = west[1][1] - minute;
						difference2 = difference2 + (west[4][1] - west[2][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[2][1]) && (minute <= west[2][2])){
						difference2 = west[1][2] - minute;
						difference2 = difference2 + (west[4][2] - west[2][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[2][2]) && (minute <= west[2][3])){
						difference2 = west[1][3] - minute;
						difference2 = difference2 + (west[4][3] - west[2][3]);	
						System.out.println("Overall time for west" + difference2+"   "+"minutues");
			
					}		

				}

				if ((initialdestination == west[3][0]) && (finaldestination == west[4][0])){
					if (minute <= west[3][1]){
						difference2 = west[1][1] - minute;
						difference2 = difference2 + (west[4][1] - west[3][1]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
					}
					if ((minute > west[3][1]) && (minute <= west[3][2])){
						difference2 = west[1][2] - minute;
						difference2 = difference2 + (west[4][2] - west[3][2]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}
					if ((minute > west[3][2]) && (minute <= west[3][3])){
						difference2 = west[1][3] - minute;
						difference2 = difference2 + (west[4][3] - west[3][3]);	
						System.out.println("Overall time for west " + difference2+"   "+"minutues");
			
					}		

				}


			//Bus Route 3
				if ((initialdestination == mall[0][0]) && (finaldestination == mall[1][0])){
					if (minute <= mall[0][1]){
						difference3 = mall[0][1] - minute;
						difference3 = difference3 + (mall[1][1] - mall[0][1]);	
						System.out.println("Overall time for mall " + difference3+"   "+"minutues");
					}
					if ((minute > mall[0][1]) && (minute <= mall[0][2])){
						difference3 = mall[0][2] - minute;
						difference3 = difference3 + (mall[1][2] - mall[0][2]);	
						System.out.println("Overall time for mall " + difference3+"   "+"minutues");
			
					}
					if ((minute > mall[0][2]) && (minute <= mall[0][3])){
						difference3 = mall[0][3] - minute;
						difference3 = difference3 + (mall[1][3] - mall[0][3]);	
						System.out.println("Overall time for mall " + difference3+"   "+"minutues");
			
					}
					
					}
					
					
					
							
					if ((initialdestination == mall[0][0]) && (finaldestination == mall[2][0])){
						if (minute <= mall[0][1]){
							difference3 = mall[0][1] - minute;
							difference3 = difference3 + (mall[2][1] - mall[0][1]);	
							System.out.println("Overall time for mall" + difference3+"   "+"minutues");
						}
						if ((minute > mall[0][1]) && (minute <= mall[0][2])){
							difference3 = mall[0][2] - minute;
							difference3 = difference3 + (mall[2][2] - mall[0][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[0][2]) && (minute <= mall[0][3])){
							difference3 = mall[0][3] - minute;
							difference3 = difference3 + (mall[2][3] - mall[0][3]);	
							System.out.println("Overall time for mall" + difference3+"   "+"minutues");
				
						}
						
					}
					
					
					

					if ((initialdestination == mall[0][0]) && (finaldestination == mall[3][0])){
						if (minute <= mall[0][1]){
							difference3 = mall[0][1] - minute;
							difference3 = difference3 + (mall[3][1] - mall[0][1]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
						}
						if ((minute > mall[0][1]) && (minute <= mall[0][2])){
							difference3 = mall[0][2] - minute;
							difference3 = difference3 + (mall[3][2] - mall[0][2]);	
							System.out.println("Overall time for mall" + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[0][2]) && (minute <= mall[0][3])){
							difference3 = mall[0][3] - minute;
							difference3 = difference3 + (mall[3][3] - mall[0][3]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}

					}

						
					if ((initialdestination == mall[0][0]) && (finaldestination == mall[4][0])){
						if (minute <= mall[0][1]){
							difference3 = mall[0][1] - minute;
							difference3 = difference3 + (mall[4][1] - mall[0][1]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
						}
						if ((minute > mall[0][1]) && (minute <= mall[0][2])){
							difference3 = mall[0][2] - minute;
							difference3 = difference3 + (mall[4][2] - mall[0][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[0][2]) && (minute <= mall[0][3])){
							difference3 = mall[0][3] - minute;
							difference3 = difference3 + (mall[4][3] - mall[0][3]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}

						
					}

					
					
					if ((initialdestination == mall[1][0]) && (finaldestination == mall[2][0])){
						if (minute <= mall[1][1]){
							difference3 = mall[1][1] - minute;
							difference3 = difference3 + (mall[2][1] - mall[1][1]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
						}
						if ((minute > mall[1][1]) && (minute <= mall[1][2])){
							difference3 = mall[1][2] - minute;
							difference3 = difference3 + (mall[2][2] - mall[1][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[1][2]) && (minute <= mall[1][3])){
							difference3 = mall[1][3] - minute;
							difference3 = difference3 + (mall[2][3] - mall[1][3]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}	
					}
								
					if ((initialdestination == mall[1][0]) && (finaldestination == mall[3][0])){
						if (minute <= mall[1][1]){
							difference3 = mall[1][1] - minute;
							difference3 = difference3 + (mall[3][1] - mall[1][1]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
						}
						if ((minute > mall[1][1]) && (minute <= mall[1][2])){
							difference3 = mall[1][2] - minute;
							difference3 = difference3 + (mall[3][2] - mall[1][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[1][2]) && (minute <= mall[1][3])){
							difference3 = mall[1][3] - minute;
							difference3 = difference3 + (mall[3][3] - mall[1][3]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}	

					}

					if ((initialdestination == mall[1][0]) && (finaldestination == mall[4][0])){
						if (minute <= mall[1][1]){
							difference3 = mall[1][1] - minute;
							difference3 = difference3 + (mall[4][1] - mall[1][1]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
						}
						if ((minute > mall[1][1]) && (minute <= mall[1][2])){
							difference3 = mall[1][2] - minute;
							difference3 = difference3 + (mall[4][2] - mall[1][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[1][2]) && (minute <= mall[1][3])){
							difference3 = mall[1][3] - minute;
							difference3 = difference3 + (mall[4][3] - mall[1][3]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}	
					}
					
					
					
					
					if ((initialdestination == mall[2][0]) && (finaldestination == mall[3][0])){
						if (minute <= mall[2][1]){
							difference3 = mall[1][1] - minute;
							difference3 = difference3 + (mall[3][1] - mall[2][1]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
						}
						if ((minute > mall[2][1]) && (minute <= mall[2][2])){
							difference3 = mall[1][2] - minute;
							difference3 = difference3 + (mall[3][2] - mall[2][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[2][2]) && (minute <= mall[2][3])){
							difference3 = mall[1][3] - minute;
							difference3 = difference3 + (mall[3][3] - mall[2][3]);	
							System.out.println("Overall time for mall" + difference3+"   "+"minutues");
				
						}		
					}
								
					if ((initialdestination == mall[2][0]) && (finaldestination == mall[4][0])){
						if (minute <= mall[2][1]){
							difference3 = mall[1][1] - minute;
							difference3 = difference3 + (mall[4][1] - mall[2][1]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
						}
						if ((minute > mall[2][1]) && (minute <= mall[2][2])){
							difference3 = mall[1][2] - minute;
							difference3 = difference3 + (mall[4][2] - mall[2][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[2][2]) && (minute <= mall[2][3])){
							difference3 = mall[1][3] - minute;
							difference3 = difference3 + (mall[4][3] - mall[2][3]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}		

					}

					if ((initialdestination == mall[3][0]) && (finaldestination == mall[4][0])){
						if (minute <= mall[3][1]){
							difference3 = mall[1][1] - minute;
							difference3 = difference3 + (mall[4][1] - mall[3][1]);	
							System.out.println("Overall time for mall" + difference3+"   "+"minutues");
						}
						if ((minute > mall[3][1]) && (minute <= mall[3][2])){
							difference3 = mall[1][2] - minute;
							difference3 = difference3 + (mall[4][2] - mall[3][2]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}
						if ((minute > mall[3][2]) && (minute <= mall[3][3])){
							difference3 = mall[1][3] - minute;
							difference3 = difference3 + (mall[4][3] - mall[3][3]);	
							System.out.println("Overall time for mall " + difference3+"   "+"minutues");
				
						}		

					}



			//Bus Route 4
					if ((initialdestination == crosstown[0][0]) && (finaldestination == crosstown[1][0])){
						if (minute <= crosstown[0][1]){
							difference4 = crosstown[0][1] - minute;
							difference4 = difference4 + (crosstown[1][1] - crosstown[0][1]);	
							System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
						}
						if ((minute > crosstown[0][1]) && (minute <= crosstown[0][2])){
							difference4 = crosstown[0][2] - minute;
							difference4 = difference4 + (crosstown[1][2] - crosstown[0][2]);	
							System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
				
						}
						if ((minute > crosstown[0][2]) && (minute <= crosstown[0][3])){
							difference4 = crosstown[0][3] - minute;
							difference4 = difference4 + (crosstown[1][3] - crosstown[0][3]);	
							System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
				
						}
						
						}
						
						
						
									
						if ((initialdestination == crosstown[0][0]) && (finaldestination == crosstown[2][0])){
							if (minute <= crosstown[0][1]){
								difference4 = crosstown[0][1] - minute;
								difference4 = difference4 + (crosstown[2][1] - crosstown[0][1]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[0][1]) && (minute <= crosstown[0][2])){
								difference4 = crosstown[0][2] - minute;
								difference4 = difference4 + (crosstown[2][2] - crosstown[0][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[0][2]) && (minute <= crosstown[0][3])){
								difference4 = crosstown[0][3] - minute;
								difference4 = difference4 + (crosstown[2][3] - crosstown[0][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
				
						}
						
						
						
						
						

						if ((initialdestination == crosstown[0][0]) && (finaldestination == crosstown[3][0])){
							if (minute <= crosstown[0][1]){
								difference4 = crosstown[0][1] - minute;
								difference4 = difference4 + (crosstown[3][1] - crosstown[0][1]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[0][1]) && (minute <= crosstown[0][2])){
								difference4 = crosstown[0][2] - minute;
								difference4 = difference4 + (crosstown[3][2] - crosstown[0][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[0][2]) && (minute <= crosstown[0][3])){
								difference4 = crosstown[0][3] - minute;
								difference4 = difference4 + (crosstown[3][3] - crosstown[0][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}

						}

						
						if ((initialdestination == crosstown[0][0]) && (finaldestination == crosstown[4][0])){
							if (minute <= crosstown[0][1]){
								difference4 = crosstown[0][1] - minute;
								difference4 = difference4 + (crosstown[4][1] - crosstown[0][1]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[0][1]) && (minute <= crosstown[0][2])){
								difference4 = crosstown[0][2] - minute;
								difference4 = difference4 + (crosstown[4][2] - crosstown[0][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[0][2]) && (minute <= crosstown[0][3])){
								difference4 = crosstown[0][3] - minute;
								difference4 = difference4 + (crosstown[4][3] - crosstown[0][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}

							
						}

						
						
						
						if ((initialdestination == crosstown[1][0]) && (finaldestination == crosstown[2][0])){
							if (minute <= crosstown[1][1]){
								difference4 = crosstown[1][1] - minute;
								difference4 = difference4 + (crosstown[2][1] - crosstown[1][1]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[1][1]) && (minute <= crosstown[1][2])){
								difference4 = crosstown[1][2] - minute;
								difference4 = difference4 + (crosstown[2][2] - crosstown[1][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[1][2]) && (minute <= crosstown[1][3])){
								difference4 = crosstown[1][3] - minute;
								difference4 = difference4 + (crosstown[2][3] - crosstown[1][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}	
						}
									
						if ((initialdestination == crosstown[1][0]) && (finaldestination == crosstown[3][0])){
							if (minute <= crosstown[1][1]){
								difference4 = crosstown[1][1] - minute;
								difference4 = difference4 + (crosstown[3][1] - crosstown[1][1]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[1][1]) && (minute <= crosstown[1][2])){
								difference4 = crosstown[1][2] - minute;
								difference4 = difference4 + (crosstown[3][2] - crosstown[1][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[1][2]) && (minute <= crosstown[1][3])){
								difference4 = crosstown[1][3] - minute;
								difference4 = difference4 + (crosstown[3][3] - crosstown[1][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}	

						}

						if ((initialdestination == crosstown[1][0]) && (finaldestination == crosstown[4][0])){
							if (minute <= crosstown[1][1]){
								difference4 = crosstown[1][1] - minute;
								difference4 = difference4 + (crosstown[4][1] - crosstown[1][1]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[1][1]) && (minute <= crosstown[1][2])){
								difference4 = crosstown[1][2] - minute;
								difference4 = difference4 + (crosstown[4][2] - crosstown[1][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[1][2]) && (minute <= crosstown[1][3])){
								difference4 = crosstown[1][3] - minute;
								difference4 = difference4 + (crosstown[4][3] - crosstown[1][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}	
						}
						
						
						
						
						
						if ((initialdestination == crosstown[2][0]) && (finaldestination == crosstown[3][0])){
							if (minute <= crosstown[2][1]){
								difference4 = crosstown[1][1] - minute;
								difference4 = difference4 + (crosstown[3][1] - crosstown[2][1]);	
								System.out.println("Overall time for crosstown" + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[2][1]) && (minute <= crosstown[2][2])){
								difference4 = crosstown[1][2] - minute;
								difference4 = difference4 + (crosstown[3][2] - crosstown[2][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[2][2]) && (minute <= crosstown[2][3])){
								difference4 = crosstown[1][3] - minute;
								difference4 = difference4 + (crosstown[3][3] - crosstown[2][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}		
						}
									
						if ((initialdestination == crosstown[2][0]) && (finaldestination == crosstown[4][0])){
							if (minute <= crosstown[2][1]){
								difference4 = crosstown[1][1] - minute;
								difference4 = difference4 + (crosstown[4][1] - crosstown[2][1]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[2][1]) && (minute <= crosstown[2][2])){
								difference4 = crosstown[1][2] - minute;
								difference4 = difference4 + (crosstown[4][2] - crosstown[2][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[2][2]) && (minute <= crosstown[2][3])){
								difference4 = crosstown[1][3] - minute;
								difference4 = difference4 + (crosstown[4][3] - crosstown[2][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}		

						}

						if ((initialdestination == crosstown[3][0]) && (finaldestination == crosstown[4][0])){
							if (minute <= crosstown[3][1]){
								difference4 = crosstown[1][1] - minute;
								difference4 = difference4 + (crosstown[4][1] - crosstown[3][1]);	
								System.out.println("Overall time for crosstown" + difference4+"   "+"minutues");
							}
							if ((minute > crosstown[3][1]) && (minute <= crosstown[3][2])){
								difference4 = crosstown[1][2] - minute;
								difference4 = difference4 + (crosstown[4][2] - crosstown[3][2]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}
							if ((minute > crosstown[3][2]) && (minute <= crosstown[3][3])){
								difference4 = crosstown[1][3] - minute;
								difference4 = difference4 + (crosstown[4][3] - crosstown[3][3]);	
								System.out.println("Overall time for crosstown " + difference4+"   "+"minutues");
					
							}		

						}


if ((difference <difference2) && (difference <difference3) && (difference < difference4)){
	System.out.println("Best Bus now is east");
}
			
if ((difference2 < difference) && (difference2 < difference3) && (difference2 < difference4)){
	System.out.println("Best Bus now is west");
}
if ((difference3 < difference) && (difference3 < difference2) && (difference3 < difference4)){
	System.out.println("Best Bus now is south");
}
if ((difference4 < difference) && (difference4 < difference2) && (difference4 < difference3)){
	System.out.println(" Best Bus now is crosstown");
}
			
		}

//}

		//		}
	
//}

public String initialdestination(){
	
	Scanner inital = new Scanner(System.in);
	System.out.println("Enter Initial Destination");
	initialdestinationstring = inital.next();
	return initialdestinationstring;
}


public String finaldestination(){
	Scanner final1 = new Scanner(System.in);
	System.out.println("Enter final destination");
	finaldestinationstring = final1.next();
	return finaldestinationstring;
}

}
