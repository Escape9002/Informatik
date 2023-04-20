# Binaerer Scheiß
## normal:
	Zahl durch 2 Teilen, rest wahr falsch notieren, bei (1/2) --> 1 notieren notierte von unten nach oben aufschreiben; tadaa'''

### bsp:
	155(10) zu binaer:
	155 / 2 = 77 | 1
	 77 / 2 = 38 | 1
	 38 / 2 = 19 | 0
	 19 / 2 = 9  | 1
	  9 / 2 = 4  | 1
	  4 / 2 = 2  | 0
	  2 / 2 = 1  | 0
	  1 / 2 = end| 1 
 
	unten nach oben : 1001 1011(2)

## Einer-Komplement
	normal binaer bilden, dann alles negieren 

	wird wegen umständlicher Hardware-Designes nicht verwendet, außer um das Zweier-Komplement zu berechen (fuer uns auf Papier, keinen Schimmer, ob die Hardware das auch so macht)

### bsp:
	155(10) --> 1001 1011(2)[binaer] --> 0110 0100(2)[einer-Komplement]

## Zweier-Komplement
	Zahl zu binear, binear in Einer-Komplement, Einer-Komplement mit 1 addieren, profit 
	! Ueberpruefe die Bit-Laenge der Binear-Zahl!)
### bsp:
	155(10) --> 1001 1011(2)[binear] --> 0110 0100(2)[Einer-Komplement] 

	 01100100
	+       1 
	---------
	 01100101

	--> 0110 0101(2)[Zweier-Komplement]
	! 155(10) ist zu lange (8-Bit mind.) also switch zu mehr Bit !

	155(10) --> 0000 1001 1011(2)[binear]{12Bit] --> 1111 0110 0100(2)[1er-Komplement]{12Bit}

	 1111 0110 0100
	+             1
	---------------
	 1111 0110 0101

	--> 1111 0110 0101(2)[2er-Kom.]{12 Bit}

## Bit-Leange!
	Notice: 155(10) ist mind. 8 Bit groß --> Einer-Komplement funktioniert damit noch, aber das Zweier-Komplement braucht einen Bit, um positiv und Negativ zu unterscheiden --> ein Bit zu wenig, wenn man in der 8-Bit Darstellung ist!

	normal 8-Bit (dargestellte Zahlen positiv):
	0   0  0  0  0 0 0 0
	128 64 32 16 8 4 2 1

	einer-komplement (dargestellte Zahlen negativ...):
	0   0  0  0  0 0 0 0 
	128 64 32 16 8 4 2 1

	zweier-komplement (dargestellte Zahlen pos & neg):
	0   0  0  0  0 0 0 0
	+/- 64 32 16 8 4 2 1

	damit sind nur Zahlen von -127 bis +127 für das 2er-Komplement bei 8 Bit möglich!
## Float vs Fest Komma
### Festkomma | Fixed Point 
    In binärer Zahl Kommastelle dazudenken.
    1   1   0   1   (,) 1   1       bin
    8   4   2   1   ,   1/2 1/4     dec
    -------------------------------
    13,75(10)

    Problem:
    Genauigkeit der Darstellung beim prog. festgelegt 
    (siehe oben: 2 Komma --> mögl Zahlen: 0.5, 0.25, 0.75, 0.0 --> Stark begrenzt)

    Vorteil:
    Wenig rechenlast bei addition etc. --> gut für Microcontroller etc.

### Gleitkomma | Floating Point
    Notation wie in Wissenschaft:
    500000 --> 5*10^5
    0.00005 --> 5*10^-5

    Das "10^x" nennt sich Matisse ^^

    Binär:
    Hier muss die Matisse mit abgespeichert werden! Da 2^x immer gleich ist, eigentlich nur den Exponent.
    1101(,)11  --> 110111 * 2^2
    1101(,)0001111 --> 1101,00011111 * 2^8

    Problem:
    Mehr Speicherplatz wird benötigt (effektiv fast doppelt so viel...).
    Die Zahl liegt nicht direkt als "Zahl" vor, sondern als Kombi aus Zahl und Matisse 
        --> mehr Rechenleistung nötig
    
    Vorteil:
    Es gibt theoretisch unendlich viele Nachkommastellen
    Immer so viele, wie man eine Matisse abspeichern kann ^^

## Logische Gatter
### Tabellen Aufbauen
    Nimm die States, alle in Header der Tabelle, leastImportantBit wird angegeben --> ganz rechts
    binär zählen für alle states; output rausfinden, fertig

# boolsche logik
    vereinfachungsregeln
    ![boolregeln](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/boolregeln.png)

## KV-Diagramm
Wie Formen?
```
    bei 2 Values:
        A   -A    
    B
    -B

    bei 4 Values:
        AB  -AB -A-B    A-B
    CD
    -CD
    -C-D
    C-D

    bei 3 Values:
        A   A  -A  -A
    B
    -B
        C  -C   -C   C
```

### Disjunktive Normalform
Lohnt sich, wenn mehr 0 als 1
    Suche gerade Anzahl von 1er Feldern nebeneinander
    Finde Variable die ihren State nicht ändert --> Dies ist die für dieses Feld gesuchte Variable
    Sollte jede Variable sich verändern, ist jede Variable zu berückstichtigen
    Verschiedene Variablen einer Teillösung mit einem v verketten
    "Addiere" die Teillösungen mit einem n
    Fertig ^^

Bsp
```
        A   A   -A  -A
    B   1   0   1   1
    -B  1   0   1   1
        C   -C  -C  C
```

Felder [4er Block, beinhaltet Collumn -A -A | 2er Block, beinhaltet A]
```
        A   A   -A  -A
    B   !1   0   !1  !1
    -B  !1   0   !1  !1
        C   -C  -C  C
```
    Teillösungen: A n C und -A
    GesamtLösung: (A n C) v -A
    (vereinfachung: (A v -A) n (C v -A) --> -A v C  )

Bsp
```
              AB
           00  01  11  10
    cd  00  1   1   0   0
        01  0   1   1   1
        11  0   1   1   1
        10  0   1   0   0

    --> (-C n -D n -A) v (-A n B) v (A n D)
```

### Konjunktive Normalform
Lohnt sich, wenn mehr 1 als 0
    Das selbe wie oben, diesmal mit 0
    verbinde die !invertierten! Variablen einer Teillösung mit v 
    Teillösungen mit n verbinden
    Profit!

Bsp
```
        A   A   -A  -A
    B   1   0   1   1
    -B  1   0   1   1
        C   -C  -C  C
```
    Felder [2er Block, beinhaltet A]
        A   A   -A  -A
    B   1   !0   1   1
    -B  1   !0   1   1
        C   -C  -C  C
```
    Teillösung: -A v C
    Gesamtlösung: -A v C        // huch, das ist ja das selbe wie oben...also alles richtig gemacht ^^

Bsp
```      
              AB
        00  01  11  10  
    CD  00  1   1   0   0
        01  0   1   1   1
        11  0   1   1   1
        10  0   1   0   0

    --> (A v B v -C) n (-A v D) n (A v B v -D)
```    

## Addition mit Elektronen
Achtung! Die Eingänge entsprechen keinen Bit-Zahlen sondern elektr. Strömen <\br>
--> 101 !=5 sondern 2 (weil 2* true)

### Halbaddierer
benötigt: und-Gatter, =1 gatter
![Halbaddierer](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/Halbaddierer.png)

### Volladdierer
benötigt: 2 Halbadd, >=1 Gatter
![Volladdierer](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/Volladdierer.png)