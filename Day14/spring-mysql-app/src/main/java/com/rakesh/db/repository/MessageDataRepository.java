package com.rakesh.db.repository;

import com.rakesh.db.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

