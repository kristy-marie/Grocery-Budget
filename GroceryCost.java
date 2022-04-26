
public class GroceryCost {
	
		private double costPerWeek;
		private double costPerMonth;
		private double costPerYear;
		private double userBudget;
		private double totalCostPerMonth;
		private double totalCostPerYear;
		private String item;
		
		
		// create default constructor
		public GroceryCost() {
			
		}
		
		// create constructor with 4 arguments
		public GroceryCost(double perWeek, double perMonth, double perYear, double budget) {
			costPerWeek = perWeek;
			costPerMonth = perMonth;
			costPerYear = perYear;
			userBudget = budget;
		}
		
		// begin getters and setters

		public double getCostPerWeek() {
			return costPerWeek;
		}

		public void setCostPerWeek(double costPerWeek) {
			
			if(costPerWeek < 0.0) {
				throw new IllegalArgumentException("Cost per week must be equal or greater than $0");
			}
			this.costPerWeek = costPerWeek;
		}

		public double getCostPerMonth() {
			return costPerMonth;
		}

		public void setCostPerMonth(double costPerMonth) {
			if(costPerMonth < 0.0) {
				throw new IllegalArgumentException("Cost per month must be greater or equal to $0");
			}
			this.costPerMonth = costPerMonth;
		}

		public double getCostPerYear() {
			return costPerYear;
		}

		public void setCostPerYear(double costPerYear) {
			
			if(costPerYear < 0.0) {
				throw new IllegalArgumentException("Cost per year must be greater than or equal to $0");
			}
			this.costPerYear = costPerYear;
		}

		public double getUserBudget() {
			return userBudget;
		}

		public void setUserBudget(double userBudget) {
			
			if(userBudget < 0.0) {
				throw new IllegalArgumentException("The user budget must be greater than or equal to $0");
			}
			this.userBudget = userBudget;
		}
		
		public double getTotalCostPerMonth() {
			return totalCostPerMonth;
			
		}
		
		public void setTotalCostPerMonth(double totalCostPerMonth) {
			
			if(totalCostPerMonth < 0.0) {
				throw new IllegalArgumentException("The total cost per month must be greater than "
						+ "or equal to $0");
			}
			this.totalCostPerMonth = totalCostPerMonth;
		}
		
		public double getTotalCostPerYear() {
			return totalCostPerYear;
		}
		
		public void setTotalCostPerYear(double totalCostPerYear) {
			
			if(totalCostPerYear < 0.0) {
				throw new IllegalArgumentException("The cost per year must be greater than or equal to $0");
			}
			this.totalCostPerYear = totalCostPerYear;
		}
		
		public String getItem() {
			return item;
		}
		
		public void setItem(String item) {
			this.item = item;
		}
		


		
			
		}
		
		
	// END



