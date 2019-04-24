@contratarproducto
Feature: Contratar producto

Scenario Outline: contratar producto
  Given Estoy en la pagina "http://portalcomercial.qa.labchile.cl:8888/login/logout/platcom"
  And inicio sesion con el usuario "<usuario>" y el password "<password>"
  And aparece escritorio comercial en pagina "Ejecutivo"
  And busco usuario por rut "<rut>"
  And aparece vista "360"
  When contrato un producto
  Then aparecen cliente datos "incompletos"

Examples:
| usuario   | password | rut       |
| Pcalderon | Banco01  | 7676058-6 |

