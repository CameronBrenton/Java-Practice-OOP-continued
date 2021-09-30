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
	}

	public void subtract(Money money){
		this.dollars -= money.dollars;
		this.cents -= money.cents;
	}

	public double compareTo(Money money){
		double moneyDollars = (double) (Math.floor(money.dollars));
		double moneyCents = (double) (Math.floor(money.cents) * .001);
		if (this.dollars == moneyDollars && this.cents == moneyCents){
			return 0;
		}
		else if(this.dollars == moneyDollars){
			if(this.cents > money.cents){
				double difference;
				difference = (double)(this.cents) - (double)(moneyCents);
				return difference;
			}
			else{
				double difference;
				difference = (double)(moneyCents) - (double)(this.cents);
				return difference;
			}
		}
		else if(this.dollars > moneyDollars){
			if(this.cents > moneyCents){
				double difference;
				difference = (double)(this.cents) - (double)(moneyCents);
				difference += this.dollars - moneyDollars;
				return difference;
			}
			else if(this.cents < moneyCents){
				double difference;
				difference = (double)(moneyCents) - (double)(this.cents);
				difference += this.dollars - moneyDollars;
				return difference;
			}
			else if(this.cents == moneyCents){
				double difference = 0;
				difference += this.dollars - moneyDollars;
				return difference;
			}
		}
		else if(this.dollars < moneyDollars){
			if(this.cents > moneyCents){
				double difference;
				difference = (double)(this.cents) - (double)(moneyCents);
				difference += moneyDollars - this.dollars;
				return difference;
			}
			else if(this.cents < moneyCents){
				double difference;
				difference = (double)(moneyCents) - (double)(this.cents);
				difference += moneyDollars - this.dollars;
				return difference;
			}
			else if(this.cents == moneyCents){
				double difference = 0;
				difference += this.dollars - moneyDollars;
				return difference;
			}
		}
		return 0;
		
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
		return "Money[dollars = " + dollars + ", cents = " + cents + "]";
	}
}
