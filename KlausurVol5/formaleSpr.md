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