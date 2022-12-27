package alperen.ozil.composenotes.feature_note.domain.usecases

import alperen.ozil.composenotes.feature_note.domain.model.Note
import alperen.ozil.composenotes.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}