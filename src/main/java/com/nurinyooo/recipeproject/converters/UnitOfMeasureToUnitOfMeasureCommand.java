package com.nurinyooo.recipeproject.converters;

import com.nurinyooo.recipeproject.commands.UnitOfMeasureCommand;
import com.nurinyooo.recipeproject.domain.UnitOfMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UnitOfMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasureCommand convert(UnitOfMeasure source) {
      if(source != null){
          final UnitOfMeasureCommand uomc = new UnitOfMeasureCommand();
          uomc.setId(source.getId());
          uomc.setDescription(source.getDescription());
          return uomc;
      }
      return null;
    }
}
