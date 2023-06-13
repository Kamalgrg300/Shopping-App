                                        Use Case Model

Author: Abdul Mohammed and Daniel Culbert

1 Use Case Diagram

*UML use case diagram link:*
https://drive.google.com/file/d/1Zz8_8e21o-crv-joNxm671h4hZ3ADkdZ/view?usp=sharing

*Register / Sign up
Requirements: This use case allows the user to register and create an account on the system as a customer or an employee. This use case also validates for already used Emails or UserIDs.

Pre-conditions:
The user must select either “I am an employee” or “I am a customer” before the Register activity.

Post-conditions:
The system should ask the user for their Email / UserID and password.
The system must display an error if the user entered an Email / UserID that is already in use.

Scenarios:
Normal: The user selects either “I am an employee” or “I am a customer” and enters their Email / UserID and password and if the user enters a unique email and a password, the user is signed up.
Exceptional: The user selects either “I am an employee” or “I am a customer” and enters their Email / UserID and password and if the user enters an email that is already in use or an invalid email then the system displays an error.*


*Login
Requirements: This use case allows the User to log in as a customer or an employee by typing in either their Email (customer) or UserID (employee) and their password. After entering the details the system verifies the Email / UserID and the password. The system also has the option to reset the user’s password by clicking on “Forgot Password”

Pre-conditions: 
The User must be registered as either a customer or an employee.
The User must select either “I am an employee” or “I am a customer”

Post-conditions:
        	No post-conditions need to be true.
          
Scenarios: 
Normal: The user enters their details and the system logs them in.
Alternative: The user clicks “Forgot Password” to reset their password.
Alternative: The user clicks “Sign up” and the system takes them to the Register Activity.
Exceptional: The user either entered the wrong Email/ UserID or password.*


*View Cart
Requirements: This use case allows the user to open the cart activity and view and delete the items added to the cart.

Pre-conditions:
1)      The user must be registered or signed up.
2)      The user must be logged in.

Post-conditions:
1)      The page must be changed from the previous Activity to the Cart Activity.
2)      The user must be able to view all the products added to the cart.
3)      The user must be able to delete every product added to the cart.
4)      The user must be able to increase and decrease the quantity of the product in the cart.

Scenarios:
Normal scenario: The user can view the cart activity and then choose to remove the respective item from the user’s cart.
Alternative scenario: The user can view the cart activity and then choose to update the count of the respective item from the user’s cart.*


*Add Product
Requirements: This use case allows the Employee to add products to the product inventory by picking a floor category. After picking the floor category the user can select the material, type, and species or select if the category is regular or water-resistant or select if the category is water-resistant or waterproof.

Pre-conditions:
The user must be registered as an employee.
The user must be logged in as an employee.

Post-conditions:
  The Activity page must access the database inventory of products.
  The Activity page must ask the user to pick a floor category.
  The Activity page must ask the user to select the respective material, type, and species or specify if regular, water-resistant, and waterproof.
Scenarios:
Normal: The user must pick a floor category and then the system must ask the user to select the respective material, type, and species or specify if regular, water-resistant, and waterproof.*

*Delete Product

Requirements: Employees must be able to remove a specified product from their store’s inventory database.
Pre-conditions:
Employee has an account registered in the system and is logged in
Employee accesses the store’s the inventory in the app
Post-conditions:
Employees can remove product from a store’s inventory
The database is properly updated to reflect the product’s removal
Scenarios:
Normal: Employee logs into their account. They load the list containing the store’s inventory from the database. Employee clicks the trash icon next to a product, and it is removed from inventory.
Exceptional: Some error occurs with logging in or accessing the store’s inventory database. Handling has to be done by those specific systems.*

*Edit Product

Requirements: Employees must be able to edit the properties of a specified product from the store’s inventory database.

Pre-conditions:

Employee has an account registered in the system and is logged in
Employee accesses the store’s inventory on the app

Post-conditions:

Employees can edit properties of a specified product from the store’s inventory
The database is properly updated to reflect the employee’s changes to the specified product

Scenarios:

Normal: Employee logs into their account and loads the list containing the store’s inventory database. Employee clicks the “edit” button next to a product, enters the properties, and the database is updated.
Exceptional: Some error occurs with logging in or accessing the store’s inventory database. Handling has to be done by those specific systems.
Exceptional: Employee fails to enter all necessary fields for a product, or some information in the fields is invalid (eg. entering “white” as a wood species). This will cause the system to prompt the employee to enter the missing information, or fix the invalid information.*

*Search by Name

Requirements: Users should be able to find information regarding a product’s availability by searching for its name.

Pre-conditions:
User has an account and is logged into the system
User enters item name into the search bar

Post conditions:
Users can search for items within the store database
System displays stock amount and availability of specified item
Scenarios:
Normal: User logs in and enters text into the search bar. After clicking search, the item’s information is displayed.
Alternative: User logs in and enters text into the search bar. After clicking search, no results show due to the item not existing in the database. Send a toast indicating to the user that the item isn’t in the database.
Exceptional: User logs in and clicks the search button. Since no text was entered, display an error prompting the user to enter text into the search field.
Exceptional:  Some error occurs with logging in or accessing the store’s inventory database. Handling has to be done by those specific systems.*


* Add to Cart

Requirements: Users should be able to add items to their cart prior to checkout.

Pre-conditions:
User has an account and is logged in
User loads the store’s inventory
The item’s stock amount is >0

Post-conditions:
User can add an item to their cart from the store’s listings
System reflects the updated cart when users click “view cart”

Scenarios: 
Normal: User logs in and views the store’s offerings. When they see an item they want, they click the “add to cart” button. When they do so, the stock variable attached to the product is decreased by 1.
Exceptional: User logs in and views the store’s offerings. When clicking “add to cart” on an item they want, an error is produced if stock for that item = 0.
Exceptional: Some error occurs with logging in or accessing the store’s inventory database. Handling has to be done by those specific systems.*




