
public class RaceSimulator {

	public static void main(String[] args) {
		
		RaceTrack silverstone = new RaceTrack();//creating an object silverstone of class RaceTrack 
		silverstone.setAverageTimeLap(90);//set average time to 90
		silverstone.setIsnotRaining();//make it is not raining on the track silverstone
		
		Car BatmanCar = new Car(1,55,6,5,25,12,15,0);//creating an object BatmanCar of class Car with given parameters
		Car SupermanCar = new Car(2,60,8,7,28,14,10,0);//creating an object SupermanCar of class Car with given parameters
		Car JokerCar = new Car(3,90,10,6,30,16,9,0);//creating an object JokerCar of class Car with given parameters
		
		BatmanCar.completeLap(silverstone);//race BatmanCar on track silverstone
	    SupermanCar.completeLap(silverstone);//race SupermanCar on track silverstone
	    JokerCar.completeLap(silverstone);//race JokerCar on track silverstone
		System.out.println("the id of the first car during the first lap: "+silverstone.determineRaceLeader(BatmanCar, SupermanCar, JokerCar).getId());//print id of the first lap leader
		
		BatmanCar.completeLap(silverstone);//race BatmanCar on track silverstone
		SupermanCar.completeLap(silverstone);//race SupermanCar on track silverstone
		JokerCar.completeLap(silverstone);//race JokerCar on track silverstone
		System.out.println("the id of the first car in the second lap is : " + silverstone.determineRaceLeader(BatmanCar, SupermanCar, JokerCar).getId());//print id of the second lap leader
		
		silverstone.setIsRaining(); //make it is raining on the track silverstone
		
		BatmanCar.completeLap(silverstone); ////race BatmanCar on track silverstone
		SupermanCar.completeLap(silverstone);//race SupermanCar on track silverstone
		JokerCar.completeLap(silverstone);//race JokerCar on track silverstone
		System.out.println("the id of the winner of the race is: " + silverstone.determineRaceLeader(BatmanCar, SupermanCar, JokerCar).getId());////print id of the race winner
		




	}

}
