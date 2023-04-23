Diese Kapitel hängt dicht mit graphen.md zsm!

# Graphensuche:
min spanning tree: kruskal algo
max spanning tree: kruskal aber absteingend sortieren

### map coloring 
    jeder graph kann mit n Farben gezeichnet werden, ohne das die selbe Farbe sich selbst benachbart, wenn: jeder knoten nur n kanten hat
    knoten == kanten

### kruskal
    1. kanten gewichte aufsteigend sortieren
    2. markierung der kante + aufschreiben der Knoten
    REGEL: keine (Korn) Kreise bauen!

    bsp:
        2,3,6,5,4,1
    
### dijskatra
    kürzesten weg suchen (greedy algo: min für momentanen move)
    geht nur für vollständige graphen
    
    1. kleinste value auswählen für kante
    2. für neuen knoten prüfen wie hoch kanten, vergleichen mit anderen kanten (die undiscovered sind, wenn knoten auf adnerer seite discovered cancel as well); da wo val kleiner == gehen

    bsp (ohne pnkt 6):
        start:1
        knoten: 1,2,3,5,4
        weg: 0,4,5,7,10

    bleeptrack:
        SCDFZ

### Backtracking
    verwendung für: 
        sodoku: teillösung für zahlfeld suchen, nächstes zahlfeld
            wenn nichts möglich, rekursion und nächste TL prüfen
        labyrinth:
            tl suchen (l,r,g), bei sackgasse kein TL möglich --> rekursion, tl suchen

    Solange Teillösung(TL):
        wähle TL
        wenn ziel erreicht:
            return true;
        sonst:
            rekursion auf diesen pnkt;
        sonst:
            return false;

    bsp:
        start: 1
            1,2,3,4,5 [5]return true , [4]return true, 6, [6] return true, [3]return true, ...
        

### Tiefensuche
    - verhält sich wie stack
    - verwendet werden 2 zeitstempel (discoverd and finalize)

    1.  alle punkte in reihe discovern
    2. wenn es nicht weiter geht, finalize diesen pnkt
    3. einen schritt zurück, links rechts weiter? --> weiter machen wie in 1.; nein? führe ab 2. aus

            1   2   3   4   5   6
    d       1   2   3   4   5   8
    f       12  11  9   7   6   9
    parent  -   1   2   3   4   3


### Breitensuche
    - verhält sich wie queue
    1. start knoten explored
    2. kanten gehen, endpunkte : (if discovered: nothing; else: discovered)
    2. abstandsmarkierung setzen an discovered Knoten == abstand von s(original s) über discoverd weg
    3. discovered knoten auswhählen und ab 1 weiter

    für jedes explored: aus queue loeschen
    für jedes discovered: in queue eintragen

    Bsp:
        1: s
        1[0] 2[1] 4[2] 3[2] 6[3] 5[4] bzw 1[0] 2[1] 3[3] 6[4] 4[3] 5[4] // this is very likely not correct

    - stoeßt auf knoten mit abstand k vor Knoten mit abstand k+1
    - kürzester weg von s zu übrigen Knoten



# Rekursion
### laufzeit
    O(n) --> n durchläufe für diese Funktion
    bsp: 
        for i in range(len(array)):         | O(n)
            print("hello")                  | O(1)

    O(1) * O(n) == O(n)

    for i in range n:                       | O(n)
        for x in range n:                   | O(n)
            if x>i: swap(i,x)               | O(1)

    O(n) * O(n) * O(1) == O(n^2)

    for i in range n:                       | O(n)
        for x in range n:                   | O(n-x) 
            n = n - x

    O(n) * O(n-x) == O(n log n)

    bsp:
        Quicksort	O(n log n)	O(n²)       | divide and conquer per pivot element
        Mergesort	O(n log n)	O(n log n)  | divide and conquer mit teilung der listen in teillisten ("schlaues" zsm führen)
        Bubble Sort O(n)        O(n²)       | vergleiche aller werte und tauschen


### sortier algos
    Quicksort: see class <br>
    Mergesort: see class
