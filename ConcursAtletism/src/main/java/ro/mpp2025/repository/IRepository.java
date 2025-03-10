package ro.mpp2025.repository;

import java.util.List;

public interface IRepository<T, ID> {
    T findOne(ID id);
    List<T> findAll();
    void save(T entity);
    void update(T entity);
    void delete(ID id);
}