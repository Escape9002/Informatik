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

## ER-Modell (entity relationship modell)
    Rundes ding halt

    Eckiger Body als Header
    kreise mit strich als Variablen

    Verbindungsvariablen als Rauten zwischen 2 Tabellen, 
    diese haben beide Primärschlüssel als Fremdschlüssel drin