package o;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: o.mr  reason: case insensitive filesystem */
public class C3605mr extends C0779 {
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        Cursor query = super.query(uri, strArr, str, strArr2, str2);
        if (query == null) {
            return null;
        }
        String[] columnNames = query.getColumnNames();
        int length = columnNames.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strArr3 = (String[]) Arrays.copyOf(columnNames, columnNames.length + 1);
                strArr3[columnNames.length] = "_data";
                break;
            } else if ("_data".equals(columnNames[i])) {
                strArr3 = columnNames;
                break;
            } else {
                i++;
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr3, query.getCount());
        query.moveToPosition(-1);
        while (query.moveToNext()) {
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            for (int i2 = 0; i2 < columnNames.length; i2++) {
                newRow.add(query.getString(i2));
            }
        }
        query.close();
        return matrixCursor;
    }
}
