Feature: Check that it's possible to add product to the cart
  As a e-shop customer
  I want to be buy any product that is available in the e-shop, so I need properly working function of adding products to the shopping cart

  Background:
    Given I am on demoshop24 homepage to test Shopping Cart

  Scenario: By clicking on Add to Cart button from the selected category section customer is able to add item to the shopping cart
    When Customer clicks on the Laptops and Notebooks category in the web page navigation bar using PO
    And Customer clicks on Show All Laptops and Notebooks link in the dropdown menu using PO
    Then Customer clicks on ADD TO CART button for MacBook Pro product using PO
    And Customer clicks on the Shopping Cart button in the web page header using PO
    Then Selected product is successfully added to Shopping Cart with correct items quantity using PO

  Scenario: By clicking on Add to Cart button from the product own page customer is able to add item to the shopping cart
    When Customer clicks on the Components category in the web page navigation bar using PO
    And Customer clicks on Show All Components and Notebooks link in the dropdown menu using PO
    Then Customer clicks on the Monitors subcategory using PO
    And Customer choose Samsung SyncMaster BW product using PO
    Then Customer clicks on ADD TO CART button for Samsung SyncMaster BW in the product own page using PO
    And Customer clicks on the Shopping Cart button in the web page header using PO
    Then Selected product is successfully added to Shopping Cart from own page using PO

  Scenario: By clicking on Add to Cart button from the product own page and filling all additional options customer is able to add item to the shopping cart
    When Customer clicks on the Components category in the web page navigation bar using PO
    And Customer clicks on Show All Components and Notebooks link in the dropdown menu using PO
    Then Customer clicks on the Monitors subcategory using PO
    And Customer choose Apple Cinema product using PO
    Then Customer fills and necessary additional options using PO
    And Customer clicks on ADD TO CART button for Apple Cinema in the product own page using PO
    Then Customer clicks on the Shopping Cart button in the web page header using PO
    Then Apple Cinema is successfully added to Shopping Cart from own page using PO

