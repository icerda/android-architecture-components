package com.ccit.roomwordsample.db;

import android.content.Context;

import com.ccit.roomwordsample.db.dao.WordDao;
import com.ccit.roomwordsample.db.entity.Word;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {
        Word.class
},version = 1)
public abstract class WordRoomDatabase extends RoomDatabase {

    public abstract WordDao wordDao();

    private static volatile WordRoomDatabase INSTANCE;

    public static WordRoomDatabase getDataBase(final Context context){
        if(INSTANCE == null){
            synchronized (WordRoomDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            WordRoomDatabase.class,"word_database")
                            .build();
                }
            }

        }
        return INSTANCE;
    }


}
