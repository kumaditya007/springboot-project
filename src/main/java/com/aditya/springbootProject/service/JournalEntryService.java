package com.aditya.springbootProject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.aditya.springbootProject.entity.JournalEntry;
import com.aditya.springbootProject.repository.JournalEntryRepository;

@Component
public class JournalEntryService {

  @Autowired
  private JournalEntryRepository journalEntryRepository;

  public void saveEntry(JournalEntry journalEntry) {

    journalEntryRepository.save(journalEntry);

  }

  public List<JournalEntry> getAll() {

    return journalEntryRepository.findAll();

  }


}
