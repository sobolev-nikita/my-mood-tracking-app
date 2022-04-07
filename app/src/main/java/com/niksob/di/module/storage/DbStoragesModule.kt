package com.niksob.di.module.storage

import com.google.firebase.database.DatabaseReference
import com.niksob.data.storage.db.DbUserStorage
import com.niksob.data.storage.db.firebase.DbUserFirebase
import com.niksob.data.storage.string.StringStorage
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module(includes = [FirebaseModule::class, StringStorageModule::class])
class DbStoragesModule {
    @Provides
    fun provideDbUserStorage(
        @Named("users_db_ref") dbUserRef: DatabaseReference,
        stringStorage: StringStorage,
    ): DbUserStorage =
        DbUserFirebase(dbUserRef, stringStorage)
}