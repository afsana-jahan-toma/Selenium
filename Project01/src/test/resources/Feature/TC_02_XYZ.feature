Feature: Open account of XYZ bank
  Scenario: Open account chheck
    Given Open account page
    When Click open account button
    And manager click on dropdown button  and select customer name
    And manager click on dropdown button and select currency
    And click on process button
    Then account could be open
