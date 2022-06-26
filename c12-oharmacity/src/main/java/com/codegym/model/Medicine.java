package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "medicine")
public class Medicine {
    @Id
    @Column(columnDefinition = "VARCHAR(20)")
    private String medicine_id;
    private String medicine_name;
    private String medicine_active_ingredients;
    private Integer medicine_quantity;
    private Double medicine_import_price;
    private Double medicine_wholesale_price;
    private Double medicine_retail_price;
    private Double medicine_discount;
    private Double medicine_wholesale_profit;
    private Double medicine_retail_sale_profit;
    private Double medicine_tax;
    @Column(columnDefinition = "BIT")
    private boolean flag;
    @ManyToOne
    @JoinColumn (name = "medicine_type_id",referencedColumnName = "medicineTypeId")
    private MedicineType medicineType;
    @ManyToOne
    @JoinColumn (name = "medicine_unit_id",referencedColumnName = "medicineUnitId")
    private MedicineUnit medicineUnit;
    @ManyToOne
    @JoinColumn (name = "medicine_conversion_unit_id",referencedColumnName = "medicineConversionUnitId")
    private MedicineConversionUnit medicineConversionUnit;

    public Medicine() {
    }

    public String getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(String medicine_id) {
        this.medicine_id = medicine_id;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getMedicine_active_ingredients() {
        return medicine_active_ingredients;
    }

    public void setMedicine_active_ingredients(String medicine_active_ingredients) {
        this.medicine_active_ingredients = medicine_active_ingredients;
    }

    public Integer getMedicine_quantity() {
        return medicine_quantity;
    }

    public void setMedicine_quantity(Integer medicine_quantity) {
        this.medicine_quantity = medicine_quantity;
    }

    public Double getMedicine_import_price() {
        return medicine_import_price;
    }

    public void setMedicine_import_price(Double medicine_import_price) {
        this.medicine_import_price = medicine_import_price;
    }

    public Double getMedicine_wholesale_price() {
        return medicine_wholesale_price;
    }

    public void setMedicine_wholesale_price(Double medicine_wholesale_price) {
        this.medicine_wholesale_price = medicine_wholesale_price;
    }

    public Double getMedicine_retail_price() {
        return medicine_retail_price;
    }

    public void setMedicine_retail_price(Double medicine_retail_price) {
        this.medicine_retail_price = medicine_retail_price;
    }

    public Double getMedicine_discount() {
        return medicine_discount;
    }

    public void setMedicine_discount(Double medicine_discount) {
        this.medicine_discount = medicine_discount;
    }

    public Double getMedicine_wholesale_profit() {
        return medicine_wholesale_profit;
    }

    public void setMedicine_wholesale_profit(Double medicine_wholesale_profit) {
        this.medicine_wholesale_profit = medicine_wholesale_profit;
    }

    public Double getMedicine_retail_sale_profit() {
        return medicine_retail_sale_profit;
    }

    public void setMedicine_retail_sale_profit(Double medicine_retail_sale_profit) {
        this.medicine_retail_sale_profit = medicine_retail_sale_profit;
    }

    public Double getMedicine_tax() {
        return medicine_tax;
    }

    public void setMedicine_tax(Double medicine_tax) {
        this.medicine_tax = medicine_tax;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public MedicineType getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(MedicineType medicineType) {
        this.medicineType = medicineType;
    }

    public MedicineUnit getMedicineUnit() {
        return medicineUnit;
    }

    public void setMedicineUnit(MedicineUnit medicineUnit) {
        this.medicineUnit = medicineUnit;
    }

    public MedicineConversionUnit getMedicineConversionUnit() {
        return medicineConversionUnit;
    }

    public void setMedicineConversionUnit(MedicineConversionUnit medicineConversionUnit) {
        this.medicineConversionUnit = medicineConversionUnit;
    }
}
