public class Box<K,V> {
    private K keyObj;
    private V valueObject;

    public void put(K keyObj, V valueObject){
        this.keyObj = keyObj;
        this.valueObject = valueObject;


    }

    public K getKey(){
        return keyObj;
    }

    public V getValue(){
        return valueObject;
    }

    public void setKey(K keyObj){
        this.keyObj = keyObj;
    }

    public void setValue(V valueObject){
        this.valueObject = valueObject;
    }
}
