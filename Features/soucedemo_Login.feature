Feature: Saucedemo Login Page
Description: Automationg the login page using Cucumber

Scenario: Login page automation in Saucedemo
Given open browser

When Enter URL "https://www.saucedemo.com/"
And Enter Username
And Enter Password
And Click on Login

Then Login Success