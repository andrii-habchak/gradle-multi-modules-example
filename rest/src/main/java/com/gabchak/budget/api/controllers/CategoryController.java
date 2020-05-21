package com.gabchak.budget.api.controllers;

import com.gabchak.budget.service.dto.CategoryDto;
import com.gabchak.budget.service.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {
  private final CategoryService categoryService;

  @PostMapping("/insert")
  public ResponseEntity<CategoryDto> insert(@RequestBody CategoryDto categoryDto) {
    return ResponseEntity.ok(categoryService.save(categoryDto));
  }

  @PutMapping("/update")
  public ResponseEntity<CategoryDto> update(@RequestBody CategoryDto categoryDto) {
    return ResponseEntity.ok(categoryService.save(categoryDto));
  }

  @DeleteMapping("/{id}")
  public void deleteById(@RequestParam("id") Integer id) {
    categoryService.deleteById(id);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CategoryDto> findById(@RequestParam("id") Integer id) {
    return categoryService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @GetMapping
  public ResponseEntity<Collection<CategoryDto>> findAll() {
    return ResponseEntity.ok(categoryService.findAll());
  }
}
