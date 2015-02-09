package com.dinidesign;

import javax.persistence.*;

/**
 * Created by alina on 09.02.15.
 */
@Entity
@Table(name = "foods", schema = "public", catalog = "db")
public class FoodsEntity {
    private int id;
    private String name;
    private Integer proteins;
    private Integer fats;
    private Integer carbohydrates;
    private Integer calories;
    private String type;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "proteins")
    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        this.proteins = proteins;
    }

    @Basic
    @Column(name = "fats")
    public Integer getFats() {
        return fats;
    }

    public void setFats(Integer fats) {
        this.fats = fats;
    }

    @Basic
    @Column(name = "carbohydrates")
    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @Basic
    @Column(name = "calories")
    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodsEntity that = (FoodsEntity) o;

        if (id != that.id) return false;
        if (calories != null ? !calories.equals(that.calories) : that.calories != null) return false;
        if (carbohydrates != null ? !carbohydrates.equals(that.carbohydrates) : that.carbohydrates != null)
            return false;
        if (fats != null ? !fats.equals(that.fats) : that.fats != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (proteins != null ? !proteins.equals(that.proteins) : that.proteins != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (proteins != null ? proteins.hashCode() : 0);
        result = 31 * result + (fats != null ? fats.hashCode() : 0);
        result = 31 * result + (carbohydrates != null ? carbohydrates.hashCode() : 0);
        result = 31 * result + (calories != null ? calories.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
