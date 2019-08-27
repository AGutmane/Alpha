Feature: Wishlist visibility

  Background: Launch application, open homepage
    Given application is launched

  Scenario: wishlist visibility
    Given application is launched
    Then i see wishlist icon
    When i navigate to page Laptops & Notebooks
    Then i see wishlist icon
    When i navigate to page Components
    Then i see wishlist icon
    When i navigate to page Tablets
