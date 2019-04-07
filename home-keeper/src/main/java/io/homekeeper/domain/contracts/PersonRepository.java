/**
 * 
 */
package io.homekeeper.domain.contracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.homekeeper.domain.model.Person;

/**
 * @author JC
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>
{
}
