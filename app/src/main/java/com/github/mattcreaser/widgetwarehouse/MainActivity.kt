package com.github.mattcreaser.widgetwarehouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amplifyframework.ui.authenticator.rememberAuthenticatorState
import com.amplifyframework.ui.authenticator.ui.Authenticator
import com.example.compose.AppTheme
import com.github.mattcreaser.widgetwarehouse.ui.WidgetWarehouseApp
import com.github.mattcreaser.widgetwarehouse.ui.WidgetWarehouseHeader
import com.github.mattcreaser.widgetwarehouse.ui.signedIn

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                val authenticatorState = rememberAuthenticatorState(
                    signUpForm = {
// Add custom attributes to your user pool
// https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-custom-attributes
// and then use the signUpForm to customize the client-side experience
//                        text(
//                            key = FieldKey.Custom("badgeId"),
//                            label = "Badge Id",
//                            required = true,
//                            validator = {
//                                if (content.matches(Regex("[0-9]{5}"))) {
//                                    null
//                                } else {
//                                    FieldError.InvalidFormat
//                                }
//                            }
//                        )
//                        text(
//                            key = FieldKey.Custom("position"),
//                            label = "Position"
//                        )
                    }
                )

                Column(modifier = Modifier.fillMaxSize()) {
                    if (!authenticatorState.signedIn) {
                        WidgetWarehouseHeader()
                    }
                    Authenticator(
                        modifier = Modifier
                            .weight(1f)
                            .padding(top = 16.dp),
                        state = authenticatorState
                    ) { signedInState ->
                        WidgetWarehouseApp()
                    }
                }
            }
        }
    }
}
