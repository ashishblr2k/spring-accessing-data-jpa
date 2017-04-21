package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by agup101 on 4/21/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
