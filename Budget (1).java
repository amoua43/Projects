public class Budget {
    public static void main(String[] args) {
    int apartmentRent = 625;
    int internetService = 27;
    int groceryBill = 250;
    int funAllowance = 150;
    double hourlyWage = 10;
    
    int totalExpenses = (apartmentRent + internetService + groceryBill + funAllowance);
    System.out.println("totalExpenses: " + totalExpenses);
    // total amount of monthly expenses.

    double hoursMonthlyEven = (totalExpenses / hourlyWage);
    System.out.println("hoursMonthlyEven: " + hoursMonthlyEven);
    // total amount of monthly expenses divded by hourly wage.
    // calculation gives you the amount of hours in a month to break even.

    double hoursWeeklyEven = (hoursMonthlyEven / 4);
    System.out.println("hoursWeeklyEven: " + hoursWeeklyEven);
    // hoursMonthlyEven is divided by 4 because there are approximately 4 weeks in a month.
    // this calculation gives you the amount of hours in a week to break even.

    int totalExpenseSave = (apartmentRent + internetService + groceryBill + funAllowance + 100);
    System.out.println("totalExpenseSave: " + totalExpenseSave);
    // adding $100 is essential to totalExpenseSave.
    // totalExpenseSave value will be subtracted from totalExpenses to accquire a $100 leftover save.

    double hoursMonthlySave = (totalExpenseSave / hourlyWage);
    System.out.println("hoursMonthlySave: " + hoursMonthlySave);
    // calculation for amount of hours a student has to work to save $100 a month.

    
    





    }
}
