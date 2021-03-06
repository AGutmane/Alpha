#  TC 005
Feature: Review for products
  As an e-shop customer
  I want to be able to leave reviews for products

# TC 005, Step 1&5

  Scenario: Successful review

    Given I am on Demoshop homepages
    When I click Featured product MacBook using PO
    And click write a review using PO
    And I see MacBook review page using PO
    And I enter name and review using PO
    And select Rating option using PO
    And click continue using PO
    Then I get success message using PO




#  Scenario Outline:  Unsuccessful review
#
#    Given I am on MacBook review page
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









