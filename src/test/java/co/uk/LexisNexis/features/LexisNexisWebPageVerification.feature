Feature: LexisNexis.co.uk Website Verification

@exclude
  Scenario: Verify LexisNexis homepage
    Given User is on the LexisNexis.co.uk homepage
    When user opens the site
    Then the user should see the LexisNexis logo and the search bar


@exclude
  Scenario: Perform a basic search
    Given User is on the LexisNexis.co.uk homepage
    When User enters "legal research" in the search bar
    And User clicks on the search button
    Then Search results related to legal research should be displayed


  Scenario: Navigate to News section
    Given User is on the LexisNexis.co.uk homepage
    When User clicks on the News & Insights section
    Then User should be redirected to the News page
    And User should see latest news articles


  @exclude
  Scenario: Verify Login functionality
    Given User is on the LexisNexis.co.uk homepage
    When User clicks on the Product Sign In button
    Then User should be directed to the Login page
    And User should be able to log in with valid credentials

  @exclude
  Scenario: Explore Legal Resources
    Given User is on the LexisNexis.co.uk homepage
    When User explores the Tax Solutions section
    Then User should find a variety of Tax documents and Guidance

  @exclude
  Scenario: Contact LexisNexis Support
    Given User is on the LexisNexis.co.uk homepage
    When User clicks on the Contact Us link
    Then User should be directed to the Contact page
    And User should find contact details to reach LexisNexis support