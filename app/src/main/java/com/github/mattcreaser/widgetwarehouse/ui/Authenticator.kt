package com.github.mattcreaser.widgetwarehouse.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.amplifyframework.ui.authenticator.AuthenticatorState
import com.amplifyframework.ui.authenticator.SignedInState
import com.github.mattcreaser.widgetwarehouse.R

@Composable
fun WidgetWarehouseHeader() {
    Image(
        modifier = Modifier.fillMaxWidth(),
        painter = painterResource(R.drawable.logo),
        contentDescription = stringResource(R.string.app_name),
        contentScale = ContentScale.FillWidth
    )
}

val AuthenticatorState.signedIn: Boolean
    get() = this.stepState is SignedInState
