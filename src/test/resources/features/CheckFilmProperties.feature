Feature: Checking film props

  Scenario: : Getting a movie
  Given Set The Film Title To Bad Boys
    When Check The Film Title Is Bad Boys
    Then It should return "Bad Boys"

