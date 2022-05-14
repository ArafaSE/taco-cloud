package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.dto.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

