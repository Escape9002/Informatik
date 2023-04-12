
# reguläre Sprachen
Reguläre Sprache ist, was durch eine endliche Menge an Zuständen beschrieben werden kann. Er ist deterministisch (vorhersehbar endlich) <\br>
Bezeichnet durch: G(Grammatik) = {Z(ustandsmenge), E(ingabealphabet), Z(Startzustand), P(rogramm) }

Bsp:
    Mögl. Wörter: aabb; aaabbbbbbb; abbbb
    G = {E, V, S, P}
    E = {a,b}
    V = {S}
    Startpunkt S
    P = {S --> aA, A --> aA | bB,B --> bB | [Endzustand]}

Was nicht möglich ist, ist Sachen zu speichern, hierfür benötigt man einen Kellerautomaten. <\br>
Kellerautomaten gehen wenn nötig einen Schritt tiefer in den Keller und speicher so ihren Zustand. Beim "verlassen" des Kellers wird eine Aktion ausgeben. Diese Rekursion kann undendlich tief gehen (der Automat ist NICHT deterministisch) <\br>
Bsp:
    Mögl. Wörter: aaxbb, aaaaxbbbb
    G = {E, V, S, P}
    E = {a,b,x}
    V = {S}
    Startpunkt S
    P = {S --> aSb | x}