package com.tamnd.suzume.ui.stub

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.tamnd.suzume.R
import com.tamnd.suzume.ui.theme.SuzumeTheme

@Composable
fun StubScreen(
    @StringRes labelRes: Int,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = stringResource(labelRes),
            style = MaterialTheme.typography.headlineMedium,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun StubScreenPreview() {
    SuzumeTheme {
        StubScreen(labelRes = R.string.tab_home)
    }
}
