package uz.jl.services;

/**
 * @author Elmurodov Javohir, Mon 5:44 PM. 12/6/2021
 */

import java.util.List;

/**
 * @param <E> -> Entity (Db Table representation)
 * @param <R> -> Repository (Which executes SQL queries)
 * @param <M> -> Mapper (Which maps entity to Dto or vise versa)
 */

public abstract class BaseService<E, R, M> {
    protected R repository;
    protected M mapper;

    public BaseService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    protected abstract List<E> getAll();

    protected abstract E get(String id);


}
