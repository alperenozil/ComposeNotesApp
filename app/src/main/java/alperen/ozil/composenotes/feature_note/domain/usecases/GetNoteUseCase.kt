package alperen.ozil.composenotes.feature_note.domain.usecases

import alperen.ozil.composenotes.feature_note.domain.model.Note
import alperen.ozil.composenotes.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}