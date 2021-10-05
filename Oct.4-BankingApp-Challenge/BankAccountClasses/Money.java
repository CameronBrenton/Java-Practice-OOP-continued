package BankAccountClasses;
public class Money {

	private long dollars;
	private long cents;

	public Money(double amount){
		dollars = (long)(Math.floor(amount));
		cents = (long)((amount - dollars) * 100);
	}

	public Money(Money money){
		dollars = money.dollars;
		cents = money.cents;
	}

	public void add(Money money){
		this.dollars += money.dollars;
		this.cents += money.cents;
		if(this.cents > 99){
			this.dollars += 1;
			this.cents = this.cents % 100;
		}
	}

	public void subtract(Money money){
		this.dollars -= money.dollars;
		this.cents -= money.cents;
		if(this.cents < 0){
			this.dollars -= 1;
			this.cents = this.cents + 100;
		}
	}

	public int compareTo(Money money){
		double moneyDollars = (double) (Math.floor(money.dollars));
		double moneyCents = (double) (Math.floor(money.cents));

		if (this.dollars == moneyDollars && this.cents == moneyCents){
			return 0;
		}
		else if(this.dollars >= moneyDollars && this.cents >= moneyCents){
			return 1;
		}
		else if(this.dollars < moneyDollars){
			return -1;
		}
		else{
			return 0;
		}
	}

	public String toString(){
		return "$" + dollars + "." + cents;
	}
	
}
