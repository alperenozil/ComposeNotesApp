package alperen.ozil.composenotes.feature_note.presentation.util

sealed class Screen(val route: String) {
    object NotesScreen: Screen("notes_screen")
    object AddOrEditNoteScreen: Screen("add_or_edit_note_screen")
}