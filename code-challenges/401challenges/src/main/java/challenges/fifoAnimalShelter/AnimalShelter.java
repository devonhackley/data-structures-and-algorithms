package challenges.fifoAnimalShelter;


public class AnimalShelter {
    private Node longest;
    private Node newest;
    private int size;

    public Node getLongest() {
        return longest;
    }

    public void setLongest(Node longest) {
        this.longest = longest;
    }

    public Node getNewest() {
        return newest;
    }

    public void setNewest(Node newest) {
        this.newest = newest;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public AnimalShelter() {
        this.longest = null;
        this.newest = null;
        this.size = 0;
    }

    public void enqueue(Animal animal){
        try {
            Node node = new Node(animal);
            // Check to see if queue is "empty"
            if(this.longest == null && this.newest == null){
                this.longest = node;
                this.newest = node;
                this.size++;
            } else {
                // reassign the newest animal to queue
                Node newNew = this.newest;
                newNew.next = node;
                this.newest = node;
                this.size++;
            }
        } catch(NullPointerException ex){
            System.out.println("Error with the animal you passed in: Check if null");
        }
    }

    public Animal dequeue(String pref){
        Animal temp = null;
        // check to see what user passes in first, should be either a dog or cat
        if(pref.equals("dog") || pref.equals("cat")) {
            if(this.longest != null){
                // if the first animal is equal to that preference, return it
                if(this.longest.val.getType().equals(pref)){
                    temp = this.longest.val;
                    this.longest = this.longest.next;
                    this.size--;
                    return temp;
                }
                Node previous = this.longest;
                Node current = this.longest.next;
                // travese thru queue return animal that matches preference
                while(current != null){
                    if(current.val.getType().equals(pref)){
                        temp = current.val;
                        previous.next = current.next;
                        current.next = null;
                        this.size--;
                    }
                    // reassign to continue to travese
                    previous = current;
                    current = current.next;
                }
            }
        }
        return temp;
    }


    static class Node {
        Animal val;
        Node next;

        public Node(Animal val){
            this.val = val;
            this.next = null;
        }
    }
}
