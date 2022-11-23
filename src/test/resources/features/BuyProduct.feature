Feature: Buy product

  Scenario: Buy bag
    Given he user is on the page
    When  he user enter credentials
      | username                | password     |
      | standard_user           | secret_sauce |
    And he user buy a product
    Then he user bougth a product