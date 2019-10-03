package com.nurinyooo.recipeproject.converters;

import com.nurinyooo.recipeproject.commands.CategoryCommand;
import com.nurinyooo.recipeproject.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;

@Controller
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {


    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if(source == null){
            return null;
        }

        final CategoryCommand categoryCommand = new CategoryCommand();

        categoryCommand.setId(source.getId());
        categoryCommand.setDescription(source.getDescription());

        return categoryCommand;
    }
}
