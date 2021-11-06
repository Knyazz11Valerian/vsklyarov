package HW9;

public class CustomCollectionImpl implements CustomCollection {
    private Link head;
    private int size = 0;

    private static class Link {
        private final String value;
        private Link next;

        private Link(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public boolean add(String str) {
        if (head == null) {
            head = new Link(str);
            size++;
            return true;
        }
        Link currentLink = head;
        while (currentLink.next != null) {
            currentLink = currentLink.next;
        }
        currentLink.next = new Link(str);
        size++;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String s : strArr) {
            add(s);
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        for (int i = 0; i < strColl.size(); i++) {
            add(strColl.get(i));
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        Link prevLink = head;
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            head = prevLink.next;
            return true;
        }
        for (int i = 0; i < index - 1; i++) {
            prevLink = prevLink.next;
        }
        Link currentLink = prevLink.next;
        prevLink.next = currentLink.next;
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        if (head == null) {
            return true;
        }
      //  if (head.value.equals(str)) {
      //      return false;
      // }
        if (head.value.equals(str)) {
            head = head.next;
            size--;
            return true;
        }

        Link currentLink = head;
        while (currentLink.next != null) {
            if (currentLink.next.value.equals(str)) {
                currentLink.next = currentLink.next.next;
                size--;
                return true;
            }
            currentLink = currentLink.next;
        }
        size--;
        return true;

    }

    @Override
    public String get(int index) {
        if (index < 0 || index > size) {
            return ("Index out of range");
        }
        Link currentLink = head;
        for (int i = 0; i < index; i++) {
            currentLink = currentLink.next;
        }
        return currentLink.value;
    }

    @Override
    public boolean contains(String str) {
        Link currentLink = head;
        while (currentLink != null) {
            if (currentLink.value.equals(str)) {
                return true;
            } else {
                currentLink = currentLink.next;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        head = null;
        size=0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean equals(CustomCollection coll) {
        if (this == coll) {
            return true;
        }
        if (this.size != coll.size()) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            String eOfFirstCol = this.get(i);
            String eOfSecondCol = coll.get(i);
            if ((eOfFirstCol != null && !eOfFirstCol.equals(eOfSecondCol)) || (eOfFirstCol == null && eOfSecondCol != null)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "CustomCollectionImpl{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}