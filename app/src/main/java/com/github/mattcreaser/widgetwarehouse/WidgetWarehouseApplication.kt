package com.github.mattcreaser.widgetwarehouse

import android.app.Application
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin
import com.amplifyframework.core.Amplify

class WidgetWarehouseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Amplify.addPlugin(AWSCognitoAuthPlugin())
        Amplify.configure(this)
    }
}
