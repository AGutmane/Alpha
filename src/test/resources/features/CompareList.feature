Feature: Product addition to Compare list

  As a e-shop customer
  I want to add product from Product page to Compare list

  Background:
    Given I am on demoshop24 homepage

    Scenario: Add first product to Compare list
      When I navigate to Desktops category on menu using PO
      And click on Show All Desktops using PO
      And click on Apple Cinema on product list page using PO
      And click on Compare this Product button using PO
      And I see Success message using PO
      And I navigate to Laptops category on menu using PO
      And click on Show All Laptops using PO
      And click on HP in product list page using PO
      And click on Compare this Product button using PO
      And I see Success message using PO
      And I click on Product comparison link using PO
      Then I see Apple Cinema in Product Comparison page using PO
      And I see HP in Product Comparison page using PO


