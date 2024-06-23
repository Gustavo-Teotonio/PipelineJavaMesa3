package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "dept")
public class Departamento {
    @Id
    //@Column (name = "deptno") -> Quando o nome da variavel não está igual ao nome da coluna do banco, devemos declarar a anotação column
    private double deptno;
    private String dName;
    private String loc;

    public double getDeptno() {
        return deptno;
    }

    public void setDeptno(double deptno) {
        this.deptno = deptno;
    }

    public String getdName() {
        return this.dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return this.loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    //ToString
    public String toString(){
        return "Id Dept: " + this.deptno + "\nNome Depto: " + this.dName +
                "\nLocalização: " + this.loc;
    }
}
