 package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map<Long,BatchEntry> batchentries = new HashMap<>();

    //HTTP:GET;
    //select * from batches;
    //R:Read
    @GetMapping
    public List<BatchEntry> getAll()
    {
        return new ArrayList<>(batchentries.values());
    }
    //HTTP:POST;
    //C:create
    //insert into batches values(1,"PPA",25000)
    @PostMapping
    public boolean createEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(),myentry);
        return true;
    }
    //HTTP:GET;
    //R:Read;
    //select * from batches where id = 1;
    @GetMapping("/id/{myid}")
    public  BatchEntry getBatchEntryById(@PathVariable Long myid)
    {
        return batchentries.get(myid);
    }
    //HTTP:Delete;
    //D:Delete;
    //delete from bataches where id = 1;
    @DeleteMapping("/id/{myid}")
    public  BatchEntry deleteEntryBYId(@PathVariable Long myid)
    {
        return  batchentries.remove(myid);
    }

    ////HTTP:PUT;
    //U:UPDATE
    //update batches set fees = 30000 where id = 1;
    @PutMapping("/id/{myid}")
    public BatchEntry updateEntryById(@PathVariable Long myid,BatchEntry myentry)
    {
        return batchentries.put(myid, myentry);
    }
}