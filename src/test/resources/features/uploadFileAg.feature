 @alev
Feature: As a user, I should be able to upload a file.
  Scenario: verify users to upload a file from Files
    Given user on the dashboard page -AG
    When the user clicks the "Files" module
    When the user clicks the add icon on the top
    And  the user uploads a file from files with the upload file option
    Then verify the file name is displayed on the page