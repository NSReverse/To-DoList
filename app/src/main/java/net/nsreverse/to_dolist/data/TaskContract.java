package net.nsreverse.to_dolist.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Robert on 5/23/2017.
 */

public class TaskContract {

    public static final String AUTHORITY = "net.nsreverse.to_dolist";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);
    public static final String PATH_TASKS = "tasks";

    public static final class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "tasks";

        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_PRIORITY = "priority";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TaskContract.PATH_TASKS).build();
    }
}
