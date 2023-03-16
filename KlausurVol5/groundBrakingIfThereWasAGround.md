## lol, ignore if you want:
# LZW:
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

# Huffman:
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

## Ab hier wirds wichtig...

# Baumsetheorie
    Preorder: wlr
    postorder: lrw
    inorder: lwr
    
    test:
        ![Ordering](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/ordering.png)
    
    preorder:  1 2 4 5 6 3
    postorder: 5 6 4 2 3 1
    inorder:   5 4 6 2 1 3

    binäre bäume können:
        unausgewogen: eine seite hat 2 mehr ebenen als die andere (ebenen gelten nur wenn voll besetzt) 
        ausgewogen: die abstände sind max 1 ebene 
        vollständig: alle knoten haben (2 || 0) nachfolger

    Bsp: ![BaumeBeschweren](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/BaumeBeschweren.png)

# boolsche logik
    vereinfachungsregeln
    ![boolregeln](https://github.com/Escape9002/Informatik/blob/main/KlausurVol5/boolregeln.png)

    KV-Diagramm:
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
mini max spanning 
map coloring 
kruskal
dijskatra
tiefen/breite

# Rekursion
laufzeit
sortier