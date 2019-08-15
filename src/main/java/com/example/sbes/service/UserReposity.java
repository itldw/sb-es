package com.example.sbes.service;

import com.example.sbes.entry.User;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 17:07 2019/8/15
 * @Modified By :
 */

@Component
public interface UserReposity extends ElasticsearchRepository<User,String> {


}
