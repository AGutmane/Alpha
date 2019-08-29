Feature: Demoshop24 wishist to cart transfer functionality

  @TC010-1
  Scenario: Check wishlist to shopping cart transfer functionality1
    Given Open application, homepage
    And User navigates to login page
    And User inputs credentials
      | username | janisklavins@gmail.com  |
      | password | password |
    And User navigates back to homepage
    When User adds 2 items Macbook, Iphone from featured wishlist
    And User Navigates to MP3players page
    And Adds 2 items iPod Classic,iPod Nano from MP3players page
    And Navigates to wishlist page
    And User adds first item to shopping cart
    And User navigates to shopping cart page
    Then User sees transfered element:
      |iPod Nano|

  @TC010-1
   Scenario: Check wishlist to shopping cart transfer functionality2
    Given Open application, homepage
    And User navigates to login page
    And User inputs credentials
      | username | janisbaltins@abc.lv  |
      | password | password |
    And User navigates back to homepage
    When User adds 2 items Macbook, Iphone from featured wishlist
    And User Navigates to MP3players page
    And Adds 2 items iPod Classic,iPod Nano from MP3players page
    And Navigates to wishlist page
    And User adds all items to shopping cart
    And User navigates to shopping cart page
    Then User sees transfered element:
      |iPod Nano|
      |iPhone|
      |MacBook|
      |iPod Classic|