@buscargoogle
Feature: Buscar en Google

  Scenario Outline: buscar en google
    Given Estoy en la pagina "http://google.cl"
    When busco "<buscar>"
    Then aparece informacion sobre "<buscar>"

    Examples:
      | buscar    |
      | autos     |

