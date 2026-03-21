package com.aditya.springbootProject.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aditya.springbootProject.Entity.JournalEntry;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

  private Map<Long, JournalEntry> journalEnteries = new HashMap<>();

  @GetMapping
  public List<JournalEntry> getAll() {

    return new ArrayList<>(journalEnteries.values());

  }

  @PostMapping
  public boolean createEntry(@RequestBody JournalEntry newEntry) {

    journalEnteries.put(newEntry.getId(), newEntry);

    return true;

  }

  @GetMapping("/id/{myId}")
  public JournalEntry getJournalEntryById(@PathVariable Long myId) {

    return journalEnteries.get(myId);

  }

  @DeleteMapping("/id/{myId}")
  public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {

    return journalEnteries.remove(myId);

  }

  @PutMapping("/id/{myId}")
  public JournalEntry updateJournalEntryById(@PathVariable Long myId,
      @RequestBody JournalEntry newEntry) {

    return journalEnteries.put(myId, newEntry);

  }

}
