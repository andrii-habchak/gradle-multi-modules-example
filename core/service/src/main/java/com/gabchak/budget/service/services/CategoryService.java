package com.gabchak.budget.service.services;

import com.gabchak.budget.service.dto.CategoryDto;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

  CategoryDto save(CategoryDto categoryDto);

  Optional<CategoryDto> findById(Integer id);

  void deleteById(Integer id);

  List<CategoryDto> findAll();
}
