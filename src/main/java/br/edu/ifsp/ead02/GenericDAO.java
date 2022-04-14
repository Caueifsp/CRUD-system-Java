package br.edu.ifsp.ead02;

import java.util.Map;

public interface GenericDAO <T, K> {
    void insert(T object);
    T findOne (K primaryKey);
    void findAll();
    void update(T object);
    void remove(K primaryKey);

}
