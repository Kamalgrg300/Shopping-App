1. As a user of the system I want to be able to see each store's offering and the amount of
product in stock by square feet

The store class has a linked list containing what floors are available, along with the amount in inventory.
Store class has getInventory() function that outputs a String detailing the floor names and how many are available.

2. The application must allow employees to add new products to the system. As well as
delete and edit them.

Functions in the store class are created to be able to edit the store's linkedList containing offerings and inventory info.
Employees can edit, delete, and and products to the list.

3. The different categories of floors available are tile, stone, wood, laminate and vinyl

Accounted for via subclasses of category.

4. The application must contain a database (DB) of floors.

All possible floor types could easily be saved in an array, since the amount of possible combinations are finite.
A store's database/inventory of what floors they have was addressed earlier.

5. Users must be able to search for products by picking from a hierarchical list, where the
first level is the floor category, and the second level is the floor type.

The store class has a function that allows users to search for floors, prioritizing category and type. Function returns a list of floors matching their preferences.

6. Users must also be able to specify an item by typing its name (search functionality)
Function added to store class that allows users to search by name. Returns floor, where the user can see all of its attributes.


7. All floors regardless of their category have an associated color, size, brand, type and
price

These attributes were made present in the floor class.

8. Categories tile and stone have different materials they are made of, e.g. Tile - porcelain,
ceramic, resin; Stone - marble, pebble, slate

These attributes were added to the stone and tile classes.
The constructors for tile and stone will limit material type to porcelain, ceramic, resin and marble, pebble, slate respectively.

9. Wood floors have both a type (solid, engineered, bamboo, etc) and species (oak,
hickory, maple, etc.)

These attributes were added to the stone and tile classes. Species and type are implied to have no restrictions due to the presence of "etc" in the instructions.

10. Laminate can be regular laminate or water resistant, whereas vinyl can be water
resistant or waterproof

Laminate class has accounted for this requirement. Constructors will limit laminate's regularOrWaterResistant to "regular" or "water resistant".
Vinyl's attribute also accounts for this, where waterResistantOrWaterProof will be limited to either "water resistant" or "water proof" through constructors.

11. The User Interface (UI) must be intuitive and responsive.
Functions for users to find products and employees to edit inventory/stock will be made as simply as possible.