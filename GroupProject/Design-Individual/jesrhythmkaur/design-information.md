1. This application is designed to provide users with information on various types of flooring available in stores. Users can search for products using a hierarchical list or by typing the product's name. Employees can add, edit or delete products from the database.

2. This application is designed to provide users with information on various types of flooring available in stores. Users can search for products using a hierarchical list or by typing the product's name. Employees can add, edit or delete products from the database.

3.The Product class is an abstract class that represents a flooring product. It contains common attributes such as color, size, brand, type, and price. It also has a getProductInfo() method that returns a string representation of the product's information.

4.The TileProduct class extends the Product class and represents a tile flooring product. It has a material attribute that can be porcelain, ceramic, or resin.

5.The StoneProduct class extends the Product class and represents a stone flooring product. It has a material attribute that can be marble, pebble, or slate.

6.The WoodProduct class extends the Product class and represents a wood flooring product. It has a type attribute that can be solid, engineered, bamboo, or other, and a species attribute that can be oak, hickory, maple, or other.

7.The LaminateProduct class extends the Product class and represents a laminate flooring product. It has a water_resistant attribute that can be True or False.

8.The VinylProduct class extends the Product class and represents a vinyl flooring product. It has a waterproof attribute that can be True or False.

9.The Category class represents a flooring category such as tile, stone, wood, laminate, or vinyl. It has a name attribute and a list of products. It also has a getProducts() method that returns a list of products in the category.

10.Users must be able to search for products by picking from a hierarchical list, where the
first level is the floor category, and the second level is the floor type.
