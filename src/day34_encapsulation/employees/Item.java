package day34_encapsulation.employees;

public class Item {

	/*
     *      Item Task
            create a class called Item
                private variables:
                    name, unitPrice, quantity
                Encapsulate all the fields:
                    Conditions:
                        name can not be empty or blank
                        name can not contain any special characters other than space
                        name must start with letters
                        unit price can not be negative
                        quantity can not be negative
                        if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1
            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
                */
	
	   private String name;
	   private double unitPrice;
	   private int quantity;

	   public Item(String name, double unitPrice, int quantity) {
	      setName(name);
	      setUnitPrice(unitPrice);
	      setQuantity(quantity);
	   }

	   private boolean isContainSpecial(String name) {
	      for (int i = 0; i < name.length(); i++) {
	         if (!Character.isLetter(name.charAt(i))) return true;
	      }
	      return false;
	   }

	   private boolean isStartWithLetter(String name) {
	      return Character.isLetter(name.charAt(0));
	   }
	   public double calCost() {
	      return unitPrice * quantity;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      if (name.isEmpty()||name.isBlank()) System.out.println("Name cannot be empty or blank");
	      else if (!isStartWithLetter(name)) System.out.println("Name must start with letter");  
	      else if (isContainSpecial(name)) System.out.println("Name cannot contain special character");
	      else this.name = name;
	   }


	   public double getUnitPrice() {
	      return unitPrice;
	   }

	   public void setUnitPrice(double unitPrice) {
	      if (unitPrice < 0) {
	         System.out.println("Unit price cannot be negative");
	      } else this.unitPrice = unitPrice;
	   }

	   public int getQuantity() {
	      return quantity;
	   }

	   public void setQuantity(int quantity) {
	      if (quantity < 0) {
	         System.out.println("Quantity cannot be negative");
	      } else this.quantity = quantity;
	   }

	   @Override
	   public String toString() {
	      return "name='" + name + '\'' +
	                ", unitPrice=" + unitPrice +
	                ", quantity=" + quantity +
	                ", Total cost="+ calCost();
	   }
	}
	 
	