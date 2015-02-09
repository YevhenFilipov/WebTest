package akvelontask.dao;

import akvelontask.entity.Pupil;

import java.util.List;

public interface PupilDao {

    boolean addPupil(Pupil pupil);

    boolean deletePupil(Pupil pupil);

    boolean updatePupil(Pupil pupil);

    Pupil getPupil(int id);

    List<Pupil> getPupils();

}
