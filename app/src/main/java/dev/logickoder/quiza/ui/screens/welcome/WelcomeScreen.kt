package dev.logickoder.quiza.ui.screens.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.logickoder.quiza.R
import dev.logickoder.quiza.ui.theme.dimens

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier
) = Column(
    modifier = modifier
        .fillMaxSize()
        .padding(dimens(id = R.dimen.padding)),
    verticalArrangement = Arrangement.Bottom,
) {

}
