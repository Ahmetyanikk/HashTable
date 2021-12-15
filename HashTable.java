
/**
 * @file HashTable.java
 * @date Mar 30, 2018 , 4:43:17 PM
 * @author Muhammet Alkan
 */
public class HashTable<T, G> {

    // Linear Probing (Closed Hashing)
    private HashEntry<T, G>[] table;

    public HashTable(int size) {
        table = new HashEntry[size];
    }
    
    // Linear Probing
    public void put(T key, G value) {
        // YOUR CODE HERE
        int p = 0;
         int hashResult = hashFunction(key);
        int hash = hashResult % table.length;
        while (p<table.length ) {
           
         
        }
         
            if (table[hash] == null) {
                table[hash] = new HashEntry(key, value);
                             
            } else {
                table[hash].value=value;
                 hash = (hash + 1) % table.length;
                
            }
               p++;
            
        

    }

    public G get(T key) {
        int hashResult = hashFunction(key);
        int index = hashResult % table.length;

        if (table[index] != null && table[index].key.equals(key)) {
            return table[index].value;
        }

        System.out.println("key \"" + key + "\" not found !");
        return null;
    }

    private int hashFunction(T key) {
        String temp = String.valueOf(key);
        int first = Integer.parseInt(temp.charAt(0) + "");
        int last = Integer.parseInt(temp.charAt(temp.length() - 1) + "");

        return first + last;
    }

    public void printTable() {

        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            if (table[i] != null) {
                System.out.println("[" + table[i].key + " : " + table[i].value + "] ");
            } else {
                System.out.println("null");
            }
        }
    }
}
