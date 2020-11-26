package com.smlsnnshn.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T, ID>{

    protected Map<ID, T> map = new HashMap<>();

    T save(ID id, T object){
        map.put(id, object);
        return object;
    }

    T finbById(ID id){
        return map.get(id);
    }

    List<T> findAll(){
        return new ArrayList<>(map.values());
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

}

