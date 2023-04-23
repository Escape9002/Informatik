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