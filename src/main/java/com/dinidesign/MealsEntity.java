package com.dinidesign;

import javax.persistence.*;

/**
 * Created by alina on 09.02.15.
 */
@Entity
@Table(name = "meals", schema = "public", catalog = "db")
public class MealsEntity {
    private Integer idActivity;
    private Integer idFood;
    private int id;



    @Basic
    @Column(name = "id_activity")
    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    @Basic
    @Column(name = "id_food")
    public Integer getIdFood() {
        return idFood;
    }

    public void setIdFood(Integer idFood) {
        this.idFood = idFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MealsEntity that = (MealsEntity) o;

        if (idActivity != null ? !idActivity.equals(that.idActivity) : that.idActivity != null) return false;
        if (idFood != null ? !idFood.equals(that.idFood) : that.idFood != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActivity != null ? idActivity.hashCode() : 0;
        result = 31 * result + (idFood != null ? idFood.hashCode() : 0);
        return result;
    }



    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
