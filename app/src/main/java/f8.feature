Feature: Check the schedule of f8 dev conf

Scenario: Launch the f8 app and navigate to schedule page
# Launch the application and click on the skip button
Given I launch the app
When I click on the skip button
Then I should see the schedule page