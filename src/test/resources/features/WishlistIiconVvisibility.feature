Feature: Wishlist visibility



  Scenario: wishlist visibility
    Given application is launched using PO
    Then i see wishlist icon using PO
    When i navigate to page Laptops and Notebooks using PO
    Then i see wishlist icon using PO
    When i navigate to page Components using PO
    Then i see wishlist icon using PO
    When i navigate to page Tablets using PO
    Then i see wishlist icon using PO

  Scenario: Wishlist heart icon visibility
    Given application is launched using PO
    Then  i se heart icon next to each item MacBook, iPhone, Apple Cinema30, CanonEOS5D using PO
    When  i navigate to "MacBook" product page using PO
    Then  i se heart icon next to item using PO
    When  i navigate to "iPhone" product page using PO
    Then  i se heart icon next to item using PO
    When  i navigate to "Apple Cinema 30"" product page using PO
    Then  i se heart icon next to item using PO
    When  i navigate to "Canon EOS 5D" product page using PO
    Then  i se heart icon next to item using PO