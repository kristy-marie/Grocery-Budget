import java.util.Scanner; // import scanner
public class GroceryCostTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in); // CREATE SCANNER OBJECT FROM THE CLASS SCANNER
				
				GroceryCost groceries = new GroceryCost(); // CREATE GROCERIES OBJECT FOR GROCERYCOST CLASS
				
				// DETERMINE THE USERS WEEKLY BUDGET AND HOW MUCH THEY SPEND PER WEEK 
				System.out.println("What is your weekly budget on groceries?");
				double weekBudget = in.nextDouble();
				System.out.println("Please enter the average amount of money spent on groceries per week:");
				double gPerWeek = in.nextDouble();
				
				// SET VARAIBLES
				groceries.setUserBudget(weekBudget);
				groceries.setCostPerWeek(gPerWeek);
				
				
				// CREATE AN IF STATEMENT TO DETERMINE IF THE USER IS OVER, UNDER OR MEETS THEIR WEEKLY BUDGET.
				if (gPerWeek > weekBudget) {
					System.out.printf("Your weekly budget is $%.2f, and the amount you spend per week is $%.2f. You are over budget by $%.2f.\n", groceries.getUserBudget(), groceries.getCostPerWeek(), groceries.getUserBudget() - groceries.getCostPerWeek());
					System.out.println();
				}
				else {
					if (gPerWeek == weekBudget) 
						System.out.printf("Your budget per week is $%.2f and your cost of groceries per week is $%.2f. You are at your budget.\n", groceries.getUserBudget(), groceries.getCostPerWeek());
					System.out.println();
					
				} 
				
				{
				
				if (gPerWeek < weekBudget)
				
					System.out.printf("You are under budget and have $%.2f left over at the end of the week.\n", groceries.getUserBudget() - groceries.getCostPerWeek()); 
				System.out.println();
				} // END IF STATEMENT
				
				
				// GET HOW MUCH THE USER WANTS TO SPEND PER MONTH AND DETERMINE HOW MUCH THEY ACTUALLY SPEND PER MONTH ON GROCERIES
				double perMonth = gPerWeek * 4; // CALCULATION FOR HOW MUCH THE USER SPENDS PER MONTH ON GROCERIES
				System.out.println("What is your monthly budget to spend on groceries?");
				double cPerMonth = in.nextDouble();
				System.out.printf("You spend $%.2f on grocereies per month.\n", perMonth);
				System.out.println();
				
				// SET VARAIBLES
				groceries.setCostPerMonth(cPerMonth);
				groceries.setTotalCostPerMonth(perMonth);
				
				// CREATE IF STATEMENTS TO DETERMINE WHETHER OR NOT A USER MEETS, EXCEED, OR IS UNDER THEIR MONTHLY GROCERY BUDGET
				if (perMonth < cPerMonth) {
					System.out.printf("You are under your monthly budget by $%.2f", groceries.getCostPerMonth() - groceries.getTotalCostPerMonth());
					System.out.println();
				}
				else {
					if (perMonth == cPerMonth) {
						System.out.println("You spend your exact budget on groceries.");
						System.out.println();
						
					}
					else {
						if(perMonth > cPerMonth) {
							System.out.printf("You are over your monthly budget by $%.2f.\n", groceries.getCostPerMonth() - groceries.getTotalCostPerMonth());
							System.out.println();
						}
					}
					
					
				} // END OF IF STATEMENT
				
				// DETERMINE USERS YEARLY BUDGET AND WHAT THEY ACTUALLY SPEND ON GROCERIES PER YEAR
				double perYear = perMonth * 12; // CALCULATION TO DETERMINE YEARLY GROCERY SPENDING
				System.out.println();
				System.out.println("What is your budget on groceries per year?");
				double cPerYear = in.nextDouble();
				System.out.printf("You spend $%.2f on groceries per year.\n", perYear);
				
				// SET VARIABLES
				groceries.setTotalCostPerYear(perYear);
				groceries.setCostPerYear(cPerYear);
				
				// CREATE IF STATEMENTS TO DETERMINE IF THE USER IS UNDER, OVER, OR MEETS THEIR BUDGET
				if (perYear > cPerYear) {
					System.out.printf("You are over your yearly budget by $%.2f.\n", groceries.getTotalCostPerYear() - groceries.getCostPerYear());
				}
				else {
					if (perYear == cPerYear) {
						System.out.println("You spend your exact budget on groceries per year.");
					}
					else {
						if(perYear < cPerYear) {
							System.out.printf("You are under your yearly budget by $%.2f.\n", groceries.getTotalCostPerYear() - groceries.getCostPerYear());
							System.out.println();
						}
					}
				} // END IF STATEMENT
				
				
				// CREATE AN IF STATEMENT TO DETERMINE IF THE USER IS OVER BUDGET
				if (perYear > cPerYear) {
					System.out.println();
					System.out.println();
					System.out.println("You are over your yearly budget. Here is a tip to help you meet your budget.");
					System.out.println("Make a list of 5 items that you buy that are not neccessities.");
					
				// USE A FOR LOOP FOR USERS WHO ARE OVER BUDGET TO ADD ITEMS THAT ARE NOT NECCESSITIES 
					for (int i = 1; i <= 5; i++) {
						System.out.printf("Please enter item %d: ", i);
						String item = in.next();
						item += i;
										
					}// end while loop
					
					System.out.println("If you remove these items from your shopping list, your budget will be closer to your target.");
					System.out.println("Thank you for using my program.");
					System.out.println("Goodbye!");


					} // end if statement
				else {
					System.out.println("Thank you for using my program.");
					System.out.println("Goodbye!");
				}
						
				} 

					
				
			
					
		// END PROGRAM

	

}
