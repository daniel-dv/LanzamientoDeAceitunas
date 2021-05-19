# LanzamientoDeAceitunas
Descripción del problema
En un lejano imperio intergaláctico, se
juega a un extraño deporte basado en
lanzamiento de aceitunas. El juego se
desarrolla en una cancha circular, centrada en el origen de coordenadas (0,0) y
dividida en dos mitades por una red que
pasa por el eje y (es decir, por la recta
x = 0).
En el deporte se enfrentan dos jugadores, uno de cada lado de la cancha,
ubicados dentro de una zona de lanzamiento especialmente preparada. Cada
jugador lanza aceitunas al lado opuesto
de la cancha, intentando que caigan lo
más cerca posible del borde exterior de la
misma, pero sin caer afuera. Este deporte
emocionante involucra complicados cálculos de riesgo y elaboradas estrategias de
lanzamiento, y el detalle exacto de las
reglas es altamente complicado.
Para este problema, nos basta con
saber que lo más importante de todo
para un jugador es asegurarse de que
las aceitunas propias caigan dentro de la
cancha.
Olivares Intergalácticos Asociados
(OIA), o “El Oli” como le dicen sus
hinchas, es un club de lanzamiento
de aceitunas recientemente establecido.
Luego de un larguísimo partido entre el
jugador estrella del club y su archirival,
los entrenadores del Oli han registrado
cuidadosamente en un listado todas las
posiciones (x,y) donde han caído aceitunas lanzadas durante el partido. Aquellas
posiciones con x > 0 corresponden
a lanzamientos del jugador del Oli, y
aquellas con x < 0 corresponden a
lanzamientos realizados por su rival. No
hay aceitunas caídas en una posición con
x = 0, pues la presencia de la red así lo
impide.
Olivares tiene influencias en la Asociación de Lanzamiento de Aceitunas del
Cúmulo Galáctico, y puede generar un
cambio de reglamento retroactivo (es decir, afecta también a partidos ya finalizados) para elegir un nuevo tamaño para
la cancha (el tamaño es el radio del
círculo). Utilizando los datos del partido, le
gustaría elegir un radio R que maximice la
diferencia entre la cantidad de aceitunas
que su jugador deja dentro del círculo, y
las que el rival deja dentro del círculo, ya
que ese número es el principal indicador
del puntaje del partido. Por ejemplo si
para cierto valor de R el jugador del Oli
tiene 7 aceitunas en la cancha, y el rival
solamente 3, la diferencia para ese valor
de R es 7 − 3 = 4
NOTA : Una aceituna que cae exactamente en el borde de la cancha se
dice que es "línea", y está adentro de la
cancha.
Se te pide que hagas un programa
que lea las posiciones (x, y) registradas
por los entrenadores, y determine el valor
de R2
, es decir, el cuadrado del radio
de la cancha. Este radio debe maximizar el valor tirosOli − tirosRival descrito
anteriormente. En caso de haber varios
radios que maximicen ese valor, debes
considerar el más chico posible.
Datos de entrada
Se recibe:
• Una línea con un entero N
1 ≤ N ≤ 1.200
• N líneas con dos enteros Xi
,Yi cada
una, el par de coordenadas donde cayó
una aceituna.
−40.000 ≤ Xi
,Yi ≤ 40.000,
• IMPORTANTE : Xi 6= 0, ya que la red lo
versión 1.0 hoja 1 de 2
Nivel 1 Problema 4 olivares Jurisdiccional OIA 2018
impide.
Datos de salida
El programa debe imprimir una línea
con un entero: R2
, donde R es el radio de
la cancha.
Subtareas
El 58 % de los casos de entrada, tendrá
N ≤ 100.
El 65 % de los casos de entrada, tendrá
coordenadas −600 ≤ Xi
,Yi ≤ 600.
Note que un caso de prueba puede
pertenecer a ambas subtareas.
Todos los casos tienen el mismo puntaje.
Ejemplo
Si la entrada fuera:
10
9 3
6 1
9 8
-1 -2
8 -9
-2 10
5 -8
-5 8
-10 9
-1 -10
La salida debería ser:
90
Ilustración del ejemplo. Las coordenadas en rojo representan lanzamientos que
cayeron dentro de la cancha. La diferencia
alcanzada es 2 − 1 = 1 y es la máxima
posible. El R2
(es decir, el cuadrado del
radio de la cancha) más chico posible que
logra esa diferencia es 90.
Nota: Es válido usar como respuesta
posible el valor R = 0, que corresponde a
una cancha tan pequeña que nunca entra
ningún lanzamiento.
