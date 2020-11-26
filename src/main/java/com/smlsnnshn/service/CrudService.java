package com.smlsnnshn.service;

import java.util.List;

public interface CrudService<T,ID> {

    T save(T role);
    T findById(ID id);
    List<T> findAll();
    void delete(T object);
    void deleteById(ID id);

}
