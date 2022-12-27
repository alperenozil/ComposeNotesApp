package alperen.ozil.composenotes.feature_note.presentation.addoreditnotes

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)