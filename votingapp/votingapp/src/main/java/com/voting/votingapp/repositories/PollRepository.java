package com.voting.votingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.voting.votingapp.model.Poll;

public interface PollRepository extends JpaRepository<Poll, Long> {
}
