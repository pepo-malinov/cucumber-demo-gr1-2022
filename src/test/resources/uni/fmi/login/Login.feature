Feature: Вход в системата

  Scenario: Вход в системата с валидни потребителски данни
    Given Потребителя отваря екрана за вход в системата
    When Въведе валидно потребителско име
    And въведе валидна парола
    And натисне бутона за вход в системата
    Then Вижда съобщение за успех
    
  Scenario: Вход в системата без потребителско име
    Given Потребителя отваря екрана за вход в системата
    When въведе валидна парола
    And натисне бутона за вход в системата
    Then Вижда съобщение за липса на данни
    
    
  Scenario: Вход в системата без парола
    Given Потребителя отваря екрана за вход в системата
    When Въведе валидно потребителско име
    And натисне бутона за вход в системата
    Then Вижда съобщение за липса на данни
    
  Scenario: Вход в системата без входни данни
    Given Потребителя отваря екрана за вход в системата
    When натисне бутона за вход в системата
    Then Вижда съобщение за липса на данни