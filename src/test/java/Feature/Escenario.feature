@consultadecaratula
Feature: Consulta de caratula de linea historica

  Background:
    Given Estoy en la pagina "http://portalcomercial.qa.labchile.cl:8888/login/logout/platcom"

  Scenario: iniciar sesion
    When inicio sesion con el usuario "Pcalderon" y el password "Banco01"
    Then aparece escritorio comercial en pagina "Ejecutivo"
