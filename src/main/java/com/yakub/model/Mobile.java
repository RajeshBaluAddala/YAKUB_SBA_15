package com.yakub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobileId;
    private String mobileName;
    private int ram;
    private int rom;
    private String fCam;
    private String bCam;

    public Mobile() {
    }

    public Mobile(int mobileId, String mobileName, int ram, int rom, String fCam, String bCam) {
        this.mobileId = mobileId;
        this.mobileName = mobileName;
        this.ram = ram;
        this.rom = rom;
        this.fCam = fCam;
        this.bCam = bCam;
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getfCam() {
        return fCam;
    }

    public void setfCam(String fCam) {
        this.fCam = fCam;
    }

    public String getbCam() {
        return bCam;
    }

    public void setbCam(String bCam) {
        this.bCam = bCam;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileId=" + mobileId +
                ", mobileName='" + mobileName + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", fCam='" + fCam + '\'' +
                ", bCam='" + bCam + '\'' +
                '}';
    }
}
