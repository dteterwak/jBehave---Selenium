Scenario: 1
Given user is on test site
When I click on a single radio
When I click on a group radio
Then I check if they are correctly checked

Scenario: 2
Given user is on a download test site
When I click on download button
Then I assert wheter the download was succesful
Then I click a button to finish

Scenario: 3
Given user is on a Ajax form site
When I fill the form and submit
Then I assert whether the form was submitted successfuly

Scenario: 4
Given user is on a Date Picker test site
When I pick a starting date
When I pick an ending date
Then I assert whether the starting date is the one I picked
Then I assert whether the ending date ist the one I picked

Scenario: 5
Given user is on a Simple Form test site
When I type TEST into form box and click the button
When I type 10 and 27 numbers and sum them up
Then I assert whether Im getting TEST message and a sum of 37