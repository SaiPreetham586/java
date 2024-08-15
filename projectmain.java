import java.util.Scanner;
class A
{
static Scanner sc=new Scanner(System.in);
  static String def = "\u001B[0m";
    
   static String red = "\u001B[31m";
     static String green = "\u001B[32m";
     static String yellow = "\u001B[33m";
     static String blue = "\u001B[34m";
     static String purple = "\u001B[35m";
     static String skblue = "\u001B[36m";
     static String cyan="\u001B[36m";
   final String ital = "\u001B[3m";
	static String bold="\u001B[1m";
//static final String def = "\u001b [0;1m";
static String ul = "\u001B[4m";
static final String blink = "\u001b[5m";
static final String bgred ="\u001b[10 [101;1m";

static final String bggreen = "\u001b[: o [102;1m";

static final String bgyellow= "\u001b[103;1m";

static final String bgblue = "\u001b[10404;1m";

static final String bgpurpe = "\u001b[10 105;1m";

static final String bgskblue = "\u001b [1 b[106;1m";
}

class Methods extends Payments {
	static  String def = "\u001B[0m";
   static String red = "\u001B[31m";
     String green = "\u001B[32m";
     static String yellow = "\u001B[33m";
     String blue = "\u001B[34m";
     String purple = "\u001B[35m";
     String skblue = "\u001B[36m";
     String cyan="\u001B[36m";

    static String place;
    static int a  = 0;
    static int b=0;
    static int days =0;
    static void login(long phoneno) {
	String yellow = "\u001B[33m";
        if (phoneno >= 6000000000L && phoneno <= 9999999999L) {
            String mob = String.valueOf(phoneno);
            int len = mob.length();
            if (len == 10) {
                otp();
            } else {
		System.out.println(red);
                System.out.println("Invalid mobile number");
		System.out.println(def);
                System.out.print("Enter valid mobile number :");
                login(sc.nextLong());
            }
        } else {
	    System.out.println(red);
            System.out.println("Invalid mobile number");
	    System.out.println(def);
            System.out.print("Enter valid mobile number :");
            login(sc.nextLong());
        }
    }
    static void location1() {
	System.out.println("1.Confirm location");
	System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "LB Nagar";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default : 
			  System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			  System.out.println(def);
			  location1();
			  break;
	    }
    }
    static void location() {
	if(a==0){
	System.out.println("We are currently operating in Hyderabad");
	a=1;
	}
	System.out.println("These are the locations where our service vehicles are available");
	System.out.println("Kindly select a location to avail our services");
        System.out.println("			1.LB nagar\n			2.Dilshuknagar\n			3.Ameerpet\n			4.KPHB\n			5.Secunderabad\n			6.Miyapur\n			7.JBS\n			8.Madhapur\n			9.Gachibowli\n			10.Khairatabad");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1.Confirm location");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "LB Nagar";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :
			System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			System.out.println(def);
			  location1();
			  break;
	    }
        } else if (n == 2) {
              System.out.println("1.Confirm location");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "Dilsukhnagar";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :
			System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			System.out.println(def);
			  location1();
			  break;
	    }
        } else if (n == 3) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "Ameerpet";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default : 
			System.out.println(red);
			System.out.println("OOPS!!! Please select an option");
			System.out.println(def);
			  location1();
			  break;
	    }
        } else if (n == 4) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "KPHB";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :	
			System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			System.out.println(def);
			  location1();
			  break;
	    }
        } else if (n == 5) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "Secunderabad";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			 System.out.println(def);
			  location1();
			  break;
	    }
		} else if (n == 6) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "Miyapur";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			 System.out.println(def);
			  location1();
			  break;
	    }
		}else if (n == 7) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "JBS";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			 System.out.println(def);
			  location1();
			  break;
	    }
	}
	else if (n == 8) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "Madhapur";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			 System.out.println(def);
			  location1();
			  break;
	    }

	}	else if (n == 9) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "Gachibowli";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			 System.out.println(def);
			  location1();
			  break;
	    }

	}	else if (n == 10) {
              System.out.println("1.Confirm location?");
	    System.out.println("2.Choose another location");
            int a = sc.nextInt();
	    switch(a) {
		case 1 : place = "Khairatabad";
			 VehicleType();
			 break;
		case 2 : location();
			 break;
		default :System.out.println(red);
			 System.out.println("OOPS!!! Please select an option");
			 System.out.println(def);
			  location1();
			  break;
	    }



       } else {
            System.out.println("Please kindly select your location once again");
            location();
        }
    }
   static void confirmcity() {
	System.out.println("1.Confirm city?");
	System.out.println("2.Choose another city");
	int a = sc.nextInt();
	switch(a) {
		case 1 : VehicleType();
			 break;
		case 2 : location();
			 break;
		default : confirmcity();
			  break;
	}
   }

    static void VehicleType1() {
	System.out.println("1.Proceed to book a bike?");
	System.out.println("2.Change vehicle type");
	 int p = sc.nextInt();
		      switch(p) {
		      		case 1 : two_wheeler();
					 break;
				case 2 : VehicleType();
					 break;
				default :System.out.println(red); 
					System.out.println("OOPS Select an option");
					System.out.println(def);
					  VehicleType1();
					  break;
               	      }
    }

   static void VehicleType2() {
	System.out.println("1.Proceed to book a car?");
	System.out.println("2.Change vehicle type");
	 int p = sc.nextInt();
		      switch(p) {
		      		case 1 : four_wheeler();
					 break;
				case 2 : VehicleType();
					 break;
				default :System.out.println(red);
					 System.out.println("OOPS Select an option");
					 System.out.println(def);
					  VehicleType2();
					  break;
               	      }
    }
   static void VehicleType3() {
	System.out.println("1.Proceed to book a TRUCK?");
	System.out.println("2.Change vehicle type");
	 int p = sc.nextInt();
		      switch(p) {
		      		case 1 : Trucks();
					 break;
				case 2 : VehicleType();
					 break;
				default :System.out.println(red);
					 System.out.println("OOPS Select an option");
					 System.out.println(def);
					  VehicleType3();
					  break;
               	      }
    }
    static void VehicleType() {
	if(b==0){
        System.out.println(" please select the type of vehicle you want to rent");
	b=1;
	}
        System.out.println("1  bike\n2  car\n3  Truck");
        int n = sc.nextInt();
        switch (n) { 
            case (1): System.out.println("1.Proceed to book a bike?");
		      System.out.println("2.Change vehicle type");
		      int p = sc.nextInt();
		      switch(p) {
		      		case 1 : two_wheeler();
					 break;
				case 2 : VehicleType();
					 break;
				default :System.out.println(red);
					 System.out.println("OOPS Select an option");
					 System.out.println(def);
					   VehicleType1();
					  break;
               	      }
		      break;
            case (2): System.out.println("1.Proceed to book a car?");
		      System.out.println("2.Change vehicle type");
		      int q = sc.nextInt();
		      switch(q) {
		      		case 1 : four_wheeler();
					 break;
				case 2 : VehicleType();
					 break;
				default :System.out.println(red);
     					 System.out.println("OOPS Select an option");
					 System.out.println(def);
					  VehicleType2();
					  break;
               	      }
			break;
            case (3): System.out.println("1.Proceed to book a Truck?");
		      System.out.println("2.Change vehicle type");
		      int r = sc.nextInt();
		      switch(r) {
		      		case 1 : Trucks();
					 break;
				case 2 : VehicleType();
					 break;
				default : System.out.println(red);
					  System.out.println("OOPS Select an option");
					  System.out.println(def);
					  VehicleType3();
					   break;
               	      }
			break;
            default:  System.out.println(red);
                      System.out.println("Invalid input");
		      System.out.println(def);
		      System.out.println();
                      System.out.println("Please select valid input");
                      VehicleType();
        }
    }

    static void two_wheeler() {
	System.out.println("These are the types of bikes which are available");
	System.out.println("Select a bike of your choice...!!!");
        System.out.println("1 Scooters\n2 Bikes");
        int n = sc.nextInt();
        if (n == 1) {
            scooty();
        } else if (n == 2) {
            bike();
        } else {
            System.out.println("Please select a two wheeler");
	    two_wheeler();
        }
    }

    static void scooty1() {
		System.out.println("1.Proceed to book this scoooter");
		System.out.println("2.Go back and choose another scooter");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : scooty();
				 break;
			case 3 : VehicleType();
				 break;
			default : System.out.println("Please select a valid option");
				  scooty1();
				  break;
		}
    }
    static void scooty2() {
		System.out.println("How many days do you want to rent the scooter for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			scooty2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			scooty2();
		}
    }
    static void bike2() {
		System.out.println("How many days do you want to rent the bike for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			bike();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			bike2();
		}
    }
        static void sedan2() {
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			sedan2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			sedan2();
		}
    }
      static void suv2() {
		System.out.println("How many days do you want to rent the SUV for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			suv2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			suv2();
		}
    }
   static void trucks2() {
		System.out.println("How many days do you want to rent the truck for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			trucks2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			trucks2();
		}
    }
    
    static void scooty() {
        System.out.println("Scooters are rented out for a minimum of 1 day to a maximum of 30 days");
        System.out.println("Available Scooters near "+place);
        System.out.println("1 Honda Activa");
        System.out.println("2 TVS Jupiter");
        System.out.println("3 Hero Pleasure");
        int n = sc.nextInt();
        switch (n) {
            case 1 : {
                System.out.println("Vehicle Name: Honda Activa 6G");
                System.out.println("Mileage: 40 kmpl");
                System.out.println("549/day");
		System.out.println("1.Proceed to book this scoooter");
		System.out.println("2.Go back and choose another scooter");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : scooty();
				 break;
			case 3 : VehicleType();
				  break;
			default : System.out.println("Please select a valid option");
				  scooty1();
				  break;
		}
		System.out.println("How many days do you want to rent the scooter for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			scooty2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			scooty2();
		}
	}
                break;
            case 2: {
                System.out.println("Vehicle Name: TVS Jupiter");
                System.out.println("Mileage: 45 kmpl");
                System.out.println("449/day");
		System.out.println("1.Proceed to book this scoooter");
		System.out.println("2.Go back and choose another scooter");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : scooty();
				 break;
			case 3 : VehicleType();
				  break;
			default : scooty1();
				  break;
		}
		System.out.println("How many days do you want to rent the scooter for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			scooty2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			scooty2();
		}
		}
                break;
            case 3: {
                System.out.println("Vehicle Name: Hero Pleasure");
                System.out.println("Mileage: 50 kmpl");
                System.out.println("339/day");
		System.out.println("1.Proceed to book this scoooter");
		System.out.println("2.Go back and choose another scooter");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : scooty();
				 break;
			case 3 : VehicleType();
				  break;
			default : scooty1();
				  break;
		}
		System.out.println("How many days do you want to rent the scooter for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			scooty2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			scooty2();
		}
		}
                break;
            default:
                System.out.println("Kindly select a scooter");
                scooty();
        }
    }

	static void bike1() {
		System.out.println("1.Proceed to book this bike");
		System.out.println("2.Go back and choose another bike");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
			switch(z) {
				case 1 : break;
				case 2 : bike();
				 	break;
				case 3 : VehicleType();
					  break;
				default : bike1();
					  break;
			}
	}

    static void bike() {
	System.out.println("Available bikes near "+place);
        System.out.println("1 Honda");
        System.out.println("2 Royal Enfield");
        System.out.println("3 KTM");
        System.out.println("4 Suzuki");
        int a = sc.nextInt();
        switch (a) {
            case 1: {
                System.out.println("Honda Unicorn");
		System.out.println("Mileage : 60 kmpl");
                System.out.println("599/day");
		System.out.println("1.Proceed to book this bike");
		System.out.println("2.Go back and choose another bike");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : bike();
				 break;
			case 3 : VehicleType();
				 break;
			default : bike1();
				  break;
		}
		System.out.println("How many days do you want to rent the bike for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			bike2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			bike2();
		}
		}
                break;
            case 2: {
                System.out.println("Royal Enfield Classic 350");
		System.out.println("Mileage : 35 kmpl");
                System.out.println("1099/day");
		System.out.println("1.Proceed to book this bike");
		System.out.println("2.Go back and choose another bike");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : bike();
				 break;
			case 3 : VehicleType();
				  break;
			default : bike1();
				  break;
		}
	        System.out.println("How many days do you want to rent the bike for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			bike2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			bike2();
		}
		}
                break;
            case 3: {
                System.out.println("KTM RC 390");
		System.out.println("Mileage : 25 kmpl");
                System.out.println("1299/day");
		System.out.println("1.Proceed to book this bike");
		System.out.println("2.Go back and choose another bike");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : bike();
				 break;
			case 3 : VehicleType();
				 break;
			default : bike1();
				  break;
		}
	        System.out.println("How many days do you want to rent the bike for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			bike2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			bike2();
		}
		}
                break;
            case 4: {
                System.out.println("Suzuki Gixxer SF");
		System.out.println("Mileage : 30 kmpl");
                System.out.println("799/day");
		System.out.println("1.Proceed to book this bike");
		System.out.println("2.Go back and choose another bike");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : bike();
				 break;
			case 3 : VehicleType();
				 break;
			default : bike1();
				  break;
		}
	        System.out.println("How many days do you want to rent the bike for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			bike2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			bike2();
		}
		}
                break;
            default:
		System.out.println(red);
                System.out.println("Oops something went wrong, kindly select your vehicle type");
		System.out.println(def);
                bike();
        }
    }

    static void four_wheeler() {
	System.out.println("These are the types of four_wheelers availabe");
	System.out.println("Select a four_wheeler of your choice..!!");
        System.out.println("1 Sedan\n2 SUV");
        int s = sc.nextInt();
        if (s == 1) {
            sedan();
        } else if (s == 2) {
            suv();
        } else {
	    System.out.println(red);
            System.out.println("Invalid input please select again");
	    System.out.println(def);
            four_wheeler();
        }
    }
    static void sedan1() {
	System.out.println("1.Proceed to book this sedan");
	System.out.println("2.Go back and choose another sedan");
	System.out.println("3.Main Menu");
	int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : sedan();
				 break;
			case 3 : VehicleType();
				  break;
			default : sedan1();
				   break;
		}
    }
    static void sedan() {
        System.out.println("Sedans are rented out for a minimum of 1 day to a week at max");
	System.out.println("Available Sedans near "+place);
        System.out.println("1. Maruti Suzuki Ciaz");
        System.out.println("2. Honda City");
        System.out.println("3. Hyundai Verna");
        System.out.println("4. Volkswagen Virtus");
        int b = sc.nextInt();
        switch (b) {
            case 1: {
                System.out.println("Vehicle Name: Maruti Suzuki Ciaz");
		System.out.println("Mileage : 21 kmpl");
                System.out.println("Transmission type: Manual\nFuel type: Diesel\nSeats: 5 seater");
                System.out.println("Price: Rs.3876 per day");
		System.out.println("1.Proceed to book this sedan");
		System.out.println("2.Go back and choose another sedan");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : sedan();
				 break;	
			case 3 : VehicleType();
				  break;
			default : sedan1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			sedan2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			sedan2();
		}
		}
                break;
            case 2: {
                System.out.println("Vehicle Name: Honda City");
		System.out.println("Mileage : 27 kmpl");
                System.out.println("Transmission type: Manual\nFuel type: Petrol\nSeats: 5 seater");
                System.out.println("Price: Rs.3705 per day");
		System.out.println("1.Proceed to book this sedan");
		System.out.println("2.Go back and choose another sedan");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : sedan();
				 break;
			case 3 : VehicleType();
				 break;
			default : sedan1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			sedan2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			sedan2();
		}
		}
                break;
            case 3: {
                System.out.println("Vehicle Name: Hyundai Verna");
		System.out.println("Mileage : 19 kmpl");
                System.out.println("Transmission type: Automatic\nFuel type: Petrol\nSeats: 5 seater");
                System.out.println("Price: Rs.5016 per day");
		System.out.println("1.Proceed to book this sedan");
		System.out.println("2.Go back and choose another sedan");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : sedan();
				 break;
			case 3 : VehicleType();
				 break;
			default : sedan1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			sedan2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			sedan2();
		}
		}
                break;
            case 4: {
                System.out.println("Vehicle Name: Volkswagen Virtus");
		System.out.println("Mileage : 18 kmpl");
                System.out.println("Transmission type: Manual\nFuel type: Petrol\nSeats: 5 seater");
                System.out.println("Price: Rs.4645 per day");
		System.out.println("1.Proceed to book this sedan");
		System.out.println("2.Go back and choose another sedan");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : sedan();
				 break;
			case 3 : VehicleType();
				 break;
			default : sedan1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			sedan2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			sedan2();
		}
		}
                break;
            default:
                System.out.println("Please select your car type");
                sedan();
        }
    }
    static void suv1() {
	System.out.println("1.Proceed to book this SUV");
	System.out.println("2.Go back and choose another SUV");
	System.out.println("3.Main Menu");
	int z = sc.nextInt();
	switch(z) {
		case 1 : break;
		case 2 : suv();
			break;
		case 3 : VehicleType();
			break;
		default : suv1();
			break;
	}
    }
    static void suv() {
        System.out.println("SUVs are rented out for a minimum of 1 day to a week at max");
	System.out.println("Available SUVs near "+place);
        System.out.println("1. Mahindra XUV 700\n2. Toyota Fortuner\n3. Hyundai Creta\n4. Tata Harrier\n5. Ford Endeavour");
        int c = sc.nextInt();
        switch (c) {
            case 1: {
                System.out.println("Vehicle Name: Mahindra XUV 700");
		System.out.println("Mileage : 15 kmpl");
                System.out.println("Transmission type: Manual\nFuel type: Diesel\nSeats: 7 seater");
                System.out.println("Rs.5829 per day");
		System.out.println("1.Proceed to book this SUV");
		System.out.println("2.Go back and choose another SUV");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : suv();
				 break;
			case 3 : VehicleType();
				 break;
			default : suv1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			suv2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			suv2();
		}
		}
                break;
            case 2: {
                System.out.println("Vehicle Name: Toyota Fortuner");
		System.out.println("Mileage : 20 kmpl");
                System.out.println("Transmission type: Manual\nFuel type: Petrol\nSeats: 7 seater");
                System.out.println("Rs.5842 per day");
		System.out.println("1.Proceed to book this SUV");
		System.out.println("2.Go back and choose another SUV");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : suv();
				 break;
			case 3 : VehicleType();
				 break;
			default : suv1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			suv2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			suv2();
		}
		}
                break;
            case 3: {
                System.out.println("Vehicle Name: Hyundai Creta ");
		System.out.println("Mileage : 17 kmpl");
                System.out.println("Transmission type: Automatic\nFuel type: Diesel\nSeats: 5 seater");
                System.out.println("Rs.6526 per day");
		System.out.println("1.Proceed to book this SUV");
		System.out.println("2.Go back and choose another SUV");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : suv();
				 break;
			case 3 : VehicleType();
				 break;
			default : suv1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			suv2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			suv2();
		}
		}
                break;
            case 4: {
                System.out.println("Vehicle Name: Tata Harrier");
		System.out.println("Mileage : 15 kmpl");
                System.out.println("Transmission type: Manual\nFuel type: Diesel\nSeats: 5 seater");
                System.out.println("Rs.5210 per day");
		System.out.println("1.Proceed to book this SUV");
		System.out.println("2.Go back and choose another SUV");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : suv();
				 break;
			case 3 : VehicleType();
				  break;
			default : suv1();
				  break;
		}
		System.out.println("How many days do you want to rent the sedan for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			suv2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			suv2();
		}
		}
                break;
            case 5: {
                System.out.println("Vehicle Name: Ford Endeavour");
		System.out.println("Mileage : 14 kmpl");
                System.out.println("Transmission type: Automatic\nFuel type: Diesel\nSeats: 7 seater");
                System.out.println("Rs.4756 per day");
		System.out.println("1.Proceed to book this SUV");
		System.out.println("2.Go back and choose another SUV");
		System.out.println("3.Main Menu");
		int z = sc.nextInt();
		switch(z) {
			case 1 : break;
			case 2 : suv();
				 break;
			case 3 : VehicleType();
				 break;
			default : suv1();
				  break;
		}
		System.out.println("How many days do you want to rent the SUV for");
	        int d = sc.nextInt();
		days=d;
		if(d>=1 && d<=30) {
			price(549*d);
			System.out.println("This is your price for the selected duration : "+price);
			System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
			System.out.println("How would you like to pay?");
                		selectpayment();
		}
		else if(d<1) {
			System.out.println("Our vehicles are only given out for atleast one day");
			suv2();
	        }
		else {
			System.out.println("We rent our vehicles for a maximum of 30 days");
			suv2();
		}
		}
                break;
            default:
                System.out.println("Please select your car type");
                suv();
        }
    }
    static void trucks1() {
	System.out.println("1.Proceed to book this Truck");
	System.out.println("2.Go back and choose another Truck");
	System.out.println("3.Main Menu");
	int z = sc.nextInt();
		switch(z) {
			 case 1 : break;
			 case 2 : Trucks();
				 break;
			 case 3 : VehicleType();
				  break;
			default : trucks1();
				  break;
		}
    }
    static void Trucks() {
	int x=0;
	if(x==0) {
	System.out.println("Trucks are rented out for a day to a 30 days at max");
	System.out.println("Choose a truck for your needs");
	x=1;
	}
	System.out.println("Available Trucks near "+place);
	System.out.println("1.Tata Ace");
	System.out.println("2.Mahindra");
	System.out.println("3.Ashok leyland");
	int a = sc.nextInt();
	switch(a) {
		case 1 :{
			 System.out.println("Vehicle Type : 3 wheeler");
			 System.out.println("Load Capacity : 0.5 - 1 ton");
			 System.out.println("Price : 1500 per day");
			 System.out.println("1.Proceed to book this Truck");
			 System.out.println("2.Go back and choose another Truck");
			 System.out.println("3.Main Menu");
			 int z = sc.nextInt();
			 	switch(z) {
			 		case 1 : break;
			 		case 2 : Trucks();
				 		 break;
					case 3 : VehicleType();
						 break;
					default : trucks1();
						   break;
		         	}
			 System.out.println("How many days do you want to rent the truck for");
	        		int d = sc.nextInt();
				days=d;
					if(d>=1 && d<=30) {
						price(549*d);
							System.out.println("This is your price for the selected duration : "+price);
							System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
							System.out.println("How would you like to pay?");
                					selectpayment();
					}
					else if(d<1) {
						System.out.println("Our vehicles are only given out for atleast one day");
						trucks2();
	      				}
					else {
						System.out.println("We rent our vehicles for a maximum of 30 days");
						trucks2();
					}
			 }
			 break;
		case 2 : {
			 System.out.println("Vehicle Type : 4 wheeler");
			 System.out.println("Load Capacity : 1 - 3 tons");
			 System.out.println("Price : 2500 per day");
			 System.out.println("1.Proceed to book this Truck");
			 System.out.println("2.Go back and choose another Truck");
			 System.out.println("3.Main Menu");
			 int z = sc.nextInt();
			 	switch(z) {
			 		case 1 : break;
			 		case 2 : Trucks();
				 		 break;
					case 3 : VehicleType();
						 break;
					default : trucks1();
						   break;
		         	}
			 System.out.println("How many days do you want to rent the truck for");
	        		int d = sc.nextInt();
				days=d;
					if(d>=1 && d<=30) {
						price(549*d);
							System.out.println("This is your price for the selected duration : "+price);
							System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
							System.out.println("How would you like to pay?");
                					selectpayment();
					}
					else if(d<1) {
						System.out.println("Our vehicles are only given out for atleast one day");
						trucks2();
	      				}
					else {
						System.out.println("We rent our vehicles for a maximum of 30 days");
						trucks2();
					}
			 }
			 break;
		case 3 : {
			 System.out.println("Vehicle Type : 4 wheeler");
			 System.out.println("Load Capacity : 4 - 5 tons");
			 System.out.println("Price : 3250 per day");
			 System.out.println("1.Proceed to book this Truck");
			 System.out.println("2.Go back and choose another Truck");
			 System.out.println("3.Main Menu");
			 int z = sc.nextInt();
			 	switch(z) {
			 		case 1 : break;
			 		case 2 : Trucks();
				 		 break;
					case 3 : VehicleType();
						 break;
					default : trucks1();
						   break;
		         	}
			System.out.println("How many days do you want to rent the truck for");
	        		int d = sc.nextInt();
				days=d;
					if(d>=1 && d<=30) {
						price(549*d);
							System.out.println("This is your price for the selected duration : "+price);
							System.out.println("This is just the estimated price, the final price is calculated depending upon the vehicle's condition upon it's return");
							System.out.println("How would you like to pay?");
                					selectpayment();
					}
					else if(d<1) {
						System.out.println("Our vehicles are only given out for atleast one day");
						trucks2();
	      				}
					else {
						System.out.println("We rent our vehicles for a maximum of 30 days");
						trucks2();
					}
			 }
			 break;
		default : 	System.out.println(red);
				System.out.println("Something went wrong please select a truck");
				System.out.println(def);
		Trucks();
	}
    }
    
}
class Payments {
	static String def = "\u001B[0m";
    
   static String red = "\u001B[31m";
     static String green = "\u001B[32m";
     static String yellow = "\u001B[33m";
     static String blue = "\u001B[34m";
     static String purple = "\u001B[35m";
     static String skblue = "\u001B[36m";
     static String cyan="\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    static float price=0;
    static float wallet_balance=0;
    static String name;
    static int amount =0;
    static int amy=0;
    static void selectpayment() {
        System.out.println(yellow+"Choose  \n1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet"+def);
        int t = sc.nextInt();
        payment(t);
    }

static void payment1() {
	System.out.println("1. Would you like to continue\n2. Go back and choose any other payment method ");
	  int u = sc.nextInt();
                if (u == 1) {
                    System.out.println("Redirecting to Phonepe");
                    Upi(100);
                } else if(u==2){
                    System.out.println("Choose a Payment method \n1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet");
                    int t = sc.nextInt();
                    payment(t);
                }
		else {
		    System.out.println("Please select a valid option");
		    payment1();
		}
}
    static void payment(int a) {
        switch (a) {
            case (1): {
                System.out.println("1. Would you like to continue\n2. Go back and choose any other payment method ");
                int u = sc.nextInt();
                if (u == 1) {
		    System.out.println("Please pay "+price+" during vehicle pickup");
		    pickup();
		    ending();
                    System.out.println("Thank you for choosing our service");
                } else {
                    System.out.println("Choose a Payment method \n1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet");
                    int t = sc.nextInt();
                    payment(t);
                }
                break;
            }
            case (2): {
                System.out.println("1. Would you like to continue\n2. Go back and choose any other payment method ");
                int u = sc.nextInt();
                if (u == 1) {
                    System.out.println("Redirecting to Phonepe");
                    Upi(100);
                } else if(u==2){
                    System.out.println("Choose a Payment method \n1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet");
                    int t = sc.nextInt();
                    payment(t);
                }
		else {
	            System.out.println(red);
		    System.out.println("Please select a valid option");
		    System.out.println(def);
		    payment1();
		}
                break;
            }
            case (3): {
                System.out.println("1. Would you like to continue\n2. Go back and choose any other payment method ");
                int u = sc.nextInt();
                  if (u == 1) {
                    System.out.println("Redirecting to Phonepe");
                    Upi(100);
                } else if(u==2){
                    System.out.println("Choose a Payment method \n1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet");
                    int t = sc.nextInt();
                    payment(t);
                }
		else {
		    System.out.println(red);
		    System.out.println("Please select a valid option");
		    System.out.println(def);
		    payment1();
		}
                break;
            }
            case (4): {
                System.out.println("1. Would you like to continue\n2. Go back and choose any other payment method ");
                int u = sc.nextInt();
                if (u == 1) {
                    System.out.println("Redirecting to Phonepe");
                    Upi(100);
                } else if(u==2){
                    System.out.println("Choose a Payment method \n1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet");
                    int t = sc.nextInt();
                    payment(t);
                }
		else {
		    System.out.println(red);
		    System.out.println("Please select a valid option");
		    System.out.println(def);
		    payment1();
		}
                break;
            }
            case (5): {
                System.out.println("Sorry, You've Not Have Sufficient Amount to Complete this transaction. Please Recharge your wallet");
                System.out.println("1. Would you like to continue\n2. Go back and choose any other payment method ");
                int u = sc.nextInt();
                if (u == 1) {
                    System.out.println("Welcome to Wander wallet");
                    Amountcomfrm();
                } else if(u==2){
                    System.out.println("Choose a Payment method \n1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet");
                    int t = sc.nextInt();
                    payment(t);
                }
		else {
		    System.out.println(red);
		    System.out.println("Please select a valid option");
		    System.out.println(def);
		    payment1();
		}
                break;
            }
            default: {
		System.out.print(red);
                System.out.println("Oops!!, please Choose a Payment method");
		System.out.print(def);
		System.out.println("1.Cash \n2.Phonepe \n3.Googlepay \n4.Paytm \n5.Wallet");
                int t = sc.nextInt();
                payment(t);
                break;
            }
        }
    }

    static void Upi(int am) {
        System.out.println("Enter your UPI PIN");
        System.out.print("Please enter your 4-digit UPI PIN here: ");
        int y = sc.nextInt();
        if (y >= 1111 && y <= 9999) {
	    verifyotp1();
            System.out.println("your payment of "+price+" is successful");
            System.out.println("Thank you for choosing our services");
	    pickup();
	    ending();
	    System.exit(0);
        } else {
            System.out.println("Please enter correct UPI id");
            Upi(100);
        }
    }

    static void Amountcomfrm() {
        System.out.println("Minimum amount for Recharge is 100rs");
        System.out.print("Please Enter the Amount would you like to recharge here: ");
        int am = sc.nextInt();
        if (am >= 100) {
        System.out.println("Please enter your mode payment for recharging the wallet");
        System.out.println("1. Phonepe\n2. Googlepay\n3. Paytm");
        int u = sc.nextInt();
        switch (u) {
            case (1): {
                System.out.println("Redirecting to Phonepe");
                upi1(am);
                break;
            }
            case (2): {
                System.out.println("Redirecting to Googlepay");
                upi1(am);
                break;
            }
            case (3): {
                System.out.println("Redirecting to Paytm");
                upi1(am);
                break;
            }
            default: {
                Amountcomfrm();
                break;
            }
        }
        } else {
            Amountcomfrm();
        }
    }
    
static void recur() {
	System.out.println("1.Continue to recharge wallet");
	System.out.println("2.Choose another payment method");
	int p = sc.nextInt();
		switch(p) {
			case 1 : Amountcomfrm();
				break;
			case 2 : selectpayment();
				break;
			default : recur();
				  break;
		}
}
						
    static void upi1(int amy) {
	amount=amy;
	System.out.println("Enter your UPI PIN");
        System.out.print("Please enter your 4-digit UPI PIN here: ");
	 int z = sc.nextInt();
         if (z >= 1111 && z <= 9999) {
	    verifyotp1();
            System.out.println("your wallet recharge of "+amy+" is successful");
	    	wallet_balance=wallet_balance+amy;
            System.out.println("1.Continue to pay through wallet?");
	    System.out.println("2.choose another payment method");
	    int a = sc.nextInt();
	    switch(a) {
		case 1 : System.out.print("Enter your 4-digit UPI PIN to pay : ");
			  int y = sc.nextInt();
        			if (y >= 1111 && y <= 9999) {
					if(wallet_balance>price){
						verifyotp1();
            					System.out.println("your payment of "+price+" is successful");
						pickup();
            					System.out.println("Thank you for choosing our services");
	    					ending();
					}else {
						System.out.println("Your wallet still doesnt have enough money to pay please recharge, you are short of "+(price-wallet_balance)+" rupees ");
						System.out.println("1.Continue to recharge wallet");
						System.out.println("2.Choose another payment method");
						int p = sc.nextInt();
						switch(p) {
							case 1 : Amountcomfrm();
								 break;
							case 2 : selectpayment();
								 break;
							default : recur();
						}
					}
        			} else {
            				System.out.println("Please enter correct UPI id");
            				upi1(amy);
        			}
				break;
		case 2 : selectpayment();
			 break;
		default : selectpayment();
			  break;
	    }
        } 
}
 
    static int checkDigits(long n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    static void Cvv() {
        System.out.println("Enter your 3-Digits CVV here: ");
        int c = sc.nextInt();
        if (checkDigits(c) == 3) {
        System.out.print("An OTP is sent to the mobile number associated with you bank");
	otp1();
        } else {
	    System.out.println(red);
            System.out.println("Invalid CVV");
	    System.out.println(def);
	    Cvv();
        } 
    }

    static void Exp() {
        System.out.print("Enter your card Expiry as MMYY here: ");
        int p = sc.nextInt();
        if (checkDigits(p) == 4) {
            Cvv();
        } else {
            Exp();
        }
    }

    static void Card() {
        System.out.println("Enter you 16 digits Creditcard/Debitcard Number here: ");
        long num = sc.nextLong();
        if (checkDigits(num) == 16) {
            Exp();
        } else {
            Card();
        }
    }
    static void wallet() {
	
    }
    static void walletRecharge() {
        System.out.println("Please enter your mode payment for recharging the wallet");
        System.out.println("1. Phonepe\n2. Googlepay\n3. Paytm");
        int u = sc.nextInt();
        switch (u) {
            case (1): {
                System.out.println("Redirecting to Phonepe");
                Upi(100);
                break;
            }
            case (2): {
                System.out.println("Redirecting to Googlepay");
                Upi(100);
                break;
            }
            case (3): {
                System.out.println("Redirecting to Paytm");
                Upi(100);
                break;
            }
            default: {
                walletRecharge();
                break;
            }
        }
    }
        static void otp1() {
	int otp = (int) (Math.random() * 1000000);
	System.out.println("Generated ONE TIME PASSWORD : "+otp);
	System.out.print("Please enter the one time password sent to the phone number associated with the card : ");
	int checkotp = sc.nextInt();
	   if (checkotp == otp) {
	    verifyotp2();
        } else {
            System.out.println("Invalid OTP");
            System.out.println("A new OTP is sent to your mobile number");
            otp();
        }
	}
	
    static void otp() {
        int otp = (int) (Math.random() * 1000000);
        System.out.println("Generated ONE TIME PASSWORD: " + otp);
        System.out.print("Please enter the one time password sent to your mobile number :");
        int checkotp = sc.nextInt();
        if (checkotp == otp) {
	    verifyotp();
	    System.out.println(green);
            System.out.println("		Login successful!!!!");
	    System.out.println(def);
	    System.out.print("Please give us your name : ");
	    String s = sc.next();
	    name=s;
	    System.out.println("Hello "+s+" we are so glad to have you on board");
            Methods.location();
        } else {
	    System.out.println(red);
            System.out.println("Invalid OTP");
	    System.out.println(def);
            System.out.println("A new OTP is sent to your mobile number");
            otp();
        }
    }

    static void price(float a)
   {
       price=a;  
   }
	static void pickup() {
		System.out.println("Please pickup the vehicle near "+Methods.place+" metro station");
		System.out.println("Please return the vehcile after "+Methods.days+" days");
		System.out.println("Please drive responsibly");
	}
	static void verifyotp() {
        	System.out.print("		VERIFYING OTP");
		for(int i=0; i<=3; i++) {
		try{
	 		Thread.sleep(1500);
			System.out.print(". ");
		}
		catch(InterruptedException e){
		}
		}
		System.out.println();
		System.out.println(green);
		System.out.println("		OTP verified Successfully");
		System.out.println(def);
	}
	static void verifyotp1() {
        	System.out.print("		verifying UPI pin");
		for(int i=0; i<=3; i++) {
		try{
	 		Thread.sleep(1500);
			System.out.print(". ");
		}
		catch(InterruptedException e){
		}
		}
		System.out.println();
		System.out.println("		Transaction Successful");
	}
	static void verifyotp2() {
        	System.out.print("Please wait");
		for(int i=0; i<=3; i++) {
		try{
	 		Thread.sleep(1500);
			System.out.print(". ");
		}
		catch(InterruptedException e){
		}
		}
		System.out.println();
		System.out.println("Authentication Succcessful");
	}
	static void ending() {
		System.out.println("1.Main Menu");
		System.out.println("2.Exit");
		int a = sc.nextInt();
		switch(a) {
			case 1 : Methods.VehicleType();
				 break;
			case 2 : System.exit(0);
				  break;
			default : ending();
				  break;
		}
	}
}

class Main extends Methods {
    public static void main(String[] args) {
	Main obj = new Main();
	    String def = "\u001B[0m";
    
    String red = "\u001B[31m";
     String green = "\u001B[32m";
     String yellow = "\u001B[33m";
     String blue = "\u001B[34m";
     String purple = "\u001B[35m";
     String skblue = "\u001B[36m";
     String cyan="\u001B[36m";



        System.out.println();
        System.out.print(yellow);
        System.out.print("\u001B[7m");	
        System.out.println("                                                                                                                                  ");
        System.out.println("              ******************                  Welcome to Wanderlust Wheels             *******************                    ");
        System.out.println("                                                                                                                                  ");
	System.out.print(def);
        System.out.println();

        System.out.print("Enter your 10-digit mobile number to login : ");
	login(sc.nextLong());
    }
}