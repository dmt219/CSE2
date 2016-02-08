// Duc Tran
// 05/02/2016
// CSE 2
//PURPOSE OF THE PROGRAM IS TO MEASURE THE DISTANCE OF THE TWO TRIPS

public class Cyclometer {
    //main method required for every java program
    public static void main (String[] args ){
        
    // end of main method
    
 // end of class
// our input data. Document your variables by placing your
		// comments after the “//”. State the purpose of each variable.

int secsTrip1=480; //variable stored the time Trip 1 takes (in seconds)
int secsTrip2=3220; //variable stored the time Trip 2 takes (in seconds)
int countsTrip1=1561; // variable stored the number of rotations of the front wheel during Trip 1
int countsTrip2=9037; //variable stored the number of rotations of the front wheel during Trip 2
double wheelDiameter=27.0,  // the diameter of the front wheel in inches
PI=3.14159, // value of the constant pi
feetPerMile=5280,  // 1 mile = 5280 feet
inchesPerFoot=12,   // 1 foot = 12 inches
secondsPerMinute=60;  // 1 minute = 60 seconds
double distanceTrip1, distanceTrip2,totalDistance;  //variable stored distance of Trip 1, distance of Trip 2 and the total distance Trip 1 + Trip2

System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");

distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
    	
distanceTrip1/=inchesPerFoot*feetPerMile; // convert distanceTrip1 to miles

distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data
System.out.println("Trip1 was " +distanceTrip1+" miles.");
System.out.println("Trip2 was "+distanceTrip2+" miles.");
System.out.println("The total distance was "+totalDistance+" miles.");
}
}



  