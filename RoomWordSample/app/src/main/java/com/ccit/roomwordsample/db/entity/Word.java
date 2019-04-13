package com.ccit.roomwordsample.db.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private Integer id;

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;



/*public Word(@NonNull String word) {
        this.mWord = word;
    }
*/

    public String getWord() {
        return this.mWord;
    }

    public void setWord(@NonNull String mWord) {
        this.mWord = mWord;

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(@NonNull Integer id) {
        this.id = id;
    }
}
