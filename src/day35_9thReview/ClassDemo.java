package day35_9thReview;

public class ClassDemo {
	public static void main(String[] args) {
		
		 Car car1 = new Car(); // create object/instance of Car class
	        car1.doors = 5;
	        car1.wheel = 4;
	        car1.make = "civic";
	        
	        System.out.println(car1.doors);
	        System.out.println(car1.wheel);
	        System.out.println(car1.make);
	        
	        car1.started();
	        car1.stop();

	        
	        
	    }
	}
	    
	    class Car{
	        // field or instance variable or global variable
	        public int wheel;
	        private String color; // Access inside of class
	        protected String make; // Access within same package and subclass
	        int doors;
	        
	        // method or behavior of the class
	        void started() {
	            System.out.println("Car is started");
	        }
	        void run() {
	            System.out.println("Car is running");
	        }
	        void stop() {
	            System.out.println("Car is stopped");
	        }        
	        
	    }
