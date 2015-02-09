package akvelontask.service;

import akvelontask.entity.Pupil;

import java.util.List;

public interface PupilService {

    boolean addPupil(Pupil pupil);

    boolean deletePupil(int id);

    boolean updatePupil(Pupil pupil);

    Pupil getPupil(int id);

    List<Pupil> getPupils();
}
