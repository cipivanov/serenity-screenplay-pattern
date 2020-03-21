Feature: User Application Login

  @current
  Scenario: User login into the application with administrator
    Given a User is on the application Login Page
    When he attempts to sign in with username Ciprian and password ciprian
    Then Login successful message is displayed