package com.akasaka.blog.service;

import com.akasaka.blog.vo.Result;
import com.akasaka.blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    /**
     * 查询所有文章标签
     * @return
     */
    Result findAll();

    Result findAllDeatil();

    Result findDeatilById(Long id);
}
