//package test.kiko.com.dagger2.di
//
//import android.app.Application
//import dagger.BindsInstance
//import dagger.Component
//import test.kiko.com.dagger2.base.DaggerApp
//import javax.inject.Singleton
//
//@Singleton
//@Component(modules = [AppModule::class])
//interface AppComponent {
//
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: Application): Builder
//
//        fun build(): AppComponent
//    }
//
//    fun inject(app: DaggerApp)
//}
