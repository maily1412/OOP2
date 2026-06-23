package praktikum3.mailyproject;

public class DoLiStudi {

    private Node first,last;

    DoLiStudi(){
        this.first = null;
        this.last = null;
    }

    public String toString(){
        String s = "Erster Knoten: " + first + "\nLetzter Knoten: " + last + "\nAlle Knoten:\n";

        if(first == null){  
            return s + "Liste ist leer!";
        } else {
            return s + first.toStringAllNodes();
        }    
    }

    /*
    public void updateFirst(Node newNode){
        if(first != null){
            newNode = first;
        } else{
            first = newNode;
            last = newNode;
        }
    }
    */

   private void updateFirst(Node oldNode, Node newNode){
        if(oldNode == first){
            first = newNode;
        }
    }


    private void updateLast(Node oldNode, Node newNode){
        if(oldNode == last){
            last = newNode;
        }
    }


    public void insertInOrder(Studi newStudi){
        //gibt es schon ein Knoten in der Liste?
        if(first == null){
            //wenn nein, dann Liste leer
            //jetzt wird dann erste Knoten in Liste eingefügt
            first = new Node(newStudi);
            last = first;
        }
        //wenn ja, dann sortieren wir neuen Studi ab diesem Knoten in Liste der Knoten ein
        else {
            first.insertInOrder(new Node(newStudi));
        }
    }


    private class Node{
        private Studi payload;
        private Node next,prev;

        Node(Studi s){
            this.payload = s;
            this.next = null;
            this.prev = null;
        }

        public String toString(){
            return " Knoten- |" + payload.toString() + "|" ;
        }

        public String toStringAllNodes(){
            String s = "";
            for(Node n = first; n != null; n = n.next){
                s += n.toString() + "\n";
            }
            return s;
        }

        public void insert(Node newNode){
            newNode.next = this; //1
            newNode.prev = this.prev; //2

            if(this.prev != null){
                this.prev.next = newNode; //3
            }

            this.prev = newNode; //4
        }

        public void append(Node newNode){
            newNode.next = this.next; //1

            //Wenn es einen Nachfolger gibt
            if(this.next != null){
                this.next.prev = newNode; //2
            }

            this.next = newNode; //3
            newNode.prev = this; //4
        }

        public void insertInOrder(Node neu){
            //Nutzlast von this und neu vergleichen
            int vergleich = neu.payload.compareTo(this.payload);

            //Fallunterscheidung
            //Fall =0 -> nichts einfügen
            if(vergleich == 0)
                return;

            //Fall >0 d.h. neu.nutzlast ist größer als this.nutzlast
            if(vergleich > 0){
                //Dies tritt ein, wenn der richtige Platz noch nicht gefunden wurde und die Liste weiter durchlaufen werden muss
                //Ist da ein nächstes Element?
                if(this.next != null){
                    //Ja, dann den neuen Knoten in die Liste HINTER this einfügen
                    this.next.insertInOrder(neu);
                }
                //Nein, dann direkt AN this hängen
                else{
                    this.append(neu);
                    updateLast(this, neu);
                }
            }

            //Fall <0 d.h. neu.nutzlast ist kleiner als this.nutzlast
            if(vergleich < 0){
                //neu direkt VOR this einfügen
                this.insert(neu);
                updateFirst(this, neu);
            }
        }
    }
}
