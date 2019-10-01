package com.nurinyooo.recipeproject.converters;

import com.nurinyooo.recipeproject.commands.CategoryCommand;
import com.nurinyooo.recipeproject.domain.Category;
import jdk.internal.jline.internal.Nullable;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory  implements Converter<CategoryCommand, Category> {


    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if(source == null ){
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}