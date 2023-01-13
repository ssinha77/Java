package AbstractClass;

public class Solution {
	  
		        public static void main(String[] args) {  
		              
		             Animal animal = new Animal();  
		             animal.eat();  
		             animal.sleep();
		             
		             Bird bird = new Bird();  
		             bird.eat();  
		             bird.sleep();  
		             bird.fly(); 
		             
		             WildAnimal wildanimal= new WildAnimal();
		             wildanimal.eat();
		             wildanimal.sleep();
		             wildanimal.kill();
		             
		             Animal animal1 = new Bird();
		             animal1.eat();
		             animal1.sleep();

		             Animal animal2 = new WildAnimal();
		             animal2.sleep();
		             animal2.eat();
		             
		        }  
		   }    

