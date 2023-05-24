package com.rocket.contentcalendar.repository;

import com.rocket.contentcalendar.model.Content;
import com.rocket.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findAllByTitleContains(String keyword);
    @Query("""
        SELECT * FROM Content
        where status = :status
    """)
    List<Content> listByStatus(Status status);
}
