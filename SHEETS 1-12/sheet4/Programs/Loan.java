abstract class Loan implements LoanConstants {
    String loanNum;
    String lastName;
    double loanAmt;
    double interestRate;
    int term;
    Loan(String loanNum, String lastName, double loanAmt, int term) {
        this.loanNum = loanNum;
        this.lastName = lastName;
        if (loanAmt > max) {
                System.out.println("Loan amount value is more than $100,000");
            } 
        else {
                this.loanAmt = loanAmt;
            }
        if(term==st||term==mt||term==lt){
            this.term=term;
        }
        else{
            this.term=1;
        }

    }
    public String toString() {
        double n =this.loanAmt+(this.loanAmt * (this.interestRate/100));
        return this.lastName + "'s loan number is " + this.loanNum + " his loan amount is " + this.loanAmt + " with intrest rate of " + this.interestRate +" and total due is " + n + " in term " + this.term;
    }
}