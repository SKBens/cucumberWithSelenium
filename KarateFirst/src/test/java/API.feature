@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    
  @tag1
  Scenario: Test
    Given url 'https://api.agify.io/'
    And param name = 'Suresh'
    When method GET
    * print response

  @tag2
  Scenario Outline: Test2
    Given url 'https://api.agify.io/'
    And param name = '<Name>'
    When method GET
    * print response

    Examples: 
      | Name  |
      | Benny |
