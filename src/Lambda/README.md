# 1. Las librerías de Java poseen muchas interfaces( por ejemplo List), que define una serie de métodos.
## a. ¿Podemos usar las expresiones lambda en vez de instanciar las interfaces e implementarlas como clases anónimas si queremos usarlas?
Solo cuando existe un único método.

## b. Dada una interfaz específica, ¿Cómo podemos saber si podemos usar una expresión lambda para mapearla?
Lo podemos saber si está etiquetada como @FuntionalInterface

## c. ¿Podríamos expresar con lambdas la Interface List?
No, tiene más de un método.