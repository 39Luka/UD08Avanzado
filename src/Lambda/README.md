# 1. Las librerías de Java poseen muchas interfaces( por ejemplo List), que define una serie de métodos.
## a. ¿Podemos usar las expresiones lambda en vez de instanciar las interfaces e implementarlas como clases anónimas si queremos usarlas?
Sí, pero solo si la interfaz es una interfaz funcional, es decir, tiene un único método abstracto.
Si una interfaz tiene más de un método abstracto, no se puede representar con una lambda, porque no habría forma de saber cuál método se quiere implementar.
## b. Dada una interfaz específica, ¿Cómo podemos saber si podemos usar una expresión lambda para mapearla?
La interfaz debe ser funcional, es decir, tener un solo método abstracto.
Podemos verificar si la interfaz está anotada con @FunctionalInterface, aunque esto no es obligatorio.
## c. ¿Podríamos expresar con lambdas la Interface List?
No, porque List no es una interfaz funcional.
List tiene múltiples métodos abstractos (add(), get(), size(), etc.), por lo que no se puede representar con una lambda.


# 2. A partir de tu respuesta anterior, ¿podríamos entonces usar una expresión lambda para representar una instancia de la interfaz java.util.concurrent.Callable? Razona tu respuesta.
Como solo tiene un método abstracto, sí puede representarse con una expresión lambda.

# 3. Se podría crear una expresión lambda de la interfaz java.util.Comparator? Razona tu respuesta.
Solo un método es abstracto, por lo que sí se puede representar con una lambda.





