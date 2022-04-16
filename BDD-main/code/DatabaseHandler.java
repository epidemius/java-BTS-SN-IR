package xan.kpint.bdd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {

    private SQLiteDatabase mBb;
    private static Context MCtx;

    private static final String DATABASE_NAME = "location.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "vehicule";
    private static final String C_MARQUE = "marque";
    private static final String C_MODELE = "marque";
    private static final int NUM_C_ID = 0;
    private static final int NUM_C_MARQUE = 1;

    private static final String CREATE_BDD = "CREATE TABLE IF NOT EXISTS vehicule ( "
            + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "marque TEXT NOT NULL)";

    private static final String TAG = "Adapter";

    private static DatabaseHandler mInstance = null;

    public DatabaseHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public static DatabaseHandler getmInstance(Context context) {
        if (mInstance == null) {
            mInstance = new DatabaseHandler(context.getApplicationContext());
        }
        return mInstance;
    }

    DatabaseHandler (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.w(TAG, CREATE_BDD);

        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        Log.w(TAG, "Mise à jour de la base " + oldVersion + "to"
                + newVersion + " destruction de la base ...");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public DatabaseHandler open() throws SQLException {
        this.getWritableDatabase();
        return this;
    }
    public void close() {
        if (this !=null) {
            this.close();
        }
    }
    public long insertVehicule(SQLiteDatabase db, String marque) {

        ContentValues initialValues = new ContentValues();
        initialValues.put(C_MARQUE, marque);
        return db.insert(TABLE_NAME, null, initialValues);
    }

    public Cursor fetchAllVehicule(SQLiteDatabase db) {

        Cursor mCursor = db.rawQuery("SELECT * FROM vehicule", null);

        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }
}