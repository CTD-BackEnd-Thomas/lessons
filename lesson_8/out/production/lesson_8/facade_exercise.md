Backend I  
# Facade Pattern  
Objective  
Make the UML diagram and program in Java, implementing the Facade pattern according to the following statement:  

## Statement

Suppose we have to program a discount calculation system in a supermarket.
There are cumulative discounts (percentages are added together) according to:  

By card: if it is from Star Bank, you get an extra 20% discount.  
By product type: cans get a 10% discount.  
By quantity: if you buy more than 12, the discount is 15%.  

Each discount policy is implemented in a different API:  
ApiCard: int discount(Card)  
ApiProduct: int discount(Product)  
ApiQuantity: int discount(quantity)  

Therefore, you will implement a facade that allows you to expose the high-level discount calculation using the different APIs.  

You must also model the classes:  
Product: name and type String  
Card: number String and bank String  

Using the Facade pattern, we want to create a facade that allows you to simplify the discount calculation with product, card and quantity as parameters.  
Generate test cases as needed to ensure the quality of the calculateDiscount() method.  
Enjoy your studies!  