 package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import com.marvellous.MarvellousPortal.Service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

 @RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    @Autowired
    private BatchEntryService batchEntryService;

    @GetMapping
    public List <BatchEntry> getAll()
    {
        return batchEntryService.getAll();
    }

    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        batchEntryService.saveEntry(myentry);
        return "Document Inserted Successfully";
    }

    @GetMapping("/id/{myid}")
    public Optional<BatchEntry> getBatchEntryById(@PathVariable ObjectId myid)
    {
        return batchEntryService.findById(myid);
    }

    @DeleteMapping("/id/{myid}")
    public boolean  deleteEntryBYId(@PathVariable ObjectId myid)
    {
        batchEntryService.deleteById(myid);
        return  true;
    }


    @PutMapping("/id/{myid}")
    public void updateEntryById(@PathVariable ObjectId myid,BatchEntry myentry)
    {
    }
}