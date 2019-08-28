Feature: Review for products
  As an e-shop customer
  I want to be able to leave reviews for products

  Scenario: Choose a product for review

    Given I am on Demoshop homepage
    When I click Featured product MacBook using PO
#    And I am on product page using PO
    And click write a review using PO
    Then I am able to write a review for selected product using PO


#  Scenario Outline:  Unsuccessful review
#
#    Given I am on MacBook product page
#    When I enter name in Your name field using PO
#    And type text "<length>" in Your review field using PO
#    And select Rating option using PO
#    And click continue using PO
#    Then I get "<message>" using PO
#
#
#    Examples:
#      | length| message                                                       |
#      |  20   |  Warning: Review Text must be between 25 and 1000 characters! |
#      |  1100 |  Warning: Review Text must be between 25 and 1000 characters! |



#  "5a. Write name in Name field
#  5b. Type correct review (e.g. 50 characters long)
#  5c. Select rating option
#  5d. Click Continue button"

#  Review should be added to the product and message "Thank you for your review. It has been submitted to the webmaster for approval." should appear


    Scenario: Successful review

      Given I am on MacBook product page
      When I enter name in Your name field using PO
      And type text "<length>" characters long in Your review field using PO
      | 74 |
      And select Rating option using PO
      And click continue using PO
      Then I get "<message>" using PO
    |Thank you for your review. It has been submitted to the webmaster for approval.|

