package tries.joco.kite.com.greendaocursorp1;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by meste on 2018. 03. 20..
 */

public class NevCursorAdapter extends CursorAdapter {

    private LayoutInflater cursorInflater;

    public NevCursorAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
        cursorInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return cursorInflater.inflate(R.layout.nev_item,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView idText = view.findViewById(R.id.tvId);
        TextView nameText = view.findViewById(R.id.tvNev);
        String szin = cursor.getString(cursor.getColumnIndex("SZIN"));
        idText.setText(szin);
        nameText.setText(cursor.getString(cursor.getColumnIndex("NAME")));

    }

    @Override
    public CharSequence convertToString(Cursor cursor) {
        int j = cursor.getColumnIndex("NAME");
        return cursor.getString(j);
    }

    @Override
    public Cursor runQueryOnBackgroundThread(CharSequence constraint) {
        return super.runQueryOnBackgroundThread(constraint);
    }
}
