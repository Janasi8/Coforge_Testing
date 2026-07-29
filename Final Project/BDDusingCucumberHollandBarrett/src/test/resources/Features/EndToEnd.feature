Feature: Holland and Barrett End To End

Scenario: Login Add Product Logout

Given User should open Chrome Browser
When User should launch Holland and Barrett Login page
And User should enter Email
And User should enter Password
And User should click Login button
Then User should login successfully

When User should open Holland and Barrett Home page
And User should accept Cookies
And User should click Vitamins and Supplements
And User should click first Add to Basket button
And User should click My Account
And User should click Logout
Then User should logout successfully