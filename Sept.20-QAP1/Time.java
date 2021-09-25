public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}

	public void setHour(int hour){
		this.hour = hour;
	}

	public void setMinute(int minute){
		this.minute = minute;
	}

	public void setSecond(int second){
		this.second = second;
	}

	public void setTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString(){
		if (hour < 10){
			if (minute < 10){
				if(second < 10){
					return "0" + hour + ":0" + minute + ":0" + second;
				}
				else{
					return "0" + hour + ":0" + minute + ":" + second;
				}
			}
			else{
				if(second < 10){
					return "0" + hour + ":" + minute + ":0" + second;
				}
				else{
					return "0" + hour + ":" + minute + ":" + second;
				}
			}
			
		}
		else{
			if (minute < 10){
				if(second < 10){
					return hour + ":0" + minute + ":0" + second;
				}
				else{
					return hour + ":0" + minute + ":" + second;
				}
			}
			else{
				if(second < 10){
					return hour + ":" + minute + ":0" + second;
				}
				else{
					return hour + ":" + minute + ":" + second;
				}
			}
		}
		
	}

	public void nextSecond(){
		second++;
		if(second == 60){
			second = 0;
			minute = minute + 1;
			if(minute == 60){
				minute = 0;
				hour = hour + 1;
				if(hour == 24){
					hour = 0;
				}
			}
		}
		

	}

	public void previousSecond(){
		second--;
		if(second == -1){
			second = 59;
			minute = minute - 1;
			if(minute == -1){
				minute = 59;
				hour = hour - 1;
				if(hour == -1){
					hour = 23;
				}
			}
		}
	}

	
}
