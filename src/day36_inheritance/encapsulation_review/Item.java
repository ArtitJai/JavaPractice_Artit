package day36_inheritance.encapsulation_review;

public class Item {

		/*
	     * Item Task create a class called Item private variables: name, unitPrice,
	     * quantity Encapsulate all the fields: Conditions: name can not be empty or
	     * blank name can not contain any special characters other than+ space name must
	     * start with letters unit price can not be negative quantity can not be
	     * negative if the Item name is toilet paper (case insensitive) then the
	     * quantity can not be more than 1 Add a constructor that allows user to set all
	     * the fields when the object is created. (If the arguments not valid it should
	     * not be set to the instances) instance methods: calcCost(): returns the total
	     * cost toString(): returns the name, unit price, quantity and total cost info
	     * as calculated by calcCost()
	     */

	    private String name;

	    private double unitPrice;

	    private int quantity;

	    // public constructor
	    public Item() {
	        this("icecream", 2.50, 1); // this(); // we are calling parameterized constructor
	    }

	    public Item(String name, double unitPrice, int quantity) {

//	        Conditions:
//	            name can not be empty or blank
//	            name can not contain any special characters other than+ space
//	            name must start with letters
//	            unit price can not be negative
//	            quantity can not be negative
//	            if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1
	//Add a constructor that allows user to set all the fields when the object is created.
//	            (If the arguments not valid it should not be set to the instances)
//	        
	        if (checkIfTheNameIsValid(name)) {
	            this.name = name;
	        }

	        if (unitPrice > 0) {
	            this.unitPrice = unitPrice;
	        }

	        if (quantity > 0) {
	            if (this.name != null) {
	                if (this.name.equalsIgnoreCase("toilet paper")) {
	                    this.quantity = 1;
	                } else {
	                    this.quantity = quantity;
	                }
	            }
	    
	        }

	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    public void setUnitPrice(double unitPrice) {
	        this.unitPrice = unitPrice;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public double calcCost() {
	        return unitPrice * quantity;
	    }

	    @Override
	    public String toString() {
	        return "Item [name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + " ,total Cost="+calcCost()+"]";
	    }

	    // instance method

	    private boolean checkIfTheNameIsValid(String str) {

	        boolean isNotEmpty = false;
	        boolean hasSpecialCharacter = false;
	        boolean startsWithLetter = false;
	        if (str.length() > 0) {
	            isNotEmpty = true;
	        }
	        startsWithLetter = Character.isLetter(str.charAt(0));
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c) && !Character.isLetter(c)) {
	                if (c != ' ') {
	                    hasSpecialCharacter = true;
	                }
	            }

	        }
	        return isNotEmpty && startsWithLetter && !hasSpecialCharacter;
	    }

	}
	

