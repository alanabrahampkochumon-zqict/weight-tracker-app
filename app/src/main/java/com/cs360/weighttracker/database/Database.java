package com.cs360.weighttracker.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "milestones.db";
    private static final int VERSION = 1;

    private static final class UserTable {
        private static final String TABLE = "users";
        private static final String COL_ID = "_id";

        private static final String COL_USERNAME = "username";
        private static final String COL_PASSWORD_HASH = "password_hash";
    }

    private static final class DailyWeightTable {
        private static final String TABLE = "daily_weight";
        private static final String COL_ID = "_id";

        private static final String COL_WEIGHT = "weight";
        private static final String COL_DATE = "date";

    }


    private static final class GoalWeightTable {
        private static final String TABLE = "goal_weight";
        private static final String COL_ID = "_id";

        private static final String COL_CUR_WEIGHT = "current_weight";
        private static final String COL_GOAL_WEIGHT = "goal_weight";

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
