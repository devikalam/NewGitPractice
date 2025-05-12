Feature: Books
Background:
Given Browser is open to welcome page
When user is logged in
| devikalam@gmail.com |kalamdevi@123|
And user clicks on books page
And books page is displayed

Scenario: validate user can sort the page Alphabetically


And user chooses the books in sorting order in dropdown
Then Page should be displayed in alphabetically

Scenario: validate user can add Computing and Internet to cart
And user clicks on add to cart computing and internet
Then book should be added to cart

Scenario: validae user can add Health book to cart
And user clicks on add to cart Health book
Then book should be added to cart




