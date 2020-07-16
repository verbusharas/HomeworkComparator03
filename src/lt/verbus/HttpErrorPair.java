package lt.verbus;

public class HttpErrorPair<K, V extends HttpCode> implements Comparable<HttpErrorPair<K, V>>{
    private K key;
    private V value;

    public HttpErrorPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue(){
        return value;
    }

    public K getKey() {
        return key;
    }

    @Override
    public int compareTo(HttpErrorPair<K, V> o) {
        return ((ErrorLevels)o.getValue().getErrorLevel()).numericLevel() - ((ErrorLevels)this.getValue().getErrorLevel()).numericLevel();
    }

    @Override
    public String toString() {
        return "HttpError [" + key + "], " + value;
    }
}
