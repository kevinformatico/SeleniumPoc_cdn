@consultadecaratula
Feature: Buscar usuario vista 360


  Scenario Outline: buscar usuario
    Given Estoy en la pagina "http://portalcomercial.qa.labchile.cl:8888/login/logout/platcom"
    Given inicio sesion con el usuario "<usuario>" y el password "<password>"
    Given aparece escritorio comercial en pagina "Ejecutivo"
    When busco usuario por rut "<rut>"
    Then aparece vista "360"

    Examples:
      | usuario   | password | rut       |
      | Pcalderon | Banco01  | 7676058-6 |



