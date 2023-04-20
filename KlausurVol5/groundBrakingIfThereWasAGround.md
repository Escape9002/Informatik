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