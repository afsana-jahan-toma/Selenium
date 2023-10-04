Feature: Add customer to XYZ bank
  Scenario Outline: Check add customer page
    Given XYZ add customer page
    When sends customer '<FirstName>' and '<LastName>' and '<PostCode>'
    And Click add customer button
    Then go to the next page

    Examples:
    |FirstName|LastName|PostCode|
    |Afsana   |Toma     |1234    |