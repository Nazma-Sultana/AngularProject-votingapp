package com.voting.votingapp.request;
import lombok.*;
@Data
@NoArgsConstructor
public class Vote {
	private Long pollId;
	private int optionIndex;
	

}
