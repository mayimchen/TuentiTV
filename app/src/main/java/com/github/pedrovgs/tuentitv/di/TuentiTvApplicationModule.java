package com.github.pedrovgs.tuentitv.di;

import com.github.pedrovgs.tuentitv.model.Accounts;
import com.github.pedrovgs.tuentitv.model.Agenda;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */

@Module(library = true) public class TuentiTvApplicationModule {

  @Provides @Singleton Accounts provideAccounts() {
    return new Accounts();
  }

  @Provides @Singleton Agenda provideAgenda() {
    return new Agenda();
  }

}