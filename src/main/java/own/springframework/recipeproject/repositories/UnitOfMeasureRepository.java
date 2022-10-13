package own.springframework.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import own.springframework.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long > {
    Optional<UnitOfMeasure> findByUom(String uom);
}
