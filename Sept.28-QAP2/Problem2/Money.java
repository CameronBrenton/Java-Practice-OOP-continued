package Problem2;

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
			this.dollars -=1;
			this.cents = this.cents + 100;
		}
	}
	
	public int compareTo(Money money){
		double moneyDollars = (double) (Math.floor(money.dollars));
		double moneyCents = (double) (Math.floor(money.cents));


		//Checking to see if the balance(this.dollars & this.cents) is exceeded by the given amount.
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

	public boolean equals(Money money){
		if(this.dollars == money.dollars && this.cents == money.cents){
			return true;
		}
		else{
			return false;
		}
	}

	public String toString(){
		return "$" + dollars + "." + cents;
	}
}
