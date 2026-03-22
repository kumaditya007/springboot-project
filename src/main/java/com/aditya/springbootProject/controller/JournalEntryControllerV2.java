package com.aditya.springbootProject.controller;

import java.time.LocalDateTime;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aditya.springbootProject.entity.JournalEntry;
import com.aditya.springbootProject.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

  @Autowired
  private JournalEntryService journalEntryService;

  @GetMapping
  public List<JournalEntry> getAll() {


    return journalEntryService.getAll();

  }

  @PostMapping
  public void createEntry(@RequestBody JournalEntry newEntry) {

    newEntry.setDate(LocalDateTime.now());

    journalEntryService.saveEntry(newEntry);


  }

  @GetMapping("/id/{myId}")
  public JournalEntry getJournalEntryById(@PathVariable String myId) {

    return null;

  }

  @DeleteMapping("/id/{myId}")
  public JournalEntry deleteJournalEntryById(@PathVariable ObjectId myId) {

    return null;

  }

  @PutMapping("/id/{myId}")
  public JournalEntry updateJournalEntryById(@PathVariable Long myId,
      @RequestBody JournalEntry newEntry) {

    return null;

  }

}
