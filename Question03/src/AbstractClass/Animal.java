package AbstractClass;

public class Animal {
	  
	    void eat() {  
	            System.out.println("Animal is eating");  
	       }  
	        void sleep() {  
	             System.out.println("Animal is sleeping");  
	      }  
	   }  
  class Bird extends Animal {  
	        @Override  
	       void eat() {  
	            System.out.println("Bird is eating");  
	        }  
	        @Override  
	       void sleep() {  
	            System.out.println("Bird is sleeping");  
	        }  
	        void fly() {  
	            System.out.println("Bird is flying");  
	        }  
	   }  
  class WildAnimal extends Animal {    
	  @Override  
      void eat() {  
           System.out.println("WildAnimal is eating");  
       }  
       @Override  
      void sleep() {  
           System.out.println("WildAnimal is sleeping");  
       }  
	  void kill() {
		  System.out.println("WildAnimal kills");
	  }
  }
