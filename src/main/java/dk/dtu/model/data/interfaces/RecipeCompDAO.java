package dk.dtu.model.data.interfaces;

import dk.dtu.model.DTO.RecipeCompDTO;

import java.util.List;

public interface RecipeCompDAO {
	RecipeCompDTO getRecipeComp(int recipeId, int produceId) throws DALException;
	List<RecipeCompDTO> getRecipeCompList(int recipeId) throws DALException;
	List<RecipeCompDTO> getRecipeCompList() throws DALException;
	void createRecipeComp(RecipeCompDTO recipecomponent) throws DALException;
}
