Feature: SearchItem
@Search
Scenario Outline: validate when user enters the text in search text and search item should be displayed

Given Welcome page should be displayed
When user enter "<Search text>" in searchTextField and click on enter
Then search results should be displayed

Examples:
  |Search text|
  |Electronics|
  |Computer   |
  |Books      |
  |10         |
  |10.12      |