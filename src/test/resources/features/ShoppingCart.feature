Feature: Check that it's possible to add product to the cart
  As a e-shop customer
  I want to be buy any product that is available in the e-shop, so I need properly working function of adding products to the shopping cart

  Background:
    Given I am on demoshop24 homepage to test Shopping Cart

  Scenario: By clicking on any product customer is able to add item to the shopping cart
    When Customer clicks on the Laptops and Notebooks category in the web page navigation bar using PO
    And Customer clicks on Show All Laptops and Notebooks link in the dropdown menu using PO
    Then Customer clicks on ADD TO CART button for MacBook Pro product using PO
    Then Customer clicks on the Shopping Cart button in the web page header using PO
#    And Customer clicks on the View Cart link in dropdown menu using PO
    Then Selected product is successfully added to Shopping Cart with correct items quantity using PO