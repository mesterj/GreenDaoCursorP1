package tries.joco.kite.com.greendaocursorp1;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * Created by meste on 2018. 03. 19..
 */

public class GdcursorApp extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this,"proba");
        Database db = devOpenHelper.getWritableDb();

        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }


}
