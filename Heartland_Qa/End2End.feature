Feature: Heartland

  Scenario: End to end testing
  
  Given Open the Browser
  When Navigate to the homepage
  And Add an item to the cart
  And Checkout successfully
  Then Order should be placed successfully
  And Close the browser