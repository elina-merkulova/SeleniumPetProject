
Feature: Registration

  Background:
    Given client opens webpage
    And registration page is open

  Scenario Outline: client registers providing invalid data, braking validation rules for email
    When client enters "<emailParam>" into email field and "<passwordParam>" into password field
    Then "<passwordParam>" password message should be "<message>"
    And client submits registration form
    Examples:
      | emailParam      | passwordParam | message                                |
      | too long email  | very week     | Very weak - Ievadiet spēcīgāku paroli. |
      | email without @ | week          | Weak - Ievadiet spēcīgāku paroli.      |
      | email           | medium        | Medium                                 |
      | email           | strong        | Strong                                 |
