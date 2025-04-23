🛒 ECOMMERCE TEST AUTOMATION

Automated test suite for validating the core functionalities of an e-commerce platform using Selenium WebDriver with Java, JUnit, Maven, and GitHub for version control.
This project ensures a reliable and robust shopping experience by automating key user flows such as login, add-to-cart, and checkout, while maintaining code collaboration, history tracking, and CI readiness through GitHub.

 Features
 
 🔍 Page Object Model (POM) architecture
 
Code is cleanly modularized using POM — separating page logic (Pages/) from test logic (testcases/) for better maintainability.


🛒 Add to cart and cart verification

Tests ensure accurate item addition, cart update, and item count verification.


💳 Checkout flow automation

Automates the full purchase flow including form filling, navigation, and order confirmation.


🧪 JUnit-based test structure

Tests are written using JUnit 5 annotations for clean setup, execution, and teardown.


📂 Maven project structure

Follows Maven standards with clear separation of source and test directories; dependencies managed via pom.xml.


🖥️ Cross-browser support (Chrome, Firefox)

Tests are browser-independent and can be configured for multi-browser runs.




🧪 Detailed Test Case Descriptions


 1. Login Tests – (LoginTest.java)
    
Tests the login functionality of the site.

validLogin()

✅ Enters valid credentials (standard_user / secret_sauce) and checks whether the user is redirected to the inventory page by verifying the URL contains "inventory".


2. Cart Functionality Tests – (AddToCartTest.java)
   
Verifies the ability to add items to the cart.

addSingleItemToCart()

✅ Logs in with valid credentials.

✅ Adds the first product listed to the cart.

✅ Navigates to the cart and asserts that exactly one item is added (by checking the count of cart items).



3. Checkout Flow Tests – (CheckoutTest.java)

Covers the full checkout process from adding an item to completing the purchase.


checkoutOneItem()

✅ Logs in successfully.

✅ Adds the first product to the cart.

✅ Navigates to the cart and initiates checkout.

✅ Fills out the checkout form (First Name, Last Name, Postal Code).

✅ Proceeds through the checkout steps and finishes the order.

✅ Confirms that the final URL contains "checkout-complete" to ensure order completion.


Project Structure: 


EcommerceAutomation/

├── src/

│   └── test/java/

│       ├── Pages/           # Page Object Models (LoginPage, ProductPage, CartPage)

│       ├── testcases/       # JUnit Test classes (LoginTest, AddToCartTest, CheckoutTest)

│       └── utils/           # Utility classes (e.g., BrowserSetup)

├── pom.xml                  # Maven dependency and build configuration




