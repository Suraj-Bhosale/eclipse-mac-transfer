Feature: Amazon Product

Scenario Outline: Search Product
Given I am searching product in amazon.
When I search product  <username>  and Price " <password> "
Then Result will display with name "Mackbook Pro"

Examples:
  | username | password |
  |first | sfsff |
  | second | fgdfgfgdg|
  | third | fgdfgfg |

