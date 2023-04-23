In den .md Files ist fast alles wichtige zum jeweiligen Thema drinne, have fun und meldet Fehler! <\br>
Gerne auch über die Issues bzw Pull-Requests gleich ne Lösung dazu ^^ 

# Folgend alle Dateien in einer ReadeMe, geordneter in den einzelnen Dateien, please refer to them!

Dieses Kapitel hängt dicht mit Aalgorithmen.md zsm!

# Graphentheorie
    Einiges ist vlt doppelt, idk, have fun
    Graph besteht aus: Knoten + Kanten
    Der Grad eines Knoten sind die Kanten, die ein Knoten hat

## Grundbegriffe:
    Zug: knoten/kanten dürfen mehrmals vorkommen
    Weg: nur 1x durchlaufen (knot/ kant)
    geschl weg/zug: Start und endknoten sind identisch
    Zyklus: geschl. Kantenzug
    gewichteter / gerichteter graph: selbsterklärend sry...
    vollständiger Grap: alle knoten mit alle knoten verbunden

## Eulerzug
    Kantenzug in dem jede Kante genau einmal vorkommt. 
    Vorraussetzung: 
        Graph ist zsmhängend
        Alle Knoten haben geraden Grad
        genau 2 Knoten haben ungeraden Grad

## Geschl Eulerzug
    Zyklus in dem jede Kante genau einmal vorkommt
    Vorraussetzung:
        Graph ist zsmhängend
        alle Knoten haben gerade Grad

## Adjazenzmatrix
    Beschreibt den Zsmhang zwischen versch. Knoten in einer matrix.
    bei kante zwischen Knoten wird 1 eingetragen
    bei ungewichteten Graphen werden die kanten aufgesch mit 0 || 1
    bei gewichteten Graphen mit dem gewicht
    Wenn Matrix symmetrisch zur Diagonalen, dann ist sie ungerichtet.

    bsp:
        A   B   C   D
    A   0   1   2   3
    B   1   0   2   3
    C   2   2   0   4
    D   3   3   4   0

    notice: graph ist gewichtet, ungerichtet, vollständig verknüpft

### ADjazenzliste
    das gleiche, nur halt als liste...
    A = {1,2,3}
    B = {1,2,3}
    ...

## Topologische Sortierung
    existiert eine topo. Sort. so das keine Abhängigkeit verletzt wird?
    gleichebdeutend --> hat der graph keinen Zyklus? 

## Tiefen/Breitensuche
    Dokument hierfür in Aalgorithmen.md !

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


# Formale Sprachen
    Hier gezielt reguläre Sprachen 
    ( erzeugt von einer regulären Grammatik, mehr dazu unten)

    Semantik vs Syntax: Semantik ist die bedeutung/Kontext, der Syntax die Eingabemöglichkeiten
        bsp: syntax korrekt, dann kommen logik / semantische Fehler

### TLD;DR
Reguläre Sprache ist, was durch eine endliche Menge an Zuständen beschrieben werden kann. Er ist deterministisch (vorhersehbar endlich) <\br>
Bezeichnet durch: G(Grammatik) = {Z(ustandsmenge), E(ingabealphabet), Z(Startzustand), P(rogramm) }

Bsp:
```
    Mögl. Wörter: aabb; aaabbbbbbb; abbbb
    G = {E, V, S, P}
    E = {a,b}
    V = {S}
    Startpunkt S
    P = {S --> aA, A --> aA | bB,B --> bB | [Endzustand]}
```
Was nicht möglich ist, ist Sachen zu speichern, hierfür benötigt man einen Kellerautomaten. <\br>
Kellerautomaten gehen wenn nötig einen Schritt tiefer in den Keller und speicher so ihren Zustand. Beim "verlassen" des Kellers wird eine Aktion ausgeben. Diese Rekursion kann undendlich tief gehen (der Automat ist NICHT deterministisch) <\br>
Bsp:
```
    Mögl. Wörter: aaxbb, aaaaxbbbb
    G = {E, V, S, P}
    E = {a,b,x}
    V = {S}
    Startpunkt S
    P = {S --> aSb | x}
```
    
## Alphabet Wort Sprachen
    Alphabet E (epsylon oder so) : E = {m,o,t,0}
    Damit mögl. Wörter: tom, mot, omt,...
    Es gibt auch das leere Wort (hier als 0 gekennzeichnet, normalerweise als e [inhaltszeichen von mathe oder so...])
    Diese Wörter sind teil einer Sprache L = {mot, tom,...}
    L = {} \\ Leere Sprache
    --------------------------
    Reguläre Sprachen: Endliche Zustände! Bsp: Emailadressen
    Kontextfreie: Kellerautomaten (basicly stack --> rekursion) Bsp: unendlich lange emailadressen bauen

### Definition Grammatik
    N : Nichtterminalsymbole    
    T : Terminalsymbole
    S e N : Startsymbol
    P : Produktionsregeln
    Grammatik G = (N, T, S, P)

    Optionsklammern : {}
    Wiederholungsklammern : []
    Gruppierungsklammern : ()
    Alternative: |
    
### Def. Reguläre Grammatik
    N = {A, B, C, ...}
    T = {a, b, c, ...}
    P = {A --> aB | B, B --> bC | C, ...}

    Diese Grammatik ist rechtsregulär, denn 1x N folgt auch 1x T
    Linksregulär wäre 1xT auf 1x N 
    zB: P = { A --> Ba}
    
## MealyAutomaten
    Mealy-Automaten können bei jedem erreichtem Zustand eine Ausgabe tätigen.
    Hier gibt es E1(Eingabealphabet), Q(Zustände), s=Q (Startzustand), E2 (Ausgabealphbet)
    --------------------------    
    Normalerweise werden die Automaten als Graph angegeben. Knoten sind Zustände (Q), Kanten werden mit E1 und zugehöriger E2 beschriftet. Eingaben die nicht akzeptiert werden lösen den Fehlerzustand qF aus, dieser muss nicht im Graphen zu sehen sein, jedoch in der Zustadstabelle!

    MealyAutomaten haben keinen Endzustand!

### Bsp(reguläre Sprache): 
    E1 = {l,o,g}
    Q = {q0, q1, q2}
    s = q0
    E2 = {Nö,mach,ich,nich,0}

### Übergangstabelle
    eingabe/alt	l	o	g
    q0	        q1	qF	qF
    q1	        qF	q2	qF
    q2	        qF	qF	end 
    -----------------------    
    Ausgabe/alt	l	o	g
    q0	        'l'	qF	qF
    q1	         qF	'o'	qF
    q2	        qF	qF	'g'

## DEA (Deterministische endliche Automaten)
    zB: MealyAutomaten
    Startzustand markieren mit Pfeil drauf
    Endzustand markieren mit doppeltem Kreis
    ---------------------------
    Durch endliche Zuständeund Eingabealphabet kann man mit DEA's besonders gut auf Gültigkeit prüfen! 

### ER und UML

## Kardinalitäten
    4 Aufträge zu 1 Kunden; n ... 1
    1 KundenNr zu 1 Kunden; 1 ... 1
    4 Gerichte zu 40 SChülern; n ...m

    Primärschlüssel: Eindeutige zuweisung auf den Datensatz mögl. 
        Kennzeichnung durch unterstreichen
    Fremdschlüssel: Primärschl. aus anderer Tabelle eintragen
        Kennzeichnung durch Pfeil nach oben
        Ziel: Basicly Verbindungstabelle bei n ..m Beziehungen

## Normalformen
    TL,DR:
    1NF: Alle Attributwerte atomar
    2NF: Alle NSA hängen vom Prim.schl. ab
    3NF: Alle NSA sind voneinander unabhängig

### 1. Normalform
    Eine Relation ist in der 1NF, wenn alle Attributwerte atomar (einzeln) sind.

    Gegenbeispiel: Adresse: { Str + PLZ  + Ort ( String)} 
    Richtig: addresse: {Ort, PLZ, Str}

### 2. Normfalform
    Eine Relation ist in der 2NF wenn alle Nichtschlüsselattr (NSA) vom ges. Primärschl abhängig sind.
    Klartext: keine n ... m Beziehungen pls
    Gegenbeisp: Schül.: {Hobby1, Hobby2, Hobby3}
    Richtig: SChül.: {SchlNr} | Hobby: {HobbyNR, HobbyName} | SChülHob: {HobbyNR, SchülNR}

### 3Nf
    Eine Relation ist in der 3Nf wenn alle nichtschl attr voneinander unabhängig sind.

    Alter = Jetziger Zeitpunk - Geburtsdatum 
    Gegenbsp: Schl.: {Geburtsdatem, Alter}
    Richtig: Schl.: {Geburtsdatum}

## UML (unified Modelling Language)
    Das eckige Dingens halt, praktisch fürs programmieren...
    
    Header(Klassennamen)
    (private|public) variablennamen : Typ

    Ein Strich zwischen 2 Klassen ist eine Verbindung mit Kardinalitäten ( 1..n, n..m)
    Es gibt keine Verbindungstabellen

### Programming spez.
    dünner Pfeil: assoziation ( Object lel = new Object();)
    dicker Pfeil: vererbung ( extends Object)    

## ER-Modell (entity relationship modell)
    Rundes ding halt

    Eckiger Body als Header
    kreise mit strich als Variablen

    Verbindungsvariablen als Rauten zwischen 2 Tabellen, 
    diese haben beide Primärschlüssel als Fremdschlüssel drin

## (optimiertes) Relationals Datenbankschema
    Fremdschlüssel: Pfeil nach oben
    Primärschlüssel: unterstreichen
    
    Stil: Tabellenname = {primär, attr1, attr2, Fremdschlüssel}

# Verschlüsselung n stuff
## 3 Grundprinzipien
    Vertraulichkeit ( niemand außer dem Empfänger [+sender] kann die nachricht lesen)
    integrität ( nicht verändert)
    autentizität (der absender tatsächlich der Absender)

    Eng: confidentily integrity authenticity -_-> CIA WWWWWWWHHHHHHHAAAAAAAAAAAAATTTTTT???? 

## Sym vs asym Verschlüsselung
### Symetrisch:
    Ver und Entschl mit dem gleichen SChlüssel
    
    Bsp:
    Caeser-Verschl: Das alphabet wird um X stellen verschoben
    Mit X kann ent und verschlüsselt werden!

    Problem: Wie tauscht man die Schlüssel aus? ( Vertraulichkeit )

### Asymetrisch:
    Ver und Entschl mit versch. Schlüsseln
    Privater schl: entschlüsseln
    Öffi schlüssel: verschlüsseln

    Bsp:
    RSA: man benötigt den öffi Schlüssel von person X um Nachricht zu verschlüsseln,
    nur Personen mit privat Schl von Perso X kann entschlüsseln (hoffentlich Vertraulichkeit check)
    Da öffi und privat ein schlüssel paar --> hoffentlich autentizität
    Da nachricht aus öffi schl berechnet schwer umzuformen --> hoffentlich autentizität

    Wichtig: aus privaten schlüssel wird öffi schl generiert
    aus öffi schl darf der private schlüssel nicht berechenbar sein
    bei RSA durch Primfaktorzerlegung gelöst

    aka: Einwegfunktionen f(priavtkey) = öffi key

## Digitale signaturen:
    Bei jeglicher verschl. sollte man eine digi. Signatur mit unterbringen --> garantiert autentizität
    ja nach erstellungsweise der Signatur kann hierdurch integrität und Vertraulichkeit mitgarantiert werden
    
## Hashfunktion
    Text --> f(x) --> ewig langer Hexwert / string whatever
    Bedingung: Hash ist eindeutig für Text und kann nicht umgekehrt werden (einwegfunktion)
    Der hash ähnlicher Eingaben muss vollständig ander sein, um rückschlüssle von einer geknackten Datei auf eine andere zu vermeiden!
    Kollisionsresistent: Bei Kollision (Text1Hash == text2Hash) ist die hash funktion zu klein, dann muss upgrade her ^^ 
    schnelle ausführung muss mögl sein (wert zu hash, nicht anders rum!)
    definierung wie lang der Haswert (sha256 --> 256 Bit)


    Heutzutage typisch: sha256 | HEX-Wert
    Achtung bei MD5 --> ist rückrechenbar --> keine valide hash funk mehr

## Cracking n Hacking:
### Rainbowtables: 
    passwort und hashwerte in einer tabelle 
    --> ausprobieren, Konten mit einem Passwort aus dieser liste --> geknackt

### Buchstabenhäufigkeit
    Bei Caeser und vielen anderen einfach Buchstaben zählen: e ist häufigstes in D --> wenn m häufigstes in Nachricht gilt e = m

### bekannte Worte
    in einem rezept kennt man wörter wie Mehl / Zucker 
    in normalen nachrichten wörter wie die, wie, mit, etc
    --> Buchstabenhäufigkeit nur halt für Wörter

### SQL-Injection
    select user from database where username = 'username' and pwd = 'pwd'
    
    man kann dieser abfrage escapen, in dem man ' Zeichen in seine eingabe mit einbaut
    Eingabe: 1' or 1 == '1
    ... where username = 'usern' and pwd = '1' or 1 == '1'

    Da '1' == '1' immer true ist und or stärker bindet als and, ist die passwortabfrage immer erfolgreich und man kann sich als Usern einloggen. Dieses Prinziep  ist übertragbar auf alle SQL-Statements

# Datensicherheit
Du sollst nicht die Namen und Kreditnummern deiner Kunden im Monatsmeeting veröffentlichen!

# Komprimierungs-Verfahren
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

## UML für OOP lesen
    Duenner Pfeil --> Assoziation (aka mit einbinden an dieser Stelle)
    Dicker Pfeil --> Vererbung (extends [denn implements geht nur für interfaces/abstract class])

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

# Netzneutralität
    „Netzneutralität bezeichnet die Gleichbehandlung von Daten bei der Übertragung im 
    Internet und den diskriminierungsfreien Zugang bei der Nutzung von Datennetzen. 
    Netzneutrale Internetdienstanbieter behandeln alle Datenpakete bei der Übertragung 
    gleich, unabhängig von Sender und Empfänger [und] dem Inhalt der Pakete [...]“ 
    Wikipedia, Artikel „Netzneutralität“, Abruf vom 30.6.2021 (kopiert aus dem Abi-Fundus)

    Siehe auch: Monopol-Bildung bei Abo für priorisierte Pakete

# Graphen
## Gerichtet oder Freigelassen?
	Wenn Adjezentz-Matrix nicht symmetrisch, ist der Graph gerichtet.
	(siehe Abi-Fundus A2)

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