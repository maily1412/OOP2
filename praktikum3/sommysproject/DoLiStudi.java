package Praktikum3;
/**
 * 2a) Definieren Sie die beiden oben beschriebenen Klassen DoLiStudi und Node mit den
entsprechenden Instanz-Variablen.
 */
class DoLiStudi {

    private Node first, last; // Head and tail of the linked list

    // 2c) leerer Konstruktor
    public DoLiStudi() {

    }


    /*3 c) Zum Schluss redefinieren Sie die Standard-Methode von Java zur Umwandlung eines Objekts in
           einen String in der Klasse DoLiStudi
           Hinweis: Verwenden sie dafür eine der oben definierten Methoden
           Hinweis: Prüfen Sie ggf. vor einem Methodenaufruf für eine Variable, ob diese nicht null ist */ 
    public String toString() {
        
        String liste = "Liste: " + "\n";

        if (this.first == null) {
            return "Die Liste ist leer.";
        }
        for (Node current = this.first; current != null; current = current.next) {
            liste += current.toString() + ", ";
        }
        return liste;
    }

    /* 4e)  Schreiben Sie nur in der Klasse DoLiStudi eine Methode updateFirst(), der ein „altes“
            und ein „neues“ Knoten-Objekt übergeben wird. Das „neue“ Objekt wurde vor dem „alten“ Objekt
            eingefügt. Die Methode prüft, ob „alt“ das bisher erste Element in der Liste war. Wenn das der Fall
            ist, wird die Referenz auf das erste Element der Liste auf das „neue“ Knoten-Objekt aktualisiert.  */
    private void updateFirst(Node alt, Node neu) {
        if(this.first == alt) {
            this.first = neu;
        }
    }

    /*4f) Schreiben Sie auf ähnliche Art eine Methode updateLast(), die in der Klasse DoLiStudi
          prüft, ob ein neu hinzugefügtes Element als letztes Element hinten an die Liste angehängt wurde –
          und dann die Referenz auf das letzte Element der Liste aktualisiert. */
          private void updateLast(Node alt, Node neu) {
            if(this.last == alt) {
                this.last = neu;
            }


    }

    // 5a) für DoLiStudi
    public void insertInOrder(Studi payload) {
        Node neu = new Node(payload);               // neuer Knoten wird erstellt
        if (this.first == null) {                   // wenn Liste leer ist
            this.first = neu;                       // -> dann ist neu das erste Element der Liste
            this.last = neu;                        // -> und gleichzeitig auch das Lezte Element der Lista
        } else {
            this.first.insertInOrder(neu);          // ansonsten wird neu sortiert eingefügt.
        }
    }


/*############################################## Innere Klasse ##############################################  */    
    private class Node {

        private Studi payload; //Nutzlast
        private Node next, prev; //Verweis auf das nächste und das vorherige Element

        //2b)Konstruktor
        public Node(Studi payload) {

            this.payload = payload;
        }

        /*3a) Zunächst redefinieren Sie in Node die Standard-Methode 
        von Java um für ein Objekt einen beschreibenden String zu erzeugen. */
        public String toString() {
            return this.payload.toString();
        }

            /*3b) Definieren Sie eine weitere Methode, die entweder iterativ (d.h. mittels einer Schleife) oder
rekursiv die String-Beschreibungen aller Node -Objekte ab dem Ziel-Node-Objekt, zusammenbaut,
d.h. sie konkateniert diese Strings, jeweils mit Komma und Leerzeichen voneinander getrennt. */
    public String toStringAll() {

        String nodeBeschreibung = "Stringbeschreibung Node-Objekte"; 
        for(Node current = first; current != null; current = current.next) {
            nodeBeschreibung += current.toString() + ", ";
        }

        return nodeBeschreibung;
     }

     /*4b) Imoplementieren Sie nur in der Klasse Node dafür die Methode insert(), die einen neuen Knoten VOR
     dem Zielknoten einfügt */
     private void insert(Node neu) {
        neu.next = this;
        neu.prev = this.prev;
        if (this.prev != null) {
            this.prev.next = neu;
        }
        this.prev = neu; 

     }

     /*4d) Implementieren Sie in der Klasse Node dafür die Methode append(), die einen neuen Knoten NACH
     dem Zielknoten einfügt */
     private void append(Node neu) {
        neu.next = this.next;
        if (this.next!= null) {
            this.next.prev = neu;
        }
        this.next = neu;
        neu.prev = this;
     }

     /*5a)  Schreiben Sie nun die Methoden insertInOrder() für Node und DoLiStudi, um ein
            neues Element sortiert in die Liste einzufügen.
            Dabei verwenden Sie die in Aufgabe 4 erstellten Methoden insert() bzw. append()!
            Nach dem Aufruf der Methoden insert() bzw. append() jeweils für einen Node rufen
            Sie die passende Methode updateFirst() bzw. updateLast() auf.
            Für den Vergleich zweier Studi-Objekte nutzen Sie die Methode compareTo() aus 1c)
            Implementieren Sie diese Methode entweder iterativ, d.h. mit Hilfe einer Schleife, oder rekursiv */
        private void insertInOrder(Node neu) { 
            int comparison = neu.payload.compareTo(this.payload);
                
                // Fall 1:Es handelt sich um den gleichen Studi, keine Einfügung erforderlich.
                if(comparison == 0){
                    return; 
                }
                // Fall 2: neu ist größer als this
                if(comparison > 0) {                    
                    if(this.next != null) {             // nächstes Element exisiert 
                        this.next.insertInOrder(neu);   // Knoten wird hinter this eingefügt
                    } else {
                        this.append(neu);               // wenn nicht, dann wird neu angehängt
                        updateLast(this, neu);           // Referenz auf das letzte Element wird aktualisiert
                    }
                }
                // Fall 3: neu ist kleiner als this
                if(comparison < 0) {                   
                    this.insert(neu);                 // Knoten wird vor this eingefügt
                    updateFirst(this, neu);             // Referenz auf das erste Element wird aktualisiert

                }
 
            
        }

    } // End of inner class Node
/*############################################## Innere Klasse ##############################################  */     

 
}// End of class DoLiStudi