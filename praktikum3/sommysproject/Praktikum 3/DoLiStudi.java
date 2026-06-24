/**
 * 2a) Definieren Sie die beiden oben beschriebenen Klassen DoLiStudi und Node mit den
entsprechenden Instanz-Variablen.
 */
class DoLiStudi {

    private Node first, last; // Head and tail of the linked list

    // 2c) leerer Konstruktor
    public DoLiStudi() {

    }


/*####################### Innere Klasse #######################  */    
    private class Node {

        private DoLiStudi payload; //Nutzlast
        private Node next, prev; //Verweis auf das nächste und das vorherige Element

        //2b)Konstruktor
        public Node(DoLiStudi payload, Node next, Node prev) {
            this.payload = payload;
            this.next = null;
            this.prev = null;
        }

        /*3a) Zunächst redefinieren Sie in Node die Standard-Methode 
        von Java um für ein Objekt einen beschreibenden String zu erzeugen. */
        public String toString() {
            String liste = "";
            return liste;
        }

    }
/*####################### Innere Klasse #######################  */     

} // End of class DoLiStudi