import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {
    HashTable<String, String> hashTable = new HashTable<>();

    @Test
    public void putGet() {
        hashTable.put("Satish", "Babu");
        assertEquals("Babu", hashTable.get("Satish"));
    }

    @Test
    public void getNull() {
        hashTable.put("Satish", "Babu");
        assertNull(hashTable.get("A"));
    }

    @Test
    public void putGetMultiple() {
        // A, Q and QQQ all return 1 for the getIndex
        hashTable.put("A", "aaaa");
        hashTable.put("Q", "qqqq");
        hashTable.put("QQQ", "2qqqq");
        assertEquals("aaaa", hashTable.get("A"));
        assertEquals("qqqq", hashTable.get("Q"));
        assertEquals("2qqqq", hashTable.get("QQQ"));
    }
}