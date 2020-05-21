package com.gabchak.budget.service.mappers;

import com.gabchak.budget.dao.model.Category;
import com.gabchak.budget.service.dto.CategoryDto;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class CategoryMapper extends ConfigurableMapper {

  @Override
  protected void configure(MapperFactory factory) {
    factory
        .classMap(Category.class, CategoryDto.class)
        .byDefault()
        .customize(new RegisterCategoryMapperImpl())
        .register();
  }

  private static class RegisterCategoryMapperImpl extends CustomMapper<Category, CategoryDto> {
    @Override
    public void mapAtoB(Category category, CategoryDto categoryDto, MappingContext context) {
      super.mapAtoB(category, categoryDto, context);
    }

    @Override
    public void mapBtoA(CategoryDto categoryDto, Category category, MappingContext context) {
      super.mapBtoA(categoryDto, category, context);
    }
  }
}
