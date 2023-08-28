public class CarLoanPayment
{
    /*applying for a carloan of 10000, down payment is 2000, interest rate is 5% and for a period of 3 years
    conditions included: if loan tenure or interest is less than or equal to 0 - that means it a possible scam and invalid request
    if the down payment amount is more than the total cost of the car, then the car can be paid in full
    */
    public static void main(String[] args)
    {
        int carLoan = 10000;
        int interestRate = 5;
        int loanTenure = 3;
        int downpayment = 2000;
        if (downpayment > carLoan)
            System.out.println("Pay for the car in full, No loan required");
        else if ((interestRate <= 0) || (loanTenure <= 0))
            System.out.println("Possible scam detected, invalid request. Loan cannot be processed!!");
    //Conditions ended
        int remainingAmount = carLoan - downpayment;
        int months = loanTenure * 12;
        int monthlyDueAmount = remainingAmount / months;
        int interest = (monthlyDueAmount * interestRate) / 100;
        int monthlyEMI = monthlyDueAmount + interest;
        System.out.println("Monthly EMI is going to be " +monthlyEMI);
    }
}
