Feature: Each product has own product page
  As a e-shop customer
  I want to be able to open each product own page

  Background:
    Given I am on demoshop24 homepage

  Scenario: Click on the any product from Desktop category redirect to the product own page
    When I click on the Desktops category in the web page navigation bar using PO
    And I click on Mac link in the dropdown menu using PO
    Then I click on iMac product item that appeared in the category using PO
    And iMac product is opened on the own page using PO

  Scenario: Click on the any product from Laptops & Notebooks category redirect to the product own page
    When I click on the Laptops and Notebooks category in the web page navigation bar using PO
    And I click on Show All Laptops and Notebooks link in the dropdown menu using PO
    Then I click on MacBook Pro product item using PO
    And MacBook Pro product is opened on the own page using PO

  Scenario: Click on the any product from Components category redirect to the product own page
    When I click on the Components category in the web page navigation bar using PO
    And I click on Show All Components link in the dropdown menu using PO
    Then I click on Monitors subcategory using PO
    And I click on Apple Cinema product using PO
    Then Apple Cinema product is opened on the own page using PO

  Scenario: Click on the any product from Tablets category redirect to the product own page
    When I click on the Tablets category in the web page navigation bar using PO
    And I click on Samsung Galaxy Tab product item using PO
    Then Samsung Galaxy Tab product is opened on the own page using PO

  Scenario: Click on the any product from Phones and PDAs category redirect to the product own page
    When I click on the Phones and PDAs category in the web page navigation bar using PO
    And I click on HTC Touch HD product item using PO
    Then HTC Touch HD product is opened on the own page using PO

  Scenario: Click on the any product from MP3 Players category redirect to the product own page
    When I click on the Players category in the web page navigation bar using PO
    And I click on Show All Players link in the dropdown menu using PO
    And I click on iPod Classic product using PO
    Then iPod Classic product is opened on the own page using PO
