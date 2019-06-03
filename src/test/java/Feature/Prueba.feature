

Feature: Tener una moto

  Scenario Outline: Comprar moto
    Given que soy un "<usuario>"
    When entro a la tienda de motos
    Then me compro una "<tipo>"

    Examples:
      | usuario | tipo             |
      | rockero | harley davidson  |
