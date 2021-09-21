Pour réaliser ce kata j'ai tenté de pratiquer le TDD, explications : 

## PARTIE I

1) Création de la méthode de test addOneStringNumberReturnsIt
    => test rouge, rien ne compilait car le String calculator n'existait pas.
    création de la classe avec la méthode add qui return juste number passé en paramètre
    => test vert

2) Création de la méthode de test addThreeStringsNumbersReturnsException
    => test rouge
    La difficulté est que l'énoncé n'est pas clair, j'ai fais une méthode qui throw une exception si + de 2 nombre
    => test vert
    
3) Création de la méthode test addTwoStringsNumbersReturnsSum
    => test rouge
    Ajout du split dans Add
    Ajout du stream à la fin de add avec un mapToDouble classique
    => test vert

4) Création de la méthode de test addEmptyStringReturnsZero
    => test rouge 
    Ajout de la méthode mapString dans le String calculator
    => test vert
    
## PARTIE II

1) Création de la méthode de test addManyStringsNumbersReturnsSum 
    => 2 tests rouges
    Suppression du test qui n'est plus utile
    Refacto du code : on enlève le check du nombre d'arguments
    => test vert

Bénéfices: 
100% coverage, seuls le code nécessaire est écrit, facilité de maintenance et réfacto (après l'exemple est simple..)
