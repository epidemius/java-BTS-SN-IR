package xan.kpint.bdd;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import androidx.constraintlayout.helper.widget.Layer;

import org.w3c.dom.Text;

public class VehiculeAdapter extends CursorAdapter {

    public VehiculeAdapter(Context context, Cursor cursor, int flag) {
        super(context, cursor, 0);}

    public void bindView(View view, Context context, Cursor cursor) {
        TextView vehMarque = (TextView) view.findViewById(R.id.tvMarque);
        String marque = cursor.getString(cursor.getColumnIndexOrThrow("marque"));
        vehMarque.setText(marque);
    }

    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.vehicule_items, parent, false);
    }
}
