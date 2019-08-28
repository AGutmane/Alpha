Feature: Product page contains all information

  As a e-shop customer
  I want to see all information about product on Product page

  Background:
    Given I am on demoshop24 homepage

  Scenario: Checking that product page contains all information by main menu
    When I navigate to Desktops category on menu using PO
    And click on Show All Desktops using PO
    And click on Apple Cinema 30 on product list page using PO
    Then product name is displayed using PO
    And description tab is displayed using PO
    And Specification tab is displayed using PO
    And Review tab is displayed using PO
    And Available option menu is displayed using PO
    And price is displayed using PO
    And image is displayed using PO
