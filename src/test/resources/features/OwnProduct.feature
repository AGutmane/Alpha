Feature: Each product has own product page
  As a e-shop customer
  I want to be able to open each product own page

  Background:
    Given I am on demoshop24 homepage

  Scenario: Customer clicking on the products is redirected to the product own page
    When I click on the Desktops category in the web page navigation bar using PO
    And I click on Mac link in the dropdown menu using PO
    Then I click on iMac product item that appeared in the category using PO
    And Selected product is opened on the own page using PO

