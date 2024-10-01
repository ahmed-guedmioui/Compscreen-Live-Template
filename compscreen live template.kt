@androidx.compose.runtime.Composable

fun $NAME$ScreenCore(
    viewModel: $VIEWMODEL$ = org.koin.androidx.compose.koinViewModel()
) {
    $NAME$Screen(
        state = viewModel.state,
        onAction = viewModel::onAction
    )
}

@androidx.compose.runtime.Composable
private fun $NAME$Screen(
    state: $STATE_CLASS$,
    onAction: ($ACTION_CLASS$) -> Unit
) {
    $END$
}

@androidx.compose.ui.tooling.preview.Preview
@androidx.compose.runtime.Composable
private fun $NAME$ScreenPreview() {
    $THEME$ {
        $NAME$Screen(
            state = $STATE_CLASS$(),
            onAction = {}
        )
    }
}