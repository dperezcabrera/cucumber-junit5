# language: es
Característica: Operacion suma

  Antecedentes: ejemplo
    Dada una operacion

  Esquema del escenario: suma
    Cuando calculamos la suma entre <numero-0> y <numero-1>
    Entonces el resultado esperado es <resultado>

    Ejemplos: tabla de resultados esperados
      | numero-0 | numero-1 | resultado |
      |        1 |        1 |         2 |
      |        0 |        2 |         2 |
      |        2 |        0 |         2 |
      |        2 |        2 |         4 |

  Escenario: suma negativa
    Cuando calculamos la suma entre -5 y -1
    Entonces el resultado esperado es -6