
public class RaceTrack {
	//fields of the class RaceTrack
	private int averageLapTime;
	private boolean isRaining;
	
	public void setIsRaining(){//public methods that makes it is raining on the track with no return value type and any parameters
		
		isRaining=true;
	}
	
	public void setIsnotRaining(){//public methods that makes it is not raining on the track with no return value type and any parameters
	
		isRaining=false;
	
	}
	public boolean getIsRaining(){//public method that return boolean value of flag IsRaining
		
		return isRaining;
	}
	
	public boolean getIsnotRaining(){//public method that return boolean value of flag IsNotRaining
	
		return isRaining;
	}
	
	public void setAverageTimeLap(int averageLapTime){//public method that set averageTimeLap
	
		this.averageLapTime=averageLapTime;
	}
	
	public int getAverageTimeLap(){ //method that return integer averageLapTime value
		return averageLapTime;
	}
	
	public Car determineRaceLeader(Car c1, Car c2, Car c3) { // method with three parameters of Car which return Car car value
		Car car = null; //initialize variable car to null
	
		if(c1.getTime()<c2.getTime() && c1.getTime()< c3.getTime()) { // if time of c1 is less then time of c2 and c3 then follow this condition
			
			car = c1; 
		}
		
	    if (c2.getTime()< c1.getTime() && c2.getTime() < c3.getTime()){ //if time of c2 is less than c1 and c3 then
			car =c2;
		}
	

		if(c3.getTime() < c2.getTime() &&c3.getTime() < c1.getTime()) {// is time of c3 is less than c2 and c1 then
			car = c3;
		}
	
	return car; 
	
}
}