# 1ª Parte: Tareas preliminares

[Class MatrizSimetrica](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/MatrizSimetrica.java#L5) implementada en un vector.

[Generador de grafos aleatorios](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/GrafoAleatorio.java#L7) dados N y una probabilidad para cada arista.

[Generador de grafos aleatorios](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/GrafoAleatorio.java#L7) dados N y el porcentaje de adyacencia.

[Generador de grafos regulares](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/GrafoRegular.java#L3) dados N y el grado.

[Generador de grafos regulares](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/GrafoRegular.java#L3) dados N y el porcentaje de adyacencia.

[Generador de grafos n-partitos](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/GrafoNPartito.java#L3), dados N y n.

Programa [probador de los algoritmos de coloreo](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Programa%20Probador/src/paquete/ProbadorDeColoreo.java#L7). 

Codificar los algoritmos de coloreo:

 - [Secuencial aleatorio](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/Grafo.java#L105).
 - [Welsh-Powell](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/Grafo.java#L67) (Mayor grado primero).
 - [Matula](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/Grafo.java#L75) (Menor grado primero).
 
# 2ª Parte: Análisis estadístico del comportamiento de los algoritmos de coloreo.
Diseñar la [Class GrafoNDNP](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/src/paquete/Grafo.java#L12) (No Dirigido No Ponderado) implementada sobre una MatrizSimetrica (ya implementada en la 1ª parte), que contenga los métodos correspondientes a los tres algoritmos de coloreo.

Realizar el [análisis estadístico para grafos aleatorios](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/AnalisisDeColoreo/paquete/AnalizarGrafosAleatorios.java#L9) de 600 Nodos al 40%  60% y  90%  de adyacencia, para los tres algoritmos de coloreo. Ejecutar 10000 corridas o mas para cada uno. Indicar en que corrida se obtiene la menor cantidad de colores por primera vez.

Realizar el [análisis estadístico para grafos regulares](https://github.com/FedeARomero/Programacion-Avanzada/blob/8d685e0178e68edb9cfda55726bc89bdb6373a97/Trabajos%20Practicos/TP4/Grafos/AnalisisDeColoreo/paquete/AnalizarGrafosRegulares.java#L9) para grafos de 1000 Nodos con 50% y 75%  de adyacencia 
