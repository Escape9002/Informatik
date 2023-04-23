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
