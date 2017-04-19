
public class Car {
	//fields of the class Car
	public int id; 
	private int fuelLevel;
	private int lowFuelBoost;
	private int highFuelSlowdown;
	private int fuelComsumption;
	private int pitStoptime;
	private int rainSlowdown;
	private int totalTime;
	
	public Car(int id, int fuelLevel, int lowFuelBoost, int highFuelSlowdown, int fuelComsumption, int pitStoptime, int rainSlowdown, int totalTime){//constructor Car with parameters
		
		this.id = id;
		this.fuelLevel = fuelLevel;;
		this.lowFuelBoost = lowFuelBoost;
		this.highFuelSlowdown = highFuelSlowdown;
		this.fuelComsumption = fuelComsumption;
		this.pitStoptime = pitStoptime;
		this.rainSlowdown = rainSlowdown;
		this.totalTime = totalTime;
		
	}
	
	public int completeLap(RaceTrack track){ //method completeLap with argument track of type RaceTrack and integer return value
		totalTime+=track.getAverageTimeLap(); //totalTime = totalTime+averageTimeLap
		
		if(fuelLevel>50) {//if fuel is bigger than 50 then follow this condition
		
			totalTime+=highFuelSlowdown;//totalTime=totalTime+highFuelSlowdown
		}
		
		else //otherwise
		
			totalTime-=lowFuelBoost;//totalTime=totalTime-lowDuelBoost
		
		if (track.getIsRaining()){//if it is raining on the track then follow this condition
		
			totalTime+=rainSlowdown;			//totalTime=totalTime+rainSlowdown
		}
		
		fuelLevel-= fuelComsumption; //fuelLevel=fuelLevel-fuelConsumption
		
		if(fuelLevel< fuelComsumption){ // if fuelLevel is less than fuelConsumption then follow this condition
			totalTime+=pitStoptime; //totalTime=totalTime+pitStoptime
			fuelLevel=100;//fill up to maximum capacity(100)
		}
		
		return totalTime; //return totalTime value
		
	}
	
	public int getTime(){ //method getTime with no argument that returns integer totalTime value
		return totalTime;
	}
	public int getId(){ //method getId with no parameter which returns integer id value
		return id;
	}
}
