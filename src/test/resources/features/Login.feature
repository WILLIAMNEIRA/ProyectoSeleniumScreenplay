Feature: login
  I as service user , i need login

  Scenario: login succesfull
    Given  he user is on the page
    When he user enter credentials
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
    Then  he user his login