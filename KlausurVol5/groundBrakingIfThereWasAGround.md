# lol, ignore if you want:
## LZW:
    verlustfreies Komprimieren: "bananen san nat"
        last    current     lib    code
        -       b           -      -
        b       a           ba      1
        a       n           an      2
        n       a           na      3
        a       n           2      
        n       e           ne      4
        e       n           en      5
        n       s           ns      6
        s       a           sa      7
        a       n           2
        n       n           nn      8
        n       a           3       
        a       t           at      9

    Code: 12345672839

## Huffman:
    1 buchstaben zählen (mit leerzeichen)
    2 Binärbaum aufbauen:
        2.1 geringste Häufigkeits-Buchstaben als unterste Knoten
        2.2 diese Knoten: Häufigkeiten addiernen und als Wurzel verwenden
    3 links: 1; rechts: 0

    bananen san nat:
    b   1
    t   1
    s   1
    e   1
    _   2
    a   4
    n   5

    tree:
        ![HuffmanTree](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/Huffman.png)
    Code: 111 100 0 100 0 1100 0 101 [and so on]

# Ab hier wirds wichtig...

## Baumsetheorie
    ### Preorder: wlr
    ### postorder: lrw
    ### inorder: lwr
    
    test:
        ![Ordering](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/ordering.png)
    
    preorder:  1 2 4 5 6 3
    postorder: 5 6 4 2 3 1
    inorder:   5 4 6 2 1 3

    ### binäre bäume können:
        unausgewogen: eine seite hat 2 mehr ebenen als die andere (ebenen gelten nur wenn voll besetzt) 
        ausgewogen: die abstände sind max 1 ebene 
        vollständig: alle knoten haben (2 || 0) nachfolger

    Bsp: ![BaumeBeschweren](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/BaumeBeschweren.png)

## boolsche logik
    vereinfachungsregeln
    ![boolregeln](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/boolregeln.png)

    ### KV-Diagramm:
        maxterm: 
            möglichst große Boxen (nur 0)
            invers belegt variablen
            
                        AB
                    00  01  11  10  
            CD  00  1   1   0   0
                01  0   1   1   1
                11  0   1   1   1
                10  0   1   0   0

            --> (A v B v -C) n (-A v D) n (A v B v -D)
        
        minterm:
            möglichst große boxen (nur 1)
            norm belegte Vars

                        AB
                    00  01  11  10
            cd  00  1   1   0   0
                01  0   1   1   1
                11  0   1   1   1
                10  0   1   0   0

            --> (-C n -D n -A) v (-A n B) v (A n D)

    

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

# Binaerer Scheiß
## normal:
'''Zahl durch 2 Teilen, rest wahr falsch notieren, bei (1/2) --> 1 notieren notierte von unten nach oben aufschreiben; tadaa'''

### bsp:
155(10) zu binaer: <br>
155 / 2 = 77 | 1 <br>
 77 / 2 = 38 | 1 <br>
 38 / 2 = 19 | 0 <br>
 19 / 2 = 9  | 1 <br>
  9 / 2 = 4  | 1 <br>
  4 / 2 = 2  | 0 <br>
  2 / 2 = 1  | 0 <br>
  1 / 2 = end| 1 <br>
 <br>
unten nach oben : 1001 1011(2)

## Einer-Komplement
normal binaer bilden, dann alles negieren <br>
<br>
wird wegen umständlicher Hardware-Designes nicht verwendet, außer um das Zweier-Komplement zu berechen (fuer uns auf Papier, keinen Schimmer, ob die Hardware das auch so macht)

### bsp:
155(10) --> 1001 1011(2)[binaer] --> 0110 0100(2)[einer-Komplement]

## Zweier-Komplement
Zahl zu binear, binear in Einer-Komplement, Einer-Komplement mit 1 addieren, profit <br>
! Ueberpruefe die Bit-Laenge der Binear-Zahl!)
### bsp:
155(10) --> 1001 1011(2)[binear] --> 0110 0100(2)[Einer-Komplement] 
<br>
 01100100<br>
\+       1<br>
---------<br>
 01100101<br>
<br>
--> 0110 0101(2)[Zweier-Komplement]<br>
! 155(10) ist zu lange (8-Bit mind.) also switch zu mehr Bit !<br>
<br>
155(10) --> 0000 1001 1011(2)[binear]{12Bit] --> 1111 0110 0100(2)[1er-Komplement]{12Bit} <br>

 1111 0110 0100<br>
\+             1<br>
---------------<br>
 1111 0110 0101<br>
<br>
--> 1111 0110 0101(2)[2er-Kom.]{12 Bit}

## Bit-Leange!
Notice: 155(10) ist mind. 8 Bit groß --> Einer-Komplement funktioniert damit noch, aber das Zweier-Komplement braucht einen Bit, um positiv und Negativ zu unterscheiden --> ein Bit zu wenig, wenn man in der 8-Bit Darstellung ist!
<br>
normal 8-Bit (dargestellte Zahlen positiv):<br>
0   0  0  0  0 0 0 0 <br>
128 64 32 16 8 4 2 1<br>
<br>
einer-komplement (dargestellte Zahlen negativ...):<br>
0   0  0  0  0 0 0 0 <br>
128 64 32 16 8 4 2 1<br>
<br>
zweier-komplement (dargestellte Zahlen pos & neg):<br>
0   0  0  0  0 0 0 0 <br>
+/- 64 32 16 8 4 2 1<br>
<br>
damit sind nur Zahlen von -127 bis +127 für das 2er-Komplement bei 8 Bit möglich!<br>

# Graphen
## Gerichtet oder Freigelassen?
Wenn Adjezentz-Matrix nicht symmetrisch, ist der Graph gerichtet.
(siehe Abi-Fundus A2)


