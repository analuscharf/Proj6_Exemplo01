package ads.bcd.Exemplo01_umaparaum.repository;

import org.springframework.data.repository.CrudRepository;

import ads.bcd.Exemplo01_umaparaum.model.Endereco;

/**
 * The goal of the Spring Data repository abstraction is to significantly reduce
 * the amount of boilerplate code required to implement data access layers for
 * various persistence stores.
 *
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories
 *
 * Métodos herdados da interface CrudRepository
 * https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
 *
 * <S extends T> S save(S entity); // para persistir no BD a entidade
 *
 * Optional<T> findById(ID primaryKey); // para obter uma entidade que possua um
 * determinado ID
 *
 * Iterable<T> findAll(); para retornar todas entidades
 *
 * long count(); // para retornar o total de entidades
 *
 * void delete(T entity); // para excluir uma entidade
 *
 * boolean existsById(ID primaryKey); // para verificar se existe uma entidade
 * com determinado ID
 *
 */
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {

}