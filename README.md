Máquina de jugar a Black Jack.
Un nuevo casino ha llegado a Las Vegas, pero este casino no quiere tener personal humano,
sino implementar una serie de sistemas informáticos que automatizan los procesos de juego.
Después de buscar referencias y recomendaciones..., la Dirección del Casino ha decidido
contratarte para desarrollar estos sistemas.

Tu tarea es completar la función que reparte cartas para el crupier (última fase de la partida de
Black Jack) y devuelve los jugadores que han ganado.

Las reglas son las siguientes:

1.- Cada partida consta de 3 jugadores ("Player1", "Player2", "Player3") que juegan de forma
individual contra el crupier (los jugadores no juegan entre ellos).
2.- Cada carta tiene su valor: los números valen lo que indique su número; "J", "Q" y "K" valen
10; "A" puede valer 11 o 1.
3.- Si un jugador excede de 21 puntos pierde
4.- El crupier debe sacar carta del montón hasta que su mano tenga 17 puntos o más.
5.- Un jugador tiene un Black Jack cuando tiene 2 cartas, una con valor 10 y la otra es una "A".
6.- Si el jugador tiene Black Jack, gana, a menos que el crupier también tenga Black Jack.
7.- Cuando el crupier saca una carta, el crupier siempre saca la primera carta del motón.
Diseño

Para ello, necesitamos crear una función, getWinners(...), que recibe 5 parámetros
1. Las cartas del Player1
2. Las cartas del Player2
3. Las cartas del Player3
4. Las cartas del Croupier
5. El montón de cartas pendientes de sacar
La función genera un array con los jugadores que ganan. 
