package tries.joco.kite.com.greendaocursorp1;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.CursorAdapter;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends AppCompatActivity {

    private ProbaDao probaDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaoSession daoSession = ((GdcursorApp)getApplication()).getDaoSession();
        probaDao = daoSession.getProbaDao();

        Proba p = new Proba();
        p.setName("Józsi");
        probaDao.save(p);

        Proba p1 = new Proba();
        p1.setName("Józsi1");
        probaDao.save(p1);
        Proba p2 = new Proba();
        p2.setName("Józsi2");
        probaDao.save(p2);
        Proba p3 = new Proba();
        p3.setName("Józsi3");
        probaDao.save(p3);
        Proba p4 = new Proba();
        p4.setName("Józsi4");
        probaDao.save(p4);




        AutoCompleteTextView actvName = (AutoCompleteTextView) findViewById(R.id.actvName);

        Cursor cursor = probaDao.queryBuilder().where(ProbaDao.Properties.Name.isNotNull()).buildCursor().query();

        actvName.setAdapter(new SimpleCursorAdapter(this,android.R.layout.simple_list_item_1,
                cursor,
                new String[] { "NAME" },
                new int[] { android.R.id.text1 }, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER));


    }
}
