package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "medicine_unit")
public class MedicineUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicineUnitId;
    private String medicineUnitName;
    @OneToMany(mappedBy = "medicine")
    private List<Medicine> medicineList;

    public MedicineUnit() {
    }

    public Integer getMedicineUnitId() {
        return medicineUnitId;
    }

    public void setMedicineUnitId(Integer medicineUnitId) {
        this.medicineUnitId = medicineUnitId;
    }

    public String getMedicineUnitName() {
        return medicineUnitName;
    }

    public void setMedicineUnitName(String medicineUnitName) {
        this.medicineUnitName = medicineUnitName;
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
}
