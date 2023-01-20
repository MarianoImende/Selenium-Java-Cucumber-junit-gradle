
Feature: probar diferentes cosas en sandBox

Scenario: como un tester, selecciono un deporte de la lista
    Given navego en webSelect
    When selecciono Basquetbol

    
@lista
# cada Scenario deberia cubrir solo una regla
Scenario Outline: Scenario Outline name: como un tester, yo quiero validar que un texto está presente dentro de la lista
    Given navego hasta la list page
    When yo busco <estado> en la lista
    Then yo puedo buscar <ciudad> en la lista

    Examples:
    |estado|ciudad|
    |Washington|Seattle, Washington|
    |Chicago   |Chicago, Illinois  |


@alert
Scenario: como un tester, quiero dar doble click y click derecho
    Given navego hasta la web
    When sobre vuelo el boton de la web 
    And presiono boton derecho 
    And doy doble click
    Then acepto el alert