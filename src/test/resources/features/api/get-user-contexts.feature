Feature: Get user contexts

  @current
  Scenario: User attempts to get contexts
    Given an User
    When he attempts to retrieve contexts with username Ciprian and password ciprian
    Then all contexts are returned