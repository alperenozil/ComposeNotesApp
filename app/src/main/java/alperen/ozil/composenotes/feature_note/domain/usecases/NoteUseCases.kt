package alperen.ozil.composenotes.feature_note.domain.usecases

data class NoteUseCases(
    val addNoteUseCase: AddNoteUseCase,
    val getNotesUseCase: GetNotesUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase
)
