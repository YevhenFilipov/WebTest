package akvelontask.dao.impl;


import akvelontask.dao.PupilDao;
import akvelontask.entity.Pupil;
import akvelontask.util.SessionUtil;
import org.hibernate.Session;

import java.util.Collections;
import java.util.List;

public class PupilDaoImpl implements PupilDao {


    public boolean addPupil(Pupil pupil) {
        Session session = null;
        try {
            session = SessionUtil.getSession();
            session.beginTransaction();
            session.save(pupil);
            session.getTransaction().commit();
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return false;
    }


    public boolean deletePupil(Pupil pupil) {
        Session session = null;
        try {
            session = SessionUtil.getSession();
            session.beginTransaction();
            session.delete(pupil);
            session.getTransaction().commit();
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return false;
    }


    public boolean updatePupil(Pupil pupil) {
        Session session = null;
        try {
            session = SessionUtil.getSession();
            session.beginTransaction();
            session.update(pupil);
            session.getTransaction().commit();
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return false;
    }


    public Pupil getPupil(int id) {
        Pupil result = null;
        Session session = null;
        try {
            session = SessionUtil.getSession();
            result = (Pupil) session.get(Pupil.class, id);
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    public List<Pupil> getPupils() {
        List<Pupil> result = Collections.emptyList();
        Session session = null;
        try {
            session = SessionUtil.getSession();
            result = session.createCriteria(Pupil.class).list();
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return result;
    }
}
