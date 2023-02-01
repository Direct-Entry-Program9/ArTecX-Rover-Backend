package lk.artech.backend.dao;

import lk.artech.backend.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudDAO<T extends SuperEntity, ID extends Serializable> extends SuperDAO{
    T save(T t);
    void update(T t);
    void deleteById(ID pk);
    Optional<T> findById(ID pk);
    List<T> findAll();
    long count();
    boolean existById(ID pk);
}
