package com.swp.birthdaybuddy.BirthdayBuddy.service;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.PartyDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PartyService {
    PartyDTO createParty(PartyDTO partyDTO);
    void deleteParty(Long partyID);
    PartyDTO getParty(Long partyId);
    List<PartyDTO> getAllParties();
}
