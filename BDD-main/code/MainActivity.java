package xan.kpint.bdd;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DatabaseHandler dbHandler = null;
    private VehiculeAdapter dataAdapter;

    private SQLiteDatabase location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHandler = DatabaseHandler.getmInstance(getApplicationContext());

        location = dbHandler.getWritableDatabase();

        dbHandler.insertVehicule(location, "Renault");
        dbHandler.insertVehicule(location, "VR");
        dbHandler.insertVehicule(location, "Peugeot");
        dbHandler.insertVehicule(location, "Audi");


        ListView mListView = (ListView) findViewById(R.id.listview);

        Cursor curs = location.rawQuery("SELECT * FROM vehicule", null);


        if (curs.getCount() >0){
            Toast.makeText(this, "Table OK", Toast.LENGTH_SHORT).show();
        }

        if (curs != null) {
            dataAdapter = new VehiculeAdapter(getApplicationContext(), curs, 0);
            mListView.setAdapter(dataAdapter);
        }
    }
}