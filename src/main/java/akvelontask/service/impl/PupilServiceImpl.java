package akvelontask.service.impl;

import akvelontask.dao.PupilDao;
import akvelontask.entity.Pupil;
import akvelontask.service.PupilService;
import akvelontask.util.Factory;

import java.util.List;

public class PupilServiceImpl implements PupilService {

    public boolean addPupil(Pupil pupil) {
        final PupilDao pupilDao = Factory.getInstance().getPupilDao();
        return pupilDao.addPupil(pupil);
    }

    public boolean deletePupil(int id) {
        final PupilDao pupilDao = Factory.getInstance().getPupilDao();
        Pupil pupilToDelete = pupilDao.getPupil(id);
        return pupilDao.deletePupil(pupilToDelete);
    }

    public boolean updatePupil(Pupil pupil) {
        final PupilDao pupilDao = Factory.getInstance().getPupilDao();
        return pupilDao.updatePupil(pupil);
    }

    public Pupil getPupil(int id) {
        final PupilDao pupilDao = Factory.getInstance().getPupilDao();
        return pupilDao.getPupil(id);
    }

    public List<Pupil> getPupils() {
        final PupilDao pupilDao = Factory.getInstance().getPupilDao();
        return pupilDao.getPupils();
    }
}
