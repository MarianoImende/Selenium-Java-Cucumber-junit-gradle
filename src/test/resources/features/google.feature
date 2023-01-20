@google
Feature: probar la busqueda en Google


Scenario: Busco algo en google
Given navego en google
When busco algo
And Click en boton buscar
Then valido resultado