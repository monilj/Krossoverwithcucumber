Feature: Test Login functionality


	Scenario: Test Search functionality
    Given Open krossover supoort in chrome
    When I enter "<search_term>"
    Then Verify search ablity "<search_term>"
 
    |search_term|
    |Basketball Analytics|
    |Football Overview|
    |Soccer Overview|
 
    