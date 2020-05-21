package com.gabchak.budget.service.services.impl;

import com.gabchak.budget.dao.model.Category;
import com.gabchak.budget.dao.repository.CategoryRepository;
import com.gabchak.budget.service.dto.CategoryDto;
import com.gabchak.budget.service.mappers.CategoryMapper;
import com.gabchak.budget.service.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository repository;
  private final CategoryMapper mapper;

  @Override
  public CategoryDto save(CategoryDto categoryDto) {
    Category category = mapper.map(categoryDto, Category.class);
    Category saved = repository.save(category);
    return mapper.map(saved, CategoryDto.class);
  }

  @Override
  public Optional<CategoryDto> findById(Integer id) {
    return repository.findById(id)
        .map(category -> mapper.map(category, CategoryDto.class));
  }

  @Override
  public void deleteById(Integer id) {
    repository.deleteById(id);
  }

  @Override
  public List<CategoryDto> findAll() {
    return mapper.mapAsList(repository.findAll(), CategoryDto.class);
  }
}
