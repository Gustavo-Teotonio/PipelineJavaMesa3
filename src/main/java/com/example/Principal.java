package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
public class Principal {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("default");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        //--------------------------------------------------------Select---------------------------------------------------------//
//sla        
//Para qualquer transação no banco, devemos começar com o begin,
//        em.getTransaction().begin();
//        Departamento dept = em.find(Departamento.class, 30);
//        System.out.println(dept);
//
//        em.getTransaction().begin();
//        Departamento dept2 = em.find(Departamento.class, 40);
//        System.out.println(dept2);
//        em.getTransaction().commit();
//
//        em.close();
//        emf.close();

        //--------------------------------------------------------Insert---------------------------------------------------------//
        Departamento dept1 = new Departamento();
//        dept1.setdName("Batom");
//        dept1.setDeptno(85);
//        dept1.setLoc("Osasco");
//
//        em.getTransaction().begin(); //Iniciando a transação dentro do banco
//        em.persist(dept1); //Dando um persist para inserir os dados no banco
//        em.getTransaction().commit(); //Oficianlizando a transação dentro do banco

//        em.getTransaction().begin();
//        System.out.println(em.find(Departamento.class, 85));
//        em.getTransaction().commit();
        //--------------------------------------------------------update---------------------------------------------------------//
         em.getTransaction().begin();
         dept1 = em.find(Departamento.class, 85);
         dept1.setdName("Administrativo");
         System.out.println(em.find(Departamento.class, 85));
         em.getTransaction().commit();
         //Novo comentario
         //Novo comentário 2

        //--------------------------------------------------------Delete---------------------------------------------------------//
//        em.getTransaction().begin();
//        dept1 = em.find(Departamento.class, 85);
//        em.remove(dept1);
//        em.getTransaction().commit();

        //--------------------------------------------------------Select---------------------------------------------------------//
//        Query query = em.createQuery("Select dept1 from Departamento dept1 Order by dept1.deptno");
//        List<Departamento> departamentos = query.getResultList();
//
//        for (Departamento dpto: departamentos) {
//            System.out.println(dpto);
//        }
        System.out.println(em.find(Departamento.class, 40));
//        String cidade = "Osasco";
//        Query query = em.createQuery("Select dept1 from Departamento dept1 Where dept1.loc = :local Order by dept1.deptno"); //JPQL
//        query.setParameter("local", "o"); //Declaramos o nome do parâmetro, junto com a variável
//        List<Departamento> departamentos = query.getResultList();
//
//        for (Departamento dpto: departamentos) {
//            System.out.println(dpto.getDeptno());
//        }
    }
}
