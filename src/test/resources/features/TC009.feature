Feature: Demoshop24 wishist add and remove functionality

  @TC009-1
  Scenario: Check add and remove functionality of the wishlist1
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
    Then User sees selected element:
      |iPod Nano|
      |iPhone|
      |MacBook|
      |iPod Classic|
    And Wishlist icon has number of 4 assigned to it

  Scenario: Check add and remove functionality of the wishlist2
    Given Open application, homepage
    And User navigates to login page
    And User inputs credentials
      | username | janisklavins@gmail.com  |
      | password | password |
    And User navigates back to homepage
    When User adds 1 item Iphone from featured wishlist
    And User navigates to Phones&PDAs page
    And Adds 2 items from list
    And Navigates to Tablets page
    And Adds 1 item from list
