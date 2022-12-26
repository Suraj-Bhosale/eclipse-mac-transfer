Feature: Amazon Product

@sanity
Scenario: Search Product
Given I am searching product in amazon.
When I search product "suraj" and Price "bhosale"
Then Result will display with name "Mackbook Pro"



