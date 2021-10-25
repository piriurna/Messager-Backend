package com.piriurna.messenger.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piriurna.messenger.data.models.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
