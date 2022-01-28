package com.akasaka.blog.service;

import com.akasaka.blog.vo.CategoryVo;
import com.akasaka.blog.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
