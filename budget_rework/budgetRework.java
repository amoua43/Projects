public class budgetRework {
    
    public static void main(String[] args) {
        
        //Local variables listed
        double localApartment = 625.0;
        double internetService = 27.0;
        double groceryBill = 250.0;
        double funAllowance = 150.0;
        double fundsToSave = 100.0;
        double hourlyWage = 10.0;

        //Total monthly expenses
        double totalExpenses = (localApartment + internetService + groceryBill + funAllowance);

        //Save $100 a month after paying all expenses
        double save100AMonth = totalExpenses + fundsToSave;

        //hourlyWage and local variables converted to two decimal places
        String wage = String.format("%.2f", hourlyWage);
        String rent = String.format("%.2f", localApartment);
        String internet = String.format("%.2f", internetService);
        String grocery = String.format("%.2f", groceryBill);
        String allowance = String.format("%.2f", funAllowance);
        String total = String.format("%.2f", totalExpenses);

        //Print out the hourly wage of the student
        System.out.println("The hourly wage: $" + wage);

        //Print out each monthly item expense
        System.out.println("Rent: $" + rent);
        System.out.println("Internet Service: $" + internet);
        System.out.println("Grocery Bill: $" + grocery);
        System.out.println("Fun Allowance: $" + allowance);

        //Print out total monthly expenses
        System.out.println("Total Monthly Expenses: $" + total);

        //How many hours per week the student would have to work to break even
        double hoursPerWeek = (totalExpenses / hourlyWage) / 4.0;
        System.out.println("Hours per week to break even: " + hoursPerWeek);

        //How many hours per month the student would have to work to save $100
        double hoursPerMonthToSave100 = (save100AMonth / hourlyWage);
        System.out.println("Hours per month to save $100: " + hoursPerMonthToSave100);

        //How many hours per week the student would have to work to save $100
        double hoursPerWeekToSave100 = (hoursPerMonthToSave100 / 4.0);
        System.out.println("Hours per week to save $100: " + hoursPerWeekToSave100);
        
    }
}
