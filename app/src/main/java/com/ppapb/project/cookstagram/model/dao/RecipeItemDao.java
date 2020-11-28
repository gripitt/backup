package com.ppapb.project.cookstagram.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import com.ppapb.project.cookstagram.model.entity.RecipeItem;
import java.util.List;

/**
 * Dao that builds the recipe_item table.
 */
@Dao
public interface RecipeItemDao {

  /**
   * Inserts a RecipeItem
   * @param recipeItem
   * @return
   */
  @Insert
  long insert(RecipeItem recipeItem);

  /**
   * Inserts many RecipeItem
   * @param recipeItems
   * @return
   */
  @Insert
  List<Long> insert(RecipeItem... recipeItems);
  /**
   * Inserts many RecipeItem
   * @param recipeItems
   * @return
   */
  @Insert
  List<Long> insert(List<RecipeItem> recipeItems);

}
