@Grid
Feature: Test different actions on static table

Background: Navegate to table web app
    Given navego hasta la tabla estatica

@Smoke
Scenario: como un tester, yo quiero recuperar el valor de una fila/columna en estatico table
    When selecciono un valor de fila y columna
    And ingreso un valor de fila y columna

@Regression
Scenario: como un tester, yo quiero validar que la table esta desplegada
    Then valido que la table esta desplegada