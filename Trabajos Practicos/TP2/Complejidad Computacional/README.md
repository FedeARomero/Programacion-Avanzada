# TP2
Complejidad Computacional

1. Introduccion
A traves del presente trabajo se espera que los alumnos codiﬁquen, evaluen y comparen distintos algoritmos que resuelven, mediante diferentes tecnicas, el mismo problema.

2. Objetivos
2.1. Polinomios
Diseñar un programa para evaluar un polinomio P(x) de grado n.

public class **Polinomio** { 

private int **grado** ; 

private double [ ] **coeficientes** ; 

> //La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y 
 
> //la posicion n contiene al termino independiente .

public **Polinomio** {. . .} 

double **evaluarMSucesivas** (double x) {. . .} 

double **evaluarRecursiva** (double x) {. . .} 

double **evaluarRecursivaPar** (double x) {. . .} 

double **evaluarProgDinamica** (double x) {. . .} 

double **evaluarMejorada** (double x) {. . .} 

double **evaluarPow** (double x) {. . .} 

double **evaluarHorner** ( double x) {. . .} }

1. Escribir [evaluarMSucesivas](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/Polinomio.java#L15) utilizando calculo de potencia por multiplicaciones sucesivas

2. Escribir evaluarRecursiva utilizando el siguiente calculo de potencia recursiva:

  - a) [Sin considerar](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/Polinomio.java#L33) si el exponente es par o impar: potencia (x ,n)=x∗potencia (x ,n−1) 

  - b) [Considerando](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/Polinomio.java#L50) si el exponente es par o impar: 

    - Si n es par: potencia (x ,n)=potencia (x∗x ,n/2) 

    - Si n es impar potencia (x ,n)=x∗potencia (x ,n−1)

3. Escribir [evaluarProgDinamica](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/Polinomio.java#L70), almacenando las potencias de X ya calculadas.

4. Escribir [evaluarMejorada](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/Polinomio.java#L88), con un algoritmo de igual complejidad computacional que el anterior, pero que ejecute en un tiempo menor.

5. Escribir [evaluarPow](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/Polinomio.java#L102), valiendose del metodo Math.pow(x,n) provisto por el lenguaje Java. Se debe incluir dentro de alguno de los metodos anteriores donde se considere que es apropiado. Investigue la CC de Math.pow.

6. Escribir [evaluarHorner](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/Polinomio.java#L115), aplicando el algoritmo de Horner de analisis numerico. (Investigar)

2.2. [Binomio de Newton](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/BinomioDeNewtonDinamico.java#L7) Dado un binomio de la forma (ax + b)n, conocido como elinomio de Newton, se desea:

1. Obtener el [coeﬁciente del termino k](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/BinomioDeNewtonDinamico.java#L36) del desarrollo de dicho binomio. Tener en cuenta que el coeﬁciente k (el que corresponde al termino de xk).

2. Desarrolle tambien, un metodo que permita obtener todos los [coeﬁcientes del polinomio](https://github.com/FedeARomero/Programacion-Avanzada/blob/cfee452b2dfeb68267894d4c7abbea501d90ebcf/Trabajos%20Practicos/TP2/Complejidad%20Computacional/src/polinomio/BinomioDeNewtonDinamico.java#L32), o sea, el desarrollo completo del binomio, y aplique los metodos vistos en el punto anterior para evaluarlo en algun valor de x.

Desarrolle la class BinomioDeNewton, que permita cumplir con las consignas anteriores.

Nota: Investigar distintas tecnicas para obtener los coeﬁcientes del desarrollo del binomio. Estas seran recursivas y no recursivas. Usar tecnicas de programacion dinamica con y sin memorizacion. En el calculo de las potencias se podran reutilizar los metodos ya implementados.

3. Analisis de complejidad computacional
Indique la funcion de complejidad computacional asociada a cada uno de los metodos implementados.

4. Graﬁcos y tablas de rendimiento comparativo
Compare el tiempo de ejecucion de todos los metodos implementados en los puntos 2.1 y 2.2
Genere todos los casos que considere necesarios para realizar el an´alisis.

5. Conclusiones
A partir de los analisis comparativos extraiga conclusiones
