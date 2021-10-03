//This is the Money Class

package Problem2;

public class Money {
	private long dollars;
	private long cents;

	//Constructor
	public Money(double amount){
		dollars = (long)(Math.floor(amount));
		cents = (long)((amount - dollars) * 100);
	}

	//Copy Constructor
	public Money(Money money){
		dollars = money.dollars;
		cents = money.cents;
	}

	//Used in the Credit Card class's charge() method to add a charge to the card
	public void add(Money money){
		this.dollars += money.dollars;
		this.cents += money.cents;
		if(this.cents > 99){
			this.dollars += 1;
			this.cents = this.cents % 100;
		}
	}

	// Used in the Credit Card class's charge() method to reverse a charge. 
	// It's also used in the payment method() to subtract from the balance.
	public void subtract(Money money){
		this.dollars -= money.dollars;
		this.cents -= money.cents;
		if(this.cents < 0){
			this.dollars -=1;
			this.cents = this.cents + 100;
		}
	}
	
	//Checking to see if the balance(this.dollars & this.cents) is exceeded by the given amount.
	// Will be used to make sure balance doesn't exceed the credit limit.
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
		
		// This is the old code I had for the compareTo() method but then later realized it wasn't what I needed for the problem.
		// I wanted to keep it here but commented out just to show my work.
		//
		/*if (this.dollars == moneyDollars && this.cents == moneyCents){
			return 0;
		}
		else if(this.dollars == moneyDollars){
			if(this.cents > money.cents){
				Money difference = new Money(0);
				difference = (this.cents * .01) - (moneyCents * .01);
				return difference;
			}
			else{
				Money difference = new Money(0);
				difference = (moneyCents * .01) - (this.cents * .01);
				return difference;
			}
		}
		else if(this.dollars > moneyDollars){
			if(this.cents > moneyCents){
				Money difference = new Money(0);
				difference = (this.cents * .01) - (moneyCents * .01);
				difference += this.dollars - moneyDollars;
				return difference;
			}
			else if(this.cents < moneyCents){
				Money difference = new Money(0);
				difference = (moneyCents * .01) - (this.cents * .01);
				difference += this.dollars - moneyDollars;
				return difference;
			}
			else if(this.cents == moneyCents){
				Money difference = new Money(0);
				difference += this.dollars - moneyDollars;
				return difference;
			}
		}
		else if(this.dollars < moneyDollars){
			if(this.cents > moneyCents){
				Money difference = new Money(0);
				difference = (this.cents * .01) - (moneyCents * .01);
				difference += moneyDollars - this.dollars;
				return difference;
			}
			else if(this.cents < moneyCents){
				Money difference = new Money(0);
				difference = (moneyCents * .01) - (this.cents * .01);
				difference += moneyDollars - this.dollars;
				return difference;
			}
			else if(this.cents == moneyCents){
				Money difference = new Money(0);
				difference += this.dollars - moneyDollars;
				return difference;
			}
		}
		return 0;*/
		
	}

	// A method used to check if two money objects are exactly the same in money value and type.
	public boolean equals(Money money){
		if(this.dollars == money.dollars && this.cents == money.cents){
			return true;
		}
		else{
			return false;
		}
	}

	// toString() method.
	public String toString(){
		return "$" + dollars + "." + cents;
	}
}
