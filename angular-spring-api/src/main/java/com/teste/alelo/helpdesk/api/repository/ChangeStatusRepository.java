package com.teste.alelo.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.teste.alelo.helpdesk.api.security.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
