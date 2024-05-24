package com.ozman.composetutorial1.di

import com.ozman.composetutorial1.data.datasource.remote.ApiService
import com.ozman.composetutorial1.data.repository.LoginRepositoryImp
import com.ozman.composetutorial1.domain.repositoryinterface.LoginRepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideLoginRepository(apiService: ApiService): LoginRepositoryInterface {
        return LoginRepositoryImp(apiService)
    }
}