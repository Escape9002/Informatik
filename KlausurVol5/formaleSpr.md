# Formale Sprachen
## Alphabet Wort Sprachen
    Alphabet E (epsylon oder so) : E = {m,o,t,0}
    Damit mögl. Wörter: tom, mot, omt,...
    Es gibt auch das leere Wort (hier als 0 gekennzeichnet)
    Diese Wörter sind teil einer Sprache L = {mot, tom,...}
    L = {} \\ Leere Sprache
    --------------------------
    Reguläre Sprachen: Endliche Zustände! Bsp: Emailadressen
    Kontextfreie: Kellerautomaten (basicly stack --> rekursion) Bsp: unendlich lange emailadressen bauen

## MealyAutomaten
    Mealy-Automaten können bei jedem erreichtem Zustand eine Ausgabe tätigen.
    Hier gibt es E1(Eingabealphabet), Q(Zustände), s=Q (Startzustand), E2 (Ausgabealphbet)
    --------------------------    
    Normalerweise werden die Automaten als Graph angegeben. Knoten sind Zustände (Q), Kanten werden mit E1 und zugehöriger E2 beschriftet. Eingaben die nicht akzeptiert werden lösen den Fehlerzustand qF aus, dieser muss nicht im Graphen zu sehen sein, jedoch in der Zustadstabelle!

### Bsp(reguläre Sprache): 
    E1 = {l,o,g}
    Q = {q0, q1, q2}
    s = q0
    E2 = {Nö,mach,ich,nich,0}
### Übergangstabelle
    eingabe/alt	l	o	g
    q0	q1	qF	qF
    q1	qF	q2	qF
    q2	qF	qF	end 
    -----------------------    
    Ausgabe/alt	l	o	g
    q0	'l'	qF	qF
    q1	qF	'o'	qF
    q2	qF	qF	'g'
## DEA (Deterministische endliche Automaten)
    zB: MealyAutomaten
    Startzustand markieren mit Pfeil drauf
    Endzustand markieren mit doppeltem Kreis
    ---------------------------
    Durch endliche Zuständeund Eingabealphabet kann man mit DEA's besonders gut auf Gültigkeit prüfen! 
    
