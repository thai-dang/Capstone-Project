package com.android.udacity_foodquest.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.android.udacity_foodquest.data.local.dao.FavRestaurantDao;
import com.android.udacity_foodquest.data.local.entity.CommonRestaurant;

@Database(entities = {CommonRestaurant.class}, version = 1, exportSchema = false)
public abstract class FoodQuestDatabase extends RoomDatabase {

    public abstract FavRestaurantDao favRestaurantDao();
}
