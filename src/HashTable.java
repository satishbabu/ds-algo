public class HashTable<K, V> {

    public static final int BUCKET_SIZE = 16;
    Node<K, V>[] entries = new Node[BUCKET_SIZE];

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> node = new Node<K, V>(key, value);

        if (entries[index] == null) {
            entries[index] = node;
        } else {
            Node<K, V> list = entries[index];
            while (list.next != null)
                list = list.next;
            list.next = node;
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        if (entries[index] == null)
            return null;

        Node<K, V> list = entries[index];
        while (!list.key.equals(key) && list.next != null)
            list = list.next;

        return list.value;
    }

    private int getIndex(K key) {
        int hash = key.hashCode();
        hash = hash % BUCKET_SIZE;
        hash = Math.abs(hash);
        return hash;
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
