package com.yakub.controller;

import com.yakub.model.Mobile;
import com.yakub.repo.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MobielController {

    @Autowired
    private MobileRepo mobileRepo;

    @PostMapping("/save")
    private Mobile saveStudent(@RequestBody Mobile mobile){
        return mobileRepo.save(mobile);
    }

    @DeleteMapping("/delete/{mobileId}")
    private void delete(@PathVariable int mobileId){
        mobileRepo.deleteById(mobileId);
    }

    @GetMapping("/get/{mobileId}")
    private Mobile getOne(@PathVariable int mobileId){
        return mobileRepo.findById(mobileId).get();
    }

    @GetMapping("/getAll")
    private List<Mobile> getAll(){
        return mobileRepo.findAll();
    }

    @PutMapping("/update/{mobileId}")
    private Mobile update(@RequestBody Mobile mobile, @PathVariable int mobileId){

        Mobile m1=mobileRepo.findById(mobileId).get();
        m1.setMobileName(mobile.getMobileName());
        m1.setRam(mobile.getRam());
        m1.setRom(mobile.getRom());
        m1.setfCam(mobile.getfCam());
        m1.setbCam(mobile.getbCam());

        return mobileRepo.save(m1);
    }
}
