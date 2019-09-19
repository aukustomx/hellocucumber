Feature: Is it month
  Everybody wants to know the month name from it number.

  Scenario Outline: The month name for number of month
    Given the number of month is "<monthnumber>"
    When I ask what is the name of month
    Then I should get "<monthname>"

    Examples:
      | monthnumber | monthname |
      | 1           | January   |
      | 2           | February  |
      | 3           | March     |
      | 4           | April     |
      | 5           | May       |
      | 6           | June      |
      | 7           | July      |
      | 8           | August    |
      | 9           | September |
      | 10          | October   |
      | 11          | November  |
      | 12          | December  |