Feature: Demoshop24 wishist add and remove functionality

  @TC009-1
  Scenario: Check add and remove functionality of the wishlist1
    Given Open application, homepage
    And User navigates to login page
    And User inputs credentials
      | username | janisklavins@gmail.com  |
      | password | password |
    And User navigates back to homepage
    When User adds 2 items from featured wishlist
    And User Navigates to MP3players page
    And Adds 2 items from MP3players page
    And Navigates to wishlist page
    And User sees selected element:
      |iPod Nano|
      |iPhone|
      |MacBook|
      |iPod Classic|


