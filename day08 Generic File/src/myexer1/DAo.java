package myexer1;

import java.util.*;

/**
 * @author 孟享广
 * @create 2020-06-12 4:10 下午
 */
public class DAo<T> {

    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity){
        map.put(id, entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id, T entity){
        if (map.containsKey(id)){
            map.put(id,entity);
        }
    }
    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>();
        for (T t: values){
            list.add(t);
        }
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }






}
