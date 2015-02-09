package akvelontask.util;

import akvelontask.dao.PupilDao;
import akvelontask.dao.impl.PupilDaoImpl;

public class Factory {
    private static Factory singleFactoryInstance = new Factory();
    private PupilDao singlePupilDaoInstance = null;

    private Factory() {
    }

    public static synchronized Factory getInstance() {
        return singleFactoryInstance;
    }

    public synchronized PupilDao getPupilDao() {
        if (singlePupilDaoInstance == null) {
            singlePupilDaoInstance = new PupilDaoImpl();
        }
        return singlePupilDaoInstance;
    }


}
