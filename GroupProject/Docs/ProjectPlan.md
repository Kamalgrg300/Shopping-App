Project Plan (ProjectPlan.md)

Author: Jesrhythm Kaur and Benjamin Ng

1 Introduction

The Flooring Inventory App is a mobile application designed to help
manage the inventory of the flooring company.

2 Process Description

**Splash Screen Activity:**

-   User clicks on the app icon and app logo pops up

 **Home Screen Activity:**

-   This activity welcomes the User and lets the user select the option
    > of being an Employee or being a customer.

-   Entrance Criteria: Once the user enters from the Splash Screen
    > activity, this activity pops up.

-   Exit Criteria: Activity runs as intended until the user selects the
    > option of being an employee or being a customer.

**Employee Login Activity:**

-   Entrance Criteria: Once the user clicks the "I am an Employee
    > Button", this activity pops up.

-   In this activity, the user (employee) enters their employee id and
    > password in order to login to the app.

-   There is an option of going back to the Home Screen activity if the
    > user presses the back button.

-   There is another option for the user if they forgot their password.
    > They can click on forgot password button which will allow them to
    > reset password.

-   Exit Criteria: Activity runs as intended until the users enter
    > their information and presses the sign in button.

 **Customer Login Activity:**

-   Entrance Criteria: Once the user clicks the "I am a Customer
    > Button", this activity pops up.

-   In this activity, the user (customer) enters their email id and
    > password in order to login to the app.

-   There is an option of going back to the Home Screen activity if the
    > user presses the back button.

-   There is another option for the user if they forgot their password.
    > They can click on forgot password button which will allow them to
    > reset password.

-   One additional option in this activity is to Create an account if
    > this option is clicked then the user gets redirected to the Create
    > an Account Activity

-   Exit Criteria: Activity runs as intended until the users enter
    > their information and presses the sign in button.

**Create an Account Activity:**

The user fills out their personal information to create an
account.

-   Entrance Criteria: The user clicks on "Create an account" from the
    > customer login button.

-   Exit Criteria: After the user enters their information that's
    > required and presses the "Sign up" button, it will bring them to
    > the customer dashboard page. Pressing the back button will return
    > to the customer login page.

**Forgot Password Activity:**

-   Entrance Criteria: The user enters their registered email to
    > receive a password reset link.

> The user clicks the "Forgot password" button from either the employee
> login page or the customer login page.

-   Exit Criteria: The user enters their email address and presses the
    > "Send reset link" button. After clicking the reset link, the user
    > is redirected to a page informing them that their password reset
    > link has been sent to the corresponding email.

> If the user presses the back button, they will return back to the
> login page.

**Category Selection Activity:**



-   Entrance Criteria: The user is greeted with options to pick a tile,
    > stone, wood, laminate or vinyl.

-   Exit Criteria: Activity will run as intended until user selects one
    > of the categories, which will redirect them to the subcategory
    > selection activity.

**Subcategory Selection Activity:**

Based on the user's choice from the category selection page, the user
is now presented with subcategories to choose from such as laminate
types for tile, materials for stone, and wood type/species for
wood.

-   Entrance Criteria: The user selects a category from the category
    > selection list.

-   Exit Criteria: Activity will run as intended until the user selects
    > a subcategory which will transition to the product listing
    > page.

**Product Listing Activity:**

The user is presented with a list of products based on their chosen
category and subcategory. They can browse through the products and add
them to the cart or view more details about the specific
product.

-   Entrance Criteria: The user selects a subcategory from the
    > subcategory selection page.

-   Exit Criteria: Activity will run as intended until the user either
    > adds a product to their cart, views a more detailed description of
    > the product, or navigates to another page.

**Product Search Activity:**

The user can search for products by entering the product name or
keyword in the search bar.

-   Entrance Criteria: The user can access this page from the homepage
    > or any other page where a search bar is available.

-   There is also an option to go back to previous activity.

-   Exit Criteria: The activity will run as intended until the user
    > enters a search query which will present them with the search
    > results, which can be interacted with similarly to the product
    > listing page.

**Cart Page Activity:**

The user can view their selected products in the cart. They're also
given the option to update the quantities, remove items, or proceed to
checkout.

-   Entrance Criteria: The user will access this page by clicking on
    > the cart icon/logo from any page where the cart icon is
    > available.

-   Exit Criteria: The activity will run as intended until the user
    > decides to either checkout, remove items, update quantities, or
    > navigate back to another page.

**Tile Activity:**

The user can pick a tile by clicking on any of the buttons which will
then show the tile products according to their pick.

-   Entrance Criteria: The user will access this page by clicking on
    > the tile option from Subcategory Selection Activity.

-   Exit Criteria: The activity will run as intended until the user
    > decides to pick a tile type. After the tile type is picked the
    > page redirects to Product Listing Activity.

**Stone Activity:**

The user can pick a stone by clicking on any of the buttons which will
then show the stone products according to their pick.

-   Entrance Criteria: The user will access this page by clicking on
    > the stone option from Subcategory Selection Activity.

-   Exit Criteria: The activity will run as intended until the user
    > decides to pick a stone type. After the stone type is picked the
    > page redirects to Product Listing Activity.

**Wood Activity:**

The user picks a type and species from the wood activity

-   Entrance Criteria: The user will access this page by clicking on
    > the Wood option from Subcategory Selection Activity.

-   Both the wood type and wood species are seen as dropdown but they
    > are still labeled in as an activity.

-   Exit Criteria: The activity will run as intended until the user
    > decides to pick a wood type and stone type. After the stone type
    > and wood type is picked the page redirects to Product Listing
    > Activity.

**Laminate Activity:**

The user can pick a laminate by clicking on any of the buttons which
will then show the laminate products according to their pick.

-   Entrance Criteria: The user will access this page by clicking on
    > the laminate option from Subcategory Selection Activity.

-   Exit Criteria: The activity will run as intended until the user
    > decides to pick a laminate type. After the laminate type is picked
    > the page redirects to Product Listing Activity.

**Vinyl Activity:**

The user can pick a stone by clicking on any of the buttons which will
then show the vinyl products according to their pick.

-   Entrance Criteria: The user will access this page by clicking on
    > the vinyl option from Subcategory Selection Activity.

-   Exit Criteria: The activity will run as intended until the user
    > decides to pick a vinyl type. After the vinyl type is picked the
    > page redirects to Product Listing Activity.

**Wood Type Activity:**

The user can pick a wood type by clicking on any of the buttons which
will then show the wood types.

-   Entrance Criteria: The user will access this page by clicking on
    > the stone option from Wood Activity.

-   Exit Criteria: The activity will run as intended until the user
    > decides to pick a wood type. After the wood type is picked the
    > page redirects back to Wood Activity.

**Wood Species Activity:**

The user can pick a wood species by clicking on any of the buttons
which will then show the wood species.

-   Entrance Criteria: The user will access this page by clicking on
    > the wood option from Wood Activity.

-   Exit Criteria: The activity will run as intended until the user
    > decides to pick a wood species. After the wood species is picked
    > the page redirects back to Wood Activity.

3 Team

Team Members: Jesrhythm Kaur, Benjamin Ng, Kamal Gurung, Daniel Culbert
,Zhiyu Zhang, Abdul Mohammed

Project Manager:

Discovers and conveys the necessary features to the team for
development

Keeps track of deadlines

Submits the necessary files

Design Team:

Works on how the app is designed and if the app is appealing to the
eye. The mockup design of the app is in this.

Dev Team:

Writes the app\'s code and builds the product\'s inner architecture to
meet functional requirements

QA/Testing Team:

Tests the entire app and decides whether the product is ready to be
presented to the customer or delivered to the market

Anything that does not work will be mentioned to the specified
team

  1. Project Manager- Jesrhythm Kaur
  2. Design Team- Benjamin Ng, Jesrhythm Kaur
  3. Dev Team- Daniel Culbert, Abdul Mohammed
  4. QA/ Testing Team- Kamal Gurung, Zhiyu Zhang
  
